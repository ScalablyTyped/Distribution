package typings.jestWorker.typesMod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPoolInterface extends js.Object {
  def createWorker(options: WorkerOptions): WorkerInterface
  def end(): Unit
  def getStderr(): ReadableStream
  def getStdout(): ReadableStream
  def getWorkers(): js.Array[WorkerInterface]
  def send(workerId: Double, request: ChildMessage, onStart: OnStart, onEnd: OnEnd): Unit
}

object WorkerPoolInterface {
  @scala.inline
  def apply(
    createWorker: WorkerOptions => WorkerInterface,
    end: () => Unit,
    getStderr: () => ReadableStream,
    getStdout: () => ReadableStream,
    getWorkers: () => js.Array[WorkerInterface],
    send: (Double, ChildMessage, OnStart, OnEnd) => Unit
  ): WorkerPoolInterface = {
    val __obj = js.Dynamic.literal(createWorker = js.Any.fromFunction1(createWorker), end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkers = js.Any.fromFunction0(getWorkers), send = js.Any.fromFunction4(send))
    __obj.asInstanceOf[WorkerPoolInterface]
  }
}

