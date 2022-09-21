package typings.interactjsTypes

import typings.interactjsTypes.anon.Cancel
import typings.interactjsTypes.interactjsTypesStrings.matches
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  object default {
    
    @JSImport("@interactjs/utils/browser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/utils/browser", "default.init")
    @js.native
    def init: js.Function1[/* window */ Any, Unit] = js.native
    inline def init(window: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(window.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def init_=(x: js.Function1[/* window */ Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("init")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/utils/browser", "default.isIOS")
    @js.native
    def isIOS: Boolean = js.native
    
    @JSImport("@interactjs/utils/browser", "default.isIOS7")
    @js.native
    def isIOS7: Boolean = js.native
    inline def isIOS7_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIOS7")(x.asInstanceOf[js.Any])
    
    inline def isIOS_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIOS")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/utils/browser", "default.isIe9")
    @js.native
    def isIe9: Boolean = js.native
    inline def isIe9_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIe9")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/utils/browser", "default.isOperaMobile")
    @js.native
    def isOperaMobile: Boolean = js.native
    inline def isOperaMobile_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOperaMobile")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/utils/browser", "default.pEventTypes")
    @js.native
    def pEventTypes: Cancel = js.native
    inline def pEventTypes_=(x: Cancel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pEventTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/utils/browser", "default.prefixedMatchesSelector")
    @js.native
    def prefixedMatchesSelector: matches = js.native
    inline def prefixedMatchesSelector_=(x: matches): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixedMatchesSelector")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/utils/browser", "default.supportsPointerEvent")
    @js.native
    def supportsPointerEvent: Boolean = js.native
    inline def supportsPointerEvent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsPointerEvent")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/utils/browser", "default.supportsTouch")
    @js.native
    def supportsTouch: Boolean = js.native
    inline def supportsTouch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supportsTouch")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/utils/browser", "default.wheelEvent")
    @js.native
    def wheelEvent: String = js.native
    inline def wheelEvent_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wheelEvent")(x.asInstanceOf[js.Any])
  }
}
