package typings.materialUi

import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalClickAwayListenerMod {
  
  @JSImport("material-ui/internal/ClickAwayListener", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ClickAwayListenerProps, js.Object, Any]
  
  type ClickAwayListener = Component[ClickAwayListenerProps, js.Object, Any]
  
  trait ClickAwayListenerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onClickAway: js.UndefOr[Any] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[ClickAwayListener]] = js.undefined
  }
  object ClickAwayListenerProps {
    
    inline def apply(): ClickAwayListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickAwayListenerProps]
    }
    
    extension [Self <: ClickAwayListenerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnClickAway(value: Any): Self = StObject.set(x, "onClickAway", value.asInstanceOf[js.Any])
      
      inline def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
      
      inline def setRef(value: LegacyRef[ClickAwayListener]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ClickAwayListener | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
