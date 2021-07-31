package typings.hasher

import org.scalablytyped.runtime.Shortcut
import typings.hasher.mod.HasherJs.HasherStatic
import typings.signals.mod.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("hasher", JSImport.Namespace)
  @js.native
  val ^ : HasherStatic = js.native
  
  // default value: '';
  // will be automatically removed from `hasher.getHash()`
  // avoid conflicts with elements that contain ID equal to hash value;
  // <static> {signals.Signal} hasher.changed
  // Signal dispatched when hash value changes. - pass current hash as 1st parameter to listeners and previous hash value as 2nd parameter.
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hasher", "changed")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  class changed ()
    extends StObject
       with Signal[js.Any]
  
  // <static> {signals.Signal} hasher.initialized
  // Signal dispatched when hasher is initialized. - pass current hash as first parameter to listeners.
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hasher", "initialized")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  class initialized ()
    extends StObject
       with Signal[js.Any]
  
  // default value: '/';
  // <static> {signals.Signal} hasher.stopped
  // Signal dispatched when hasher is stopped. - pass current hash as first parameter to listeners
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("hasher", "stopped")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  class stopped ()
    extends StObject
       with Signal[js.Any]
  
  object HasherJs {
    
    trait HasherStatic extends StObject {
      
      // <static> <constant> {string} hasher.VERSION
      // hasher Version Number
      var VERSION: String
      
      // {string} hasher.appendHash
      // String that should always be added to the end of Hash value.
      var appendHash: String
      
      // default value: '';
      // will be automatically removed from `hasher.getHash()`
      // avoid conflicts with elements that contain ID equal to hash value;
      // <static> {signals.Signal} hasher.changed
      // Signal dispatched when hash value changes. - pass current hash as 1st parameter to listeners and previous hash value as 2nd parameter.
      var changed: Signal[js.Any]
      
      // Method Detail
      // <static> hasher.dispose()
      // Removes all event listeners, stops hasher and destroy hasher object. - IMPORTANT: hasher won't work after calling this method, hasher Object will be deleted.
      def dispose(): Unit
      
      // <static> {string} hasher.getBaseURL()
      // Returns:
      // {string} Retrieve URL without query string and hash.
      def getBaseURL(): String
      
      // <static> {string} hasher.getHash()
      // Returns:
      // {string} Hash value without '#', `hasher.appendHash` and `hasher.prependHash`.
      def getHash(): String
      
      // <static> {Array.} hasher.getHashAsArray()
      // Returns:
      // {Array.} Hash value split into an Array.
      def getHashAsArray(): js.Array[String]
      
      // <static> {string} hasher.getURL()
      // Returns:
      // {string} Full URL.
      def getURL(): String
      
      // <static> hasher.init()
      // Start listening/dispatching changes in the hash/history.
      def init(): Unit
      
      // <static> {signals.Signal} hasher.initialized
      // Signal dispatched when hasher is initialized. - pass current hash as first parameter to listeners.
      var initialized: Signal[js.Any]
      
      // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons before calling this method.
      // <static> {boolean} hasher.isActive()
      // Returns:
      // {boolean} If hasher is listening to changes on the browser history and/or hash value.
      def isActive(): Boolean
      
      // <static> {string} hasher.prependHash
      // String that should always be added to the beginning of Hash value.
      var prependHash: String
      
      // <static> hasher.replaceHash(path)
      // Set Hash value without keeping previous hash on the history record. Similar to calling window.location.replace("#/hash") but will also work on IE6-7.
      // hasher.replaceHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
      // Parameters:
      // {...string} path
      // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
      def replaceHash(path: String*): Unit
      
      // default value: '/';
      // will be automatically removed from `hasher.getHash()`
      // avoid conflicts with elements that contain ID equal to hash value;
      // <static> {string} hasher.separator
      // String used to split hash paths; used by hasher.getHashAsArray() to split paths.
      var separator: String
      
      // <static> hasher.setHash(path)
      // Set Hash value, generating a new history record.
      // hasher.setHash('lorem', 'ipsum', 'dolor') -> '#/lorem/ipsum/dolor'
      // Parameters:
      // {...string} path
      // Hash value without '#'. Hasher will join path segments using `hasher.separator` and prepend/append hash value with `hasher.appendHash` and `hasher.prependHash`
      def setHash(path: String*): Unit
      
      // <static> hasher.stop()
      // Stop listening/dispatching changes in the hash/history.
      // hasher won't dispatch CHANGE events by manually typing a new value or pressing the back/forward buttons after calling this method, unless you call hasher.init() again.
      // hasher will still dispatch changes made programatically by calling hasher.setHash();
      def stop(): Unit
      
      // default value: '/';
      // <static> {signals.Signal} hasher.stopped
      // Signal dispatched when hasher is stopped. - pass current hash as first parameter to listeners
      var stopped: Signal[js.Any]
    }
    object HasherStatic {
      
      @scala.inline
      def apply(
        VERSION: String,
        appendHash: String,
        changed: Signal[js.Any],
        dispose: () => Unit,
        getBaseURL: () => String,
        getHash: () => String,
        getHashAsArray: () => js.Array[String],
        getURL: () => String,
        init: () => Unit,
        initialized: Signal[js.Any],
        isActive: () => Boolean,
        prependHash: String,
        replaceHash: /* repeated */ String => Unit,
        separator: String,
        setHash: /* repeated */ String => Unit,
        stop: () => Unit,
        stopped: Signal[js.Any]
      ): HasherStatic = {
        val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], appendHash = appendHash.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), getBaseURL = js.Any.fromFunction0(getBaseURL), getHash = js.Any.fromFunction0(getHash), getHashAsArray = js.Any.fromFunction0(getHashAsArray), getURL = js.Any.fromFunction0(getURL), init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isActive = js.Any.fromFunction0(isActive), prependHash = prependHash.asInstanceOf[js.Any], replaceHash = js.Any.fromFunction1(replaceHash), separator = separator.asInstanceOf[js.Any], setHash = js.Any.fromFunction1(setHash), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
        __obj.asInstanceOf[HasherStatic]
      }
      
      @scala.inline
      implicit class HasherStaticMutableBuilder[Self <: HasherStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAppendHash(value: String): Self = StObject.set(x, "appendHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChanged(value: Signal[js.Any]): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetBaseURL(value: () => String): Self = StObject.set(x, "getBaseURL", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetHash(value: () => String): Self = StObject.set(x, "getHash", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetHashAsArray(value: () => js.Array[String]): Self = StObject.set(x, "getHashAsArray", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetURL(value: () => String): Self = StObject.set(x, "getURL", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
        
        @scala.inline
        def setInitialized(value: Signal[js.Any]): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
        
        @scala.inline
        def setPrependHash(value: String): Self = StObject.set(x, "prependHash", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceHash(value: /* repeated */ String => Unit): Self = StObject.set(x, "replaceHash", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetHash(value: /* repeated */ String => Unit): Self = StObject.set(x, "setHash", js.Any.fromFunction1(value))
        
        @scala.inline
        def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
        
        @scala.inline
        def setStopped(value: Signal[js.Any]): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type _To = HasherStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: HasherStatic = ^
}
