package typings
package kueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kueMod {
  type DoneCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit]
  type JobCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* job */ js.UndefOr[Job], scala.Unit]
  type ProcessCallback = (js.Function2[/* job */ Job, /* cb */ DoneCallback, scala.Unit]) | (js.Function3[/* job */ Job, /* ctx */ WorkerCtx, /* cb */ DoneCallback, scala.Unit])
}
