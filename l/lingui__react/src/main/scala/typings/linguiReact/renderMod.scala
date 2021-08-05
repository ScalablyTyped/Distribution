package typings.linguiReact

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  trait RenderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var render: js.UndefOr[ReactNode] = js.undefined
  }
  object RenderProps {
    
    inline def apply(): RenderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderProps]
    }
    
    extension [Self <: RenderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setRender(value: ReactNode): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
