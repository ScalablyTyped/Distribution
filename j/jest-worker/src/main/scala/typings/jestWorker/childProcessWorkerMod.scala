package typings.jestWorker

import typings.jestWorker.typesMod.ChildMessage
import typings.jestWorker.typesMod.OnEnd
import typings.jestWorker.typesMod.OnStart
import typings.jestWorker.typesMod.ParentMessage
import typings.jestWorker.typesMod.WorkerInterface
import typings.jestWorker.typesMod.WorkerOptions
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childProcessWorkerMod {
  
  @JSImport("jest-worker/build/workers/ChildProcessWorker", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ChildProcessWorker {
    def this(options: WorkerOptions) = this()
    
    /* private */ /* CompleteClass */
    var _child: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _fakeStream: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _getFakeStream: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _onProcessEnd: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _options: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _request: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _retries: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _shutdown: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _stderr: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _stdout: js.Any = js.native
    
    /* CompleteClass */
    override def getStderr(): ReadableStream | Null = js.native
    
    /* CompleteClass */
    override def getStdout(): ReadableStream | Null = js.native
    
    /* CompleteClass */
    override def getWorkerId(): Double = js.native
    
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /* CompleteClass */
    override def onExit(exitCode: Double): Unit = js.native
    
    /* CompleteClass */
    override def onMessage(message: ParentMessage): Unit = js.native
    
    /* CompleteClass */
    override def send(request: ChildMessage, onProcessStart: OnStart, onProcessEnd: OnEnd): Unit = js.native
  }
  
  trait ChildProcessWorker
    extends StObject
       with WorkerInterface {
    
    /* private */ var _child: js.Any
    
    /* private */ var _fakeStream: js.Any
    
    /* private */ var _getFakeStream: js.Any
    
    /* private */ var _onProcessEnd: js.Any
    
    /* private */ var _options: js.Any
    
    /* private */ var _request: js.Any
    
    /* private */ var _retries: js.Any
    
    /* private */ var _shutdown: js.Any
    
    /* private */ var _stderr: js.Any
    
    /* private */ var _stdout: js.Any
    
    def initialize(): Unit
  }
  object ChildProcessWorker {
    
    inline def apply(
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
    
    extension [Self <: ChildProcessWorker](x: Self) {
      
      inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      inline def set_child(value: js.Any): Self = StObject.set(x, "_child", value.asInstanceOf[js.Any])
      
      inline def set_fakeStream(value: js.Any): Self = StObject.set(x, "_fakeStream", value.asInstanceOf[js.Any])
      
      inline def set_getFakeStream(value: js.Any): Self = StObject.set(x, "_getFakeStream", value.asInstanceOf[js.Any])
      
      inline def set_onProcessEnd(value: js.Any): Self = StObject.set(x, "_onProcessEnd", value.asInstanceOf[js.Any])
      
      inline def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      inline def set_request(value: js.Any): Self = StObject.set(x, "_request", value.asInstanceOf[js.Any])
      
      inline def set_retries(value: js.Any): Self = StObject.set(x, "_retries", value.asInstanceOf[js.Any])
      
      inline def set_shutdown(value: js.Any): Self = StObject.set(x, "_shutdown", value.asInstanceOf[js.Any])
      
      inline def set_stderr(value: js.Any): Self = StObject.set(x, "_stderr", value.asInstanceOf[js.Any])
      
      inline def set_stdout(value: js.Any): Self = StObject.set(x, "_stdout", value.asInstanceOf[js.Any])
    }
  }
}
