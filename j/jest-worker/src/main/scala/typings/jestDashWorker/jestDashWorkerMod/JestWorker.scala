package typings.jestDashWorker.jestDashWorkerMod

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JestWorker extends js.Object {
  var _bindExposedWorkerMethods: js.Any
  var _callFunctionWithArgs: js.Any
  var _ending: js.Any
  var _farm: js.Any
  var _options: js.Any
  var _workerPool: js.Any
  def end(): Unit
  def getStderr(): ReadableStream
  def getStdout(): ReadableStream
}

object JestWorker {
  @scala.inline
  def apply(
    _bindExposedWorkerMethods: js.Any,
    _callFunctionWithArgs: js.Any,
    _ending: js.Any,
    _farm: js.Any,
    _options: js.Any,
    _workerPool: js.Any,
    end: () => Unit,
    getStderr: () => ReadableStream,
    getStdout: () => ReadableStream
  ): JestWorker = {
    val __obj = js.Dynamic.literal(_bindExposedWorkerMethods = _bindExposedWorkerMethods, _callFunctionWithArgs = _callFunctionWithArgs, _ending = _ending, _farm = _farm, _options = _options, _workerPool = _workerPool, end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout))
  
    __obj.asInstanceOf[JestWorker]
  }
}

