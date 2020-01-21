package typings.kue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DoneCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], scala.Unit]
  type JobCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* job */ js.UndefOr[typings.kue.mod.Job], scala.Unit]
  type ProcessCallback = (js.Function2[/* job */ typings.kue.mod.Job, /* cb */ typings.kue.mod.DoneCallback, scala.Unit]) | (js.Function3[
    /* job */ typings.kue.mod.Job, 
    /* ctx */ typings.kue.mod.WorkerCtx, 
    /* cb */ typings.kue.mod.DoneCallback, 
    scala.Unit
  ])
}
