package typings.materialUi

import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderToLayerMod {
  
  @JSImport("material-ui/internal/RenderToLayer", JSImport.Default)
  @js.native
  open class default ()
    extends Component[RenderToLayerProps, js.Object, Any]
  
  type RenderToLayer = Component[RenderToLayerProps, js.Object, Any]
  
  trait RenderToLayerProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var componentClickAway: js.UndefOr[js.Function] = js.undefined
    
    var open: Boolean
    
    var ref: js.UndefOr[LegacyRef[RenderToLayer]] = js.undefined
    
    var render: js.Function
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  }
  object RenderToLayerProps {
    
    inline def apply(open: Boolean, render: js.Function): RenderToLayerProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderToLayerProps]
    }
    
    extension [Self <: RenderToLayerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponentClickAway(value: js.Function): Self = StObject.set(x, "componentClickAway", value.asInstanceOf[js.Any])
      
      inline def setComponentClickAwayUndefined: Self = StObject.set(x, "componentClickAway", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setRef(value: LegacyRef[RenderToLayer]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ RenderToLayer | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
    }
  }
}
