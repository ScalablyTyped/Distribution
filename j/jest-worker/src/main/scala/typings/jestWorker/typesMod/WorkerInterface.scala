package typings.jestWorker.typesMod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerInterface extends js.Object {
  def getStderr(): ReadableStream | Null
  def getStdout(): ReadableStream | Null
  def getWorkerId(): Double
  def onExit(exitCode: Double): Unit
  def onMessage(message: ParentMessage): Unit
  def send(request: ChildMessage, onProcessStart: OnStart, onProcessEnd: OnEnd): Unit
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
}

