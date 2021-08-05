package typings.jestWorker

import typings.jestWorker.typesMod.FarmOptions
import typings.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-worker", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with JestWorker {
    def this(workerPath: String) = this()
    def this(workerPath: String, options: FarmOptions) = this()
    
    /* private */ /* CompleteClass */
    var _bindExposedWorkerMethods: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _callFunctionWithArgs: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _ending: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _farm: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _options: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _workerPool: js.Any = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    override def getStderr(): ReadableStream = js.native
    
    /* CompleteClass */
    override def getStdout(): ReadableStream = js.native
  }
  
  trait JestWorker extends StObject {
    
    /* private */ var _bindExposedWorkerMethods: js.Any
    
    /* private */ var _callFunctionWithArgs: js.Any
    
    /* private */ var _ending: js.Any
    
    /* private */ var _farm: js.Any
    
    /* private */ var _options: js.Any
    
    /* private */ var _workerPool: js.Any
    
    def end(): Unit
    
    def getStderr(): ReadableStream
    
    def getStdout(): ReadableStream
  }
  object JestWorker {
    
    inline def apply(
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
    
    extension [Self <: JestWorker](x: Self) {
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setGetStderr(value: () => ReadableStream): Self = StObject.set(x, "getStderr", js.Any.fromFunction0(value))
      
      inline def setGetStdout(value: () => ReadableStream): Self = StObject.set(x, "getStdout", js.Any.fromFunction0(value))
      
      inline def set_bindExposedWorkerMethods(value: js.Any): Self = StObject.set(x, "_bindExposedWorkerMethods", value.asInstanceOf[js.Any])
      
      inline def set_callFunctionWithArgs(value: js.Any): Self = StObject.set(x, "_callFunctionWithArgs", value.asInstanceOf[js.Any])
      
      inline def set_ending(value: js.Any): Self = StObject.set(x, "_ending", value.asInstanceOf[js.Any])
      
      inline def set_farm(value: js.Any): Self = StObject.set(x, "_farm", value.asInstanceOf[js.Any])
      
      inline def set_options(value: js.Any): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      inline def set_workerPool(value: js.Any): Self = StObject.set(x, "_workerPool", value.asInstanceOf[js.Any])
    }
  }
}
