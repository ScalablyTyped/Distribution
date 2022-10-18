package typings.grommet

import typings.grommet.grommetStrings.component
import typings.grommet.grommetStrings.document
import typings.grommet.utilsMod.KeyboardType
import typings.react.mod.FC
import typings.react.mod.KeyboardEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsKeyboardMod {
  
  @JSImport("grommet/components/Keyboard", "Keyboard")
  @js.native
  val Keyboard: FC[KeyboardProps] = js.native
  
  trait KeyboardProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
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
    
    inline def apply(): KeyboardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyboardProps]
    }
    
    extension [Self <: KeyboardProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnBackspace(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onBackspace", js.Any.fromFunction1(value))
      
      inline def setOnBackspaceUndefined: Self = StObject.set(x, "onBackspace", js.undefined)
      
      inline def setOnComma(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onComma", js.Any.fromFunction1(value))
      
      inline def setOnCommaUndefined: Self = StObject.set(x, "onComma", js.undefined)
      
      inline def setOnDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onDown", js.Any.fromFunction1(value))
      
      inline def setOnDownUndefined: Self = StObject.set(x, "onDown", js.undefined)
      
      inline def setOnEnter(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnEsc(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onEsc", js.Any.fromFunction1(value))
      
      inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnLeft(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onLeft", js.Any.fromFunction1(value))
      
      inline def setOnLeftUndefined: Self = StObject.set(x, "onLeft", js.undefined)
      
      inline def setOnRight(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onRight", js.Any.fromFunction1(value))
      
      inline def setOnRightUndefined: Self = StObject.set(x, "onRight", js.undefined)
      
      inline def setOnShift(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onShift", js.Any.fromFunction1(value))
      
      inline def setOnShiftUndefined: Self = StObject.set(x, "onShift", js.undefined)
      
      inline def setOnSpace(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onSpace", js.Any.fromFunction1(value))
      
      inline def setOnSpaceUndefined: Self = StObject.set(x, "onSpace", js.undefined)
      
      inline def setOnTab(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onTab", js.Any.fromFunction1(value))
      
      inline def setOnTabUndefined: Self = StObject.set(x, "onTab", js.undefined)
      
      inline def setOnUp(value: /* event */ KeyboardEvent[HTMLElement] => Unit): Self = StObject.set(x, "onUp", js.Any.fromFunction1(value))
      
      inline def setOnUpUndefined: Self = StObject.set(x, "onUp", js.undefined)
      
      inline def setTarget(value: component | document): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
}
