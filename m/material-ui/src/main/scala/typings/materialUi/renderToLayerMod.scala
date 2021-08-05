package typings.materialUi

import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderToLayerMod {
  
  @JSImport("material-ui/internal/RenderToLayer", JSImport.Default)
  @js.native
  class default ()
    extends Component[RenderToLayerProps, js.Object, js.Any]
  
  @js.native
  trait RenderToLayer
    extends Component[RenderToLayerProps, js.Object, js.Any]
  
  trait RenderToLayerProps
    extends StObject
       with Props[RenderToLayer] {
    
    var componentClickAway: js.UndefOr[js.Function] = js.undefined
    
    var open: Boolean
    
    var render: js.Function
    
    var useLayerForClickAway: js.UndefOr[Boolean] = js.undefined
  }
  object RenderToLayerProps {
    
    inline def apply(open: Boolean, render: js.Function): RenderToLayerProps = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderToLayerProps]
    }
    
    extension [Self <: RenderToLayerProps](x: Self) {
      
      inline def setComponentClickAway(value: js.Function): Self = StObject.set(x, "componentClickAway", value.asInstanceOf[js.Any])
      
      inline def setComponentClickAwayUndefined: Self = StObject.set(x, "componentClickAway", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setRender(value: js.Function): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAway(value: Boolean): Self = StObject.set(x, "useLayerForClickAway", value.asInstanceOf[js.Any])
      
      inline def setUseLayerForClickAwayUndefined: Self = StObject.set(x, "useLayerForClickAway", js.undefined)
    }
  }
}
