package typings.jestWorker

import typings.jestWorker.typesMod.WorkerInterface
import typings.jestWorker.typesMod.WorkerOptions
import typings.jestWorker.typesMod.WorkerPoolOptions
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseWorkerPoolMod {
  
  @JSImport("jest-worker/build/base/BaseWorkerPool", JSImport.Default)
  @js.native
  class default protected () extends BaseWorkerPool {
    def this(workerPath: String, options: WorkerPoolOptions) = this()
  }
  
  @js.native
  trait BaseWorkerPool extends StObject {
    
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
    implicit class BaseWorkerPoolMutableBuilder[Self <: BaseWorkerPool] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateWorker(value: WorkerOptions => WorkerInterface): Self = StObject.set(x, "createWorker", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStderr(value: () => ReadableStream): Self = StObject.set(x, "getStderr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStdout(value: () => ReadableStream): Self = StObject.set(x, "getStdout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWorkerById(value: Double => WorkerInterface): Self = StObject.set(x, "getWorkerById", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetWorkers(value: () => js.Array[WorkerInterface]): Self = StObject.set(x, "getWorkers", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_options(value: WorkerPoolOptions): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stderr(value: js.Any): Self = StObject.set(x, "_stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stdout(value: js.Any): Self = StObject.set(x, "_stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_workers(value: js.Any): Self = StObject.set(x, "_workers", value.asInstanceOf[js.Any])
    }
  }
}
