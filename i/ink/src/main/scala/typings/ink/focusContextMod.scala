package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.ink.anon.AutoFocus
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusContextMod extends Shortcut {
  
  @JSImport("ink/build/components/FocusContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  trait Props extends StObject {
    
    def activate(id: String): Unit
    
    val activeId: js.UndefOr[String] = js.undefined
    
    def add(id: String, options: AutoFocus): Unit
    
    def deactivate(id: String): Unit
    
    def disableFocus(): Unit
    
    def enableFocus(): Unit
    
    def focusNext(): Unit
    
    def focusPrevious(): Unit
    
    def remove(id: String): Unit
  }
  object Props {
    
    inline def apply(
      activate: String => Unit,
      add: (String, AutoFocus) => Unit,
      deactivate: String => Unit,
      disableFocus: () => Unit,
      enableFocus: () => Unit,
      focusNext: () => Unit,
      focusPrevious: () => Unit,
      remove: String => Unit
    ): Props = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), add = js.Any.fromFunction2(add), deactivate = js.Any.fromFunction1(deactivate), disableFocus = js.Any.fromFunction0(disableFocus), enableFocus = js.Any.fromFunction0(enableFocus), focusNext = js.Any.fromFunction0(focusNext), focusPrevious = js.Any.fromFunction0(focusPrevious), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setActivate(value: String => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
      
      inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      inline def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      inline def setAdd(value: (String, AutoFocus) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setDeactivate(value: String => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
      
      inline def setDisableFocus(value: () => Unit): Self = StObject.set(x, "disableFocus", js.Any.fromFunction0(value))
      
      inline def setEnableFocus(value: () => Unit): Self = StObject.set(x, "enableFocus", js.Any.fromFunction0(value))
      
      inline def setFocusNext(value: () => Unit): Self = StObject.set(x, "focusNext", js.Any.fromFunction0(value))
      
      inline def setFocusPrevious(value: () => Unit): Self = StObject.set(x, "focusPrevious", js.Any.fromFunction0(value))
      
      inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `focusContextMod.foo` */
  override def _to: Context[Props] = default
}
