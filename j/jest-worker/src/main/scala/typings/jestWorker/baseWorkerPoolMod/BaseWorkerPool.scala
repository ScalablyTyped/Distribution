package typings.jestWorker.baseWorkerPoolMod

import typings.jestWorker.typesMod.WorkerInterface
import typings.jestWorker.typesMod.WorkerOptions
import typings.jestWorker.typesMod.WorkerPoolOptions
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseWorkerPool extends js.Object {
  
  val _options: WorkerPoolOptions = js.native
  
  val _stderr: js.Any = js.native
  
  val _stdout: js.Any = js.native
  
  val _workers: js.Any = js.native
  
  def createWorker(_workerOptions: WorkerOptions): WorkerInterface = js.native
  
  def end(): Unit = js.native
  
  def getStderr(): ReadableStream = js.native
  
  def getStdout(): ReadableStream = js.native
  
  def getWorkerById(workerId: Double): WorkerInterface = js.native
  
  def getWorkers(): js.Array[WorkerInterface] = js.native
}
object BaseWorkerPool {
  
  @scala.inline
  def apply(
    _options: WorkerPoolOptions,
    _stderr: js.Any,
    _stdout: js.Any,
    _workers: js.Any,
    createWorker: WorkerOptions => WorkerInterface,
    end: () => Unit,
    getStderr: () => ReadableStream,
    getStdout: () => ReadableStream,
    getWorkerById: Double => WorkerInterface,
    getWorkers: () => js.Array[WorkerInterface]
  ): BaseWorkerPool = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any], _stderr = _stderr.asInstanceOf[js.Any], _stdout = _stdout.asInstanceOf[js.Any], _workers = _workers.asInstanceOf[js.Any], createWorker = js.Any.fromFunction1(createWorker), end = js.Any.fromFunction0(end), getStderr = js.Any.fromFunction0(getStderr), getStdout = js.Any.fromFunction0(getStdout), getWorkerById = js.Any.fromFunction1(getWorkerById), getWorkers = js.Any.fromFunction0(getWorkers))
    __obj.asInstanceOf[BaseWorkerPool]
  }
  
  @scala.inline
  implicit class BaseWorkerPoolOps[Self <: BaseWorkerPool] (val x: Self) extends AnyVal {
    
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
    def set_options(value: WorkerPoolOptions): Self = this.set("_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stderr(value: js.Any): Self = this.set("_stderr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_stdout(value: js.Any): Self = this.set("_stdout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_workers(value: js.Any): Self = this.set("_workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateWorker(value: WorkerOptions => WorkerInterface): Self = this.set("createWorker", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStderr(value: () => ReadableStream): Self = this.set("getStderr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStdout(value: () => ReadableStream): Self = this.set("getStdout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorkerById(value: Double => WorkerInterface): Self = this.set("getWorkerById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetWorkers(value: () => js.Array[WorkerInterface]): Self = this.set("getWorkers", js.Any.fromFunction0(value))
  }
}
