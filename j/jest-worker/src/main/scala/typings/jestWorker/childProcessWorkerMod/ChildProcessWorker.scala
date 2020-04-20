package typings.jestWorker.childProcessWorkerMod

import typings.jestWorker.typesMod.ChildMessage
import typings.jestWorker.typesMod.OnEnd
import typings.jestWorker.typesMod.OnStart
import typings.jestWorker.typesMod.ParentMessage
import typings.jestWorker.typesMod.WorkerInterface
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildProcessWorker extends WorkerInterface {
  var _child: js.Any
  var _fakeStream: js.Any
  var _getFakeStream: js.Any
  var _onProcessEnd: js.Any
  var _options: js.Any
  var _request: js.Any
  var _retries: js.Any
  var _shutdown: js.Any
  var _stderr: js.Any
  var _stdout: js.Any
  def initialize(): Unit
}

object ChildProcessWorker {
  @scala.inline
  def apply(
    _child: js.Any,
    _fakeStream: js.Any,
    _getFakeStream: js.Any,
    _onProcessEnd: js.Any,
    _options: js.Any,
    _request: js.Any,
    _retries: js.Any,
    _shutdown: js.Any,
    _stderr: js.Any,
    _stdout: js.Any,
    getStderr: () => ReadableStream | Null,
    getStdout: () => ReadableStream | Null,
    getWorkerId: () => Double,
    initialize: () => Unit,
    onExit: Double => Unit,
    onMessage: ParentMessage => Unit,
    send: (ChildMessage, OnStart, OnEnd) => Unit
  ): ChildProcessWorker = {
    val __obj = js.Dynamic.literal(_child = _child.asInstanceOf[js.Any], _fakeStream = _fakeStream.asInstanceOf[js.Any], _getFakeStream = _getFakeStream.asInstanceOf[js.Any], _onProcessEnd = _onProcessEnd.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _request = _request.asInstanceOf[js.Any], _retries = _retries.asInstanceOf[js.Any], _shutdown = _shutdown.asInstanceOf[js.Any], _stderr = _stderr.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkerId = js.Any.fromFunction0(getWorkerId), initialize = js.Any.fromFunction0(initialize), onExit = js.Any.fromFunction1(onExit), onMessage = js.Any.fromFunction1(onMessage), send = js.Any.fromFunction3(send))
    __obj.asInstanceOf[ChildProcessWorker]
  }
}

