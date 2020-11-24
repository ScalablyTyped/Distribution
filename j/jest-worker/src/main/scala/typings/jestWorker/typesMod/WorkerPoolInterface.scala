package typings.jestWorker.typesMod

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerPoolInterface extends js.Object {
  
  def createWorker(options: WorkerOptions): WorkerInterface = js.native
  
  def end(): Unit = js.native
  
  def getStderr(): ReadableStream = js.native
  
  def getStdout(): ReadableStream = js.native
  
  def getWorkers(): js.Array[WorkerInterface] = js.native
  
  def send(workerId: Double, request: ChildMessage, onStart: OnStart, onEnd: OnEnd): Unit = js.native
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
  
  @scala.inline
  implicit class WorkerPoolInterfaceOps[Self <: WorkerPoolInterface] (val x: Self) extends AnyVal {
    
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
    def setCreateWorker(value: WorkerOptions => WorkerInterface): Self = this.set("createWorker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStderr(value: () => ReadableStream): Self = this.set("getStderr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStdout(value: () => ReadableStream): Self = this.set("getStdout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorkers(value: () => js.Array[WorkerInterface]): Self = this.set("getWorkers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSend(value: (Double, ChildMessage, OnStart, OnEnd) => Unit): Self = this.set("send", js.Any.fromFunction4(value))
  }
}
