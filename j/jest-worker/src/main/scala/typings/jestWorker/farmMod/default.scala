package typings.jestWorker.farmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker/build/Farm", JSImport.Default)
@js.native
class default protected () extends Farm {
  def this(numOfWorkers: Double, callback: js.Function) = this()
  def this(
    numOfWorkers: Double,
    callback: js.Function,
    computeWorkerKey: js.UndefOr[js.Function2[/* method */ String, /* repeated */ js.Any, String | Null]]
  ) = this()
}

