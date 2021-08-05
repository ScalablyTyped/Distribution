package typings.materialUi

import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickAwayListenerMod {
  
  @JSImport("material-ui/internal/ClickAwayListener", JSImport.Default)
  @js.native
  class default ()
    extends Component[ClickAwayListenerProps, js.Object, js.Any]
  
  @js.native
  trait ClickAwayListener
    extends Component[ClickAwayListenerProps, js.Object, js.Any]
  
  trait ClickAwayListenerProps
    extends StObject
       with Props[ClickAwayListener] {
    
    var onClickAway: js.UndefOr[js.Any] = js.undefined
  }
  object ClickAwayListenerProps {
    
    inline def apply(): ClickAwayListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickAwayListenerProps]
    }
    
    extension [Self <: ClickAwayListenerProps](x: Self) {
      
      inline def setOnClickAway(value: js.Any): Self = StObject.set(x, "onClickAway", value.asInstanceOf[js.Any])
      
      inline def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
    }
  }
}
