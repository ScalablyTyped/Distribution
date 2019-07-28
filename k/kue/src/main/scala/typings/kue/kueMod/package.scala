package typings.kue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kueMod {
  type DoneCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]
  type JobCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* job */ js.UndefOr[Job], Unit]
  type ProcessCallback = (js.Function2[/* job */ Job, /* cb */ DoneCallback, Unit]) | (js.Function3[/* job */ Job, /* ctx */ WorkerCtx, /* cb */ DoneCallback, Unit])
}
