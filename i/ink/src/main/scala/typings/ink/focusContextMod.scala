package typings.ink

import org.scalablytyped.runtime.Shortcut
import typings.ink.anon.AutoFocus
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusContextMod extends Shortcut {
  
  @JSImport("ink/build/components/FocusContext", JSImport.Default)
  @js.native
  val default: Context[Props] = js.native
  
  @js.native
  trait Props extends StObject {
    
    def activate(id: String): Unit = js.native
    
    val activeId: js.UndefOr[String] = js.native
    
    def add(id: String, options: AutoFocus): Unit = js.native
    
    def deactivate(id: String): Unit = js.native
    
    def disableFocus(): Unit = js.native
    
    def enableFocus(): Unit = js.native
    
    def focusNext(): Unit = js.native
    
    def focusPrevious(): Unit = js.native
    
    def remove(id: String): Unit = js.native
  }
  object Props {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: String => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIdUndefined: Self = StObject.set(x, "activeId", js.undefined)
      
      @scala.inline
      def setAdd(value: (String, AutoFocus) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDeactivate(value: String => Unit): Self = StObject.set(x, "deactivate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisableFocus(value: () => Unit): Self = StObject.set(x, "disableFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableFocus(value: () => Unit): Self = StObject.set(x, "enableFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusNext(value: () => Unit): Self = StObject.set(x, "focusNext", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFocusPrevious(value: () => Unit): Self = StObject.set(x, "focusPrevious", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[Props]
  
  /* This means you don't have to write `default`, but can instead just say `focusContextMod.foo` */
  override def _to: Context[Props] = default
}
