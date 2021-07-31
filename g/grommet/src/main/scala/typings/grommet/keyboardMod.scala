package typings.grommet

import typings.grommet.grommetStrings.component
import typings.grommet.grommetStrings.document
import typings.grommet.utilsMod.KeyboardType
import typings.react.mod.FC
import typings.react.mod.KeyboardEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyboardMod {
  
  @JSImport("grommet/components/Keyboard", "Keyboard")
  @js.native
  val Keyboard: FC[KeyboardProps] = js.native
  
  trait KeyboardProps extends StObject {
    
    var onBackspace: js.UndefOr[KeyboardType] = js.undefined
    
    var onComma: js.UndefOr[KeyboardType] = js.undefined
    
    var onDown: js.UndefOr[KeyboardType] = js.undefined
    
    var onEnter: js.UndefOr[KeyboardType] = js.undefined
    
    var onEsc: js.UndefOr[KeyboardType] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardType] = js.undefined
    
    var onLeft: js.UndefOr[KeyboardType] = js.undefined
    
    var onRight: js.UndefOr[KeyboardType] = js.undefined
    
    var onShift: js.UndefOr[KeyboardType] = js.undefined
    
    var onSpace: js.UndefOr[KeyboardType] = js.undefined
    
    var onTab: js.UndefOr[KeyboardType] = js.undefined
    
    var onUp: js.UndefOr[KeyboardType] = js.undefined
    
    var target: js.UndefOr[component | document] = js.undefined
  }
  object KeyboardProps {
    
    @scala.inline
    def apply(): KeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardProps]
    }
    
    @scala.inline
    implicit class KeyboardPropsMutableBuilder[Self <: KeyboardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBackspace(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBackspace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBackspaceUndefined: Self = StObject.set(x, "onBackspace", js.undefined)
      
      @scala.inline
      def setOnComma(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onComma", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCommaUndefined: Self = StObject.set(x, "onComma", js.undefined)
      
      @scala.inline
      def setOnDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownUndefined: Self = StObject.set(x, "onDown", js.undefined)
      
      @scala.inline
      def setOnEnter(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEsc(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEsc", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnLeft(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLeftUndefined: Self = StObject.set(x, "onLeft", js.undefined)
      
      @scala.inline
      def setOnRight(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRightUndefined: Self = StObject.set(x, "onRight", js.undefined)
      
      @scala.inline
      def setOnShift(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onShift", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnShiftUndefined: Self = StObject.set(x, "onShift", js.undefined)
      
      @scala.inline
      def setOnSpace(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onSpace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSpaceUndefined: Self = StObject.set(x, "onSpace", js.undefined)
      
      @scala.inline
      def setOnTab(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      @scala.inline
      def setOnUp(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpUndefined: Self = StObject.set(x, "onUp", js.undefined)
      
      @scala.inline
      def setTarget(value: component | document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
