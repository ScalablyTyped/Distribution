package typings.jpm

import typings.jpm.anon.Combo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkHotkeysMod {
  
  trait Hotkey extends StObject {
    
    def destroy(): Unit
  }
  object Hotkey {
    
    @JSImport("sdk/hotkeys", "Hotkey")
    @js.native
    def apply(options: Combo): Hotkey = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hotkey] (val x: Self) extends AnyVal {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    }
  }
}
