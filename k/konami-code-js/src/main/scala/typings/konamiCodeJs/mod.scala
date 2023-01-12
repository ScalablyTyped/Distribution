package typings.konamiCodeJs

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("konami-code-js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with KonamiCode {
    def this(options: KonamiCallback) = this()
    def this(options: KonamiOptions) = this()
  }
  @JSImport("konami-code-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @returns The number of times KonamiCode was instantiated.
    */
  /* static member */
  inline def getNumberOfInstance(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOfInstance")().asInstanceOf[Double]
  
  /**
    * If a previous KonamiCode variable already existed in the global environment,
    * this switches back to it.
    */
  /* static member */
  inline def noConflict(): KonamiCode = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[KonamiCode]
  
  type KonamiCallback = js.Function1[/* instance */ KonamiCode, Unit]
  
  @js.native
  trait KonamiCode extends StObject {
    
    /**
      * Unactivate the listening of the Konami Code sequence.
      */
    def disable(): KonamiCode = js.native
    
    /**
      * Unactivate the listening of the Konami Code sequence for keyboard keys.
      */
    def disableKeyboardKeys(): KonamiCode = js.native
    
    /**
      * Unactivate the listening of the Konami Code sequence for touch gestures.
      */
    def disableTouchGesture(): KonamiCode = js.native
    
    /**
      * Activate the listening of the Konami Code sequence.
      */
    def enable(): KonamiCode = js.native
    
    /**
      * Activate the listening of the Konami Code sequence for keyboard keys.
      */
    def enableKeyboardKeys(): KonamiCode = js.native
    
    /**
      * Activate the listening of the Konami Code sequence for touch gestures.
      */
    def enableTouchGesture(): KonamiCode = js.native
    
    /**
      * Change the callback called when the sequence fires.
      *
      * @remarks The old callback will no longer work.
      */
    def setCallback(callback: KonamiCallback): KonamiCode = js.native
    
    /**
      * Change the listener.
      *
      * @remarks The old listener will no longer work.
      */
    def setListener(listener: Node): KonamiCode = js.native
    
    def setOptions(options: js.Function0[KonamiOptions]): KonamiCode = js.native
    /**
      * Change the options of the instance.
      */
    def setOptions(options: KonamiOptions): KonamiCode = js.native
  }
  
  trait KonamiOptions extends StObject {
    
    /**
      * Function executed after the the Konami Code sequence has been entered.
      */
    var callback: js.UndefOr[KonamiCallback] = js.undefined
    
    /**
      * When true, allows you to see all debug messages in the console.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass some element to only recognize the Konami Code sequence from thatt element.
      *
      * @default window.document
      */
    var listener: js.UndefOr[Node] = js.undefined
  }
  object KonamiOptions {
    
    inline def apply(): KonamiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KonamiOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KonamiOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: /* instance */ KonamiCode => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setListener(value: Node): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      inline def setListenerUndefined: Self = StObject.set(x, "listener", js.undefined)
    }
  }
}
