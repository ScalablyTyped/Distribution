package typings.jestWorker

import typings.jestWorker.typesMod.FarmOptions
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-worker", JSImport.Default)
  @js.native
  class default protected () extends JestWorker {
    def this(workerPath: String) = this()
    def this(workerPath: String, options: FarmOptions) = this()
  }
  
  @js.native
  trait JestWorker extends StObject {
    
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
    implicit class JestWorkerMutableBuilder[Self <: JestWorker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStderr(value: () => ReadableStream): Self = StObject.set(x, "getStderr", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStdout(value: () => ReadableStream): Self = StObject.set(x, "getStdout", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_bindExposedWorkerMethods(value: js.Any): Self = StObject.set(x, "_bindExposedWorkerMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_callFunctionWithArgs(value: js.Any): Self = StObject.set(x, "_callFunctionWithArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_ending(value: js.Any): Self = StObject.set(x, "_ending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_farm(value: js.Any): Self = StObject.set(x, "_farm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_workerPool(value: js.Any): Self = StObject.set(x, "_workerPool", value.asInstanceOf[js.Any])
    }
  }
}
