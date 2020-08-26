package typings.jestWorker.typesMod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerInterface extends js.Object {
  def getStderr(): ReadableStream | Null = js.native
  def getStdout(): ReadableStream | Null = js.native
  def getWorkerId(): Double = js.native
  def onExit(exitCode: Double): Unit = js.native
  def onMessage(message: ParentMessage): Unit = js.native
  def send(request: ChildMessage, onProcessStart: OnStart, onProcessEnd: OnEnd): Unit = js.native
}

object WorkerInterface {
  @scala.inline
  def apply(
    getStderr: () => ReadableStream | Null,
    getStdout: () => ReadableStream | Null,
    getWorkerId: () => Double,
    onExit: Double => Unit,
    onMessage: ParentMessage => Unit,
    send: (ChildMessage, OnStart, OnEnd) => Unit
  ): WorkerInterface = {
    val __obj = js.Dynamic.literal(getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkerId = js.Any.fromFunction0(getWorkerId), onExit = js.Any.fromFunction1(onExit), onMessage = js.Any.fromFunction1(onMessage), send = js.Any.fromFunction3(send))
    __obj.asInstanceOf[WorkerInterface]
  }
  @scala.inline
  implicit class WorkerInterfaceOps[Self <: WorkerInterface] (val x: Self) extends AnyVal {
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
    def setGetStderr(value: () => ReadableStream | Null): Self = this.set("getStderr", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStdout(value: () => ReadableStream | Null): Self = this.set("getStdout", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWorkerId(value: () => Double): Self = this.set("getWorkerId", js.Any.fromFunction0(value))
    @scala.inline
    def setOnExit(value: Double => Unit): Self = this.set("onExit", js.Any.fromFunction1(value))
    @scala.inline
    def setOnMessage(value: ParentMessage => Unit): Self = this.set("onMessage", js.Any.fromFunction1(value))
    @scala.inline
    def setSend(value: (ChildMessage, OnStart, OnEnd) => Unit): Self = this.set("send", js.Any.fromFunction3(value))
  }
  
}

