package typings.jestWatcher

import typings.jestWatcher.anon.ReadonlyJestHookEmitter
import typings.jestWatcher.anon.ReadonlyJestHookSubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestHooksMod {
  
  @JSImport("jest-watcher/build/JestHooks", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with JestHooks {
    
    /* private */ /* CompleteClass */
    var _emitter: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _listeners: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var _subscriber: js.Any = js.native
    
    /* CompleteClass */
    override def getEmitter(): ReadonlyJestHookEmitter = js.native
    
    /* CompleteClass */
    override def getSubscriber(): ReadonlyJestHookSubscribe = js.native
    
    /* CompleteClass */
    override def isUsed(hook: AvailableHooks): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestWatcher.jestWatcherStrings.onFileChange
    - typings.jestWatcher.jestWatcherStrings.onTestRunComplete
    - typings.jestWatcher.jestWatcherStrings.shouldRunTestSuite
  */
  trait AvailableHooks extends StObject
  object AvailableHooks {
    
    inline def onFileChange: typings.jestWatcher.jestWatcherStrings.onFileChange = "onFileChange".asInstanceOf[typings.jestWatcher.jestWatcherStrings.onFileChange]
    
    inline def onTestRunComplete: typings.jestWatcher.jestWatcherStrings.onTestRunComplete = "onTestRunComplete".asInstanceOf[typings.jestWatcher.jestWatcherStrings.onTestRunComplete]
    
    inline def shouldRunTestSuite: typings.jestWatcher.jestWatcherStrings.shouldRunTestSuite = "shouldRunTestSuite".asInstanceOf[typings.jestWatcher.jestWatcherStrings.shouldRunTestSuite]
  }
  
  trait JestHooks extends StObject {
    
    /* private */ var _emitter: js.Any
    
    /* private */ var _listeners: js.Any
    
    /* private */ var _subscriber: js.Any
    
    def getEmitter(): ReadonlyJestHookEmitter
    
    def getSubscriber(): ReadonlyJestHookSubscribe
    
    def isUsed(hook: AvailableHooks): Boolean
  }
  object JestHooks {
    
    inline def apply(
      _emitter: js.Any,
      _listeners: js.Any,
      _subscriber: js.Any,
      getEmitter: () => ReadonlyJestHookEmitter,
      getSubscriber: () => ReadonlyJestHookSubscribe,
      isUsed: AvailableHooks => Boolean
    ): JestHooks = {
      val __obj = js.Dynamic.literal(_emitter = _emitter.asInstanceOf[js.Any], _listeners = _listeners.asInstanceOf[js.Any], _subscriber = _subscriber.asInstanceOf[js.Any], getEmitter = js.Any.fromFunction0(getEmitter), getSubscriber = js.Any.fromFunction0(getSubscriber), isUsed = js.Any.fromFunction1(isUsed))
      __obj.asInstanceOf[JestHooks]
    }
    
    extension [Self <: JestHooks](x: Self) {
      
      inline def setGetEmitter(value: () => ReadonlyJestHookEmitter): Self = StObject.set(x, "getEmitter", js.Any.fromFunction0(value))
      
      inline def setGetSubscriber(value: () => ReadonlyJestHookSubscribe): Self = StObject.set(x, "getSubscriber", js.Any.fromFunction0(value))
      
      inline def setIsUsed(value: AvailableHooks => Boolean): Self = StObject.set(x, "isUsed", js.Any.fromFunction1(value))
      
      inline def set_emitter(value: js.Any): Self = StObject.set(x, "_emitter", value.asInstanceOf[js.Any])
      
      inline def set_listeners(value: js.Any): Self = StObject.set(x, "_listeners", value.asInstanceOf[js.Any])
      
      inline def set_subscriber(value: js.Any): Self = StObject.set(x, "_subscriber", value.asInstanceOf[js.Any])
    }
  }
}
