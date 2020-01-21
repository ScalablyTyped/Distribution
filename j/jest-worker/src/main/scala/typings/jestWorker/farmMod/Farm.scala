package typings.jestWorker.farmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Farm extends js.Object {
  var _cacheKeys: js.Any
  var _callback: js.Any
  var _computeWorkerKey: js.Any
  var _enqueue: js.Any
  var _getNextTask: js.Any
  var _isLocked: js.Any
  var _last: js.Any
  var _lock: js.Any
  var _locks: js.Any
  var _numOfWorkers: js.Any
  var _offset: js.Any
  var _process: js.Any
  var _push: js.Any
  var _queue: js.Any
  var _unlock: js.Any
  def doWork(method: String, args: js.Any*): js.Promise[_]
}

object Farm {
  @scala.inline
  def apply(
    _cacheKeys: js.Any,
    _callback: js.Any,
    _computeWorkerKey: js.Any,
    _enqueue: js.Any,
    _getNextTask: js.Any,
    _isLocked: js.Any,
    _last: js.Any,
    _lock: js.Any,
    _locks: js.Any,
    _numOfWorkers: js.Any,
    _offset: js.Any,
    _process: js.Any,
    _push: js.Any,
    _queue: js.Any,
    _unlock: js.Any,
    doWork: (String, /* repeated */ js.Any) => js.Promise[_]
  ): Farm = {
    val __obj = js.Dynamic.literal(_cacheKeys = _cacheKeys.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _computeWorkerKey = _computeWorkerKey.asInstanceOf[js.Any], _enqueue = _enqueue.asInstanceOf[js.Any], _getNextTask = _getNextTask.asInstanceOf[js.Any], _isLocked = _isLocked.asInstanceOf[js.Any], _last = _last.asInstanceOf[js.Any], _lock = _lock.asInstanceOf[js.Any], _locks = _locks.asInstanceOf[js.Any], _numOfWorkers = _numOfWorkers.asInstanceOf[js.Any], _offset = _offset.asInstanceOf[js.Any], _process = _process.asInstanceOf[js.Any], _push = _push.asInstanceOf[js.Any], _queue = _queue.asInstanceOf[js.Any], _unlock = _unlock.asInstanceOf[js.Any], doWork = js.Any.fromFunction2(doWork))
  
    __obj.asInstanceOf[Farm]
  }
}

