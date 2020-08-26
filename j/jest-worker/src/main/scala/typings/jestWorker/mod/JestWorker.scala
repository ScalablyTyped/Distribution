package typings.jestWorker.mod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestWorker extends js.Object {
  var _bindExposedWorkerMethods: js.Any = js.native
  var _callFunctionWithArgs: js.Any = js.native
  var _ending: js.Any = js.native
  var _farm: js.Any = js.native
  var _options: js.Any = js.native
  var _workerPool: js.Any = js.native
  def end(): Unit = js.native
  def getStderr(): ReadableStream = js.native
  def getStdout(): ReadableStream = js.native
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
  @scala.inline
  implicit class JestWorkerOps[Self <: JestWorker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_bindExposedWorkerMethods(value: js.Any): Self = this.set("_bindExposedWorkerMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def set_callFunctionWithArgs(value: js.Any): Self = this.set("_callFunctionWithArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def set_ending(value: js.Any): Self = this.set("_ending", value.asInstanceOf[js.Any])
    @scala.inline
    def set_farm(value: js.Any): Self = this.set("_farm", value.asInstanceOf[js.Any])
    @scala.inline
    def set_options(value: js.Any): Self = this.set("_options", value.asInstanceOf[js.Any])
    @scala.inline
    def set_workerPool(value: js.Any): Self = this.set("_workerPool", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStderr(value: () => ReadableStream): Self = this.set("getStderr", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStdout(value: () => ReadableStream): Self = this.set("getStdout", js.Any.fromFunction0(value))
  }
  
}

