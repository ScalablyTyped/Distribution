package typings.jestDashWorker.buildFarmMod

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
    computeWorkerKey: js.Function2[/* method */ String, /* repeated */ js.Any, String | Null]
  ) = this()
  /* CompleteClass */
  override var _cacheKeys: js.Any = js.native
  /* CompleteClass */
  override var _callback: js.Any = js.native
  /* CompleteClass */
  override var _computeWorkerKey: js.Any = js.native
  /* CompleteClass */
  override var _enqueue: js.Any = js.native
  /* CompleteClass */
  override var _getNextTask: js.Any = js.native
  /* CompleteClass */
  override var _isLocked: js.Any = js.native
  /* CompleteClass */
  override var _last: js.Any = js.native
  /* CompleteClass */
  override var _lock: js.Any = js.native
  /* CompleteClass */
  override var _locks: js.Any = js.native
  /* CompleteClass */
  override var _numOfWorkers: js.Any = js.native
  /* CompleteClass */
  override var _offset: js.Any = js.native
  /* CompleteClass */
  override var _process: js.Any = js.native
  /* CompleteClass */
  override var _push: js.Any = js.native
  /* CompleteClass */
  override var _queue: js.Any = js.native
  /* CompleteClass */
  override var _unlock: js.Any = js.native
  /* CompleteClass */
  override def doWork(method: String, args: js.Any*): js.Promise[_] = js.native
}

