package typings.kbar

import org.scalablytyped.runtime.StringDictionary
import typings.kbar.kbarStrings.keydown
import typings.kbar.kbarStrings.keyup
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTinykeysMod {
  
  @JSImport("kbar/lib/tinykeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: HTMLElement, keyBindingMap: KeyBindingMap): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], keyBindingMap.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(target: HTMLElement, keyBindingMap: KeyBindingMap, options: KeyBindingOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], keyBindingMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(target: Window, keyBindingMap: KeyBindingMap): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], keyBindingMap.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def default(target: Window, keyBindingMap: KeyBindingMap, options: KeyBindingOptions): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], keyBindingMap.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  type KeyBindingMap = StringDictionary[js.Function1[/* event */ KeyboardEvent, Unit]]
  
  trait KeyBindingOptions extends StObject {
    
    /**
      * Key presses will listen to this event (default: "keydown").
      */
    var event: js.UndefOr[keydown | keyup] = js.undefined
    
    /**
      * Keybinding sequences will wait this long between key presses before
      * cancelling (default: 1000).
      *
      * **Note:** Setting this value too low (i.e. `300`) will be too fast for many
      * of your users.
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object KeyBindingOptions {
    
    inline def apply(): KeyBindingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyBindingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyBindingOptions] (val x: Self) extends AnyVal {
      
      inline def setEvent(value: keydown | keyup): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
