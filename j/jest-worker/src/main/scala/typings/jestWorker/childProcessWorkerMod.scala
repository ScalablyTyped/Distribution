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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childProcessWorkerMod {
  
  @JSImport("jest-worker/build/workers/ChildProcessWorker", JSImport.Default)
  @js.native
  class default protected () extends ChildProcessWorker {
    def this(options: WorkerOptions) = this()
  }
  
  @js.native
  trait ChildProcessWorker extends WorkerInterface {
    
    var _child: js.Any = js.native
    
    var _fakeStream: js.Any = js.native
    
    var _getFakeStream: js.Any = js.native
    
    var _onProcessEnd: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _request: js.Any = js.native
    
    var _retries: js.Any = js.native
    
    var _shutdown: js.Any = js.native
    
    var _stderr: js.Any = js.native
    
    var _stdout: js.Any = js.native
    
    def initialize(): Unit = js.native
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
    
    @scala.inline
    implicit class ChildProcessWorkerMutableBuilder[Self <: ChildProcessWorker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_child(value: js.Any): Self = StObject.set(x, "_child", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_fakeStream(value: js.Any): Self = StObject.set(x, "_fakeStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_getFakeStream(value: js.Any): Self = StObject.set(x, "_getFakeStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_onProcessEnd(value: js.Any): Self = StObject.set(x, "_onProcessEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_request(value: js.Any): Self = StObject.set(x, "_request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_retries(value: js.Any): Self = StObject.set(x, "_retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_shutdown(value: js.Any): Self = StObject.set(x, "_shutdown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stderr(value: js.Any): Self = StObject.set(x, "_stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stdout(value: js.Any): Self = StObject.set(x, "_stdout", value.asInstanceOf[js.Any])
    }
  }
}
