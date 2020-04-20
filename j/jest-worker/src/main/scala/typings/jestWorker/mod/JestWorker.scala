package typings.jestWorker.mod

import typings.node.NodeJS.ReadableStream
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
    val __obj = js.Dynamic.literal(_bindExposedWorkerMethods = _bindExposedWorkerMethods.asInstanceOf[js.Any], _callFunctionWithArgs = _callFunctionWithArgs.asInstanceOf[js.Any], _ending = _ending.asInstanceOf[js.Any], _farm = _farm.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _workerPool = _workerPool.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout))
    __obj.asInstanceOf[JestWorker]
  }
}

