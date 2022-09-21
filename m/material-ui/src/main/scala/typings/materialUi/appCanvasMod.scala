package typings.materialUi

import typings.react.mod.Component
import typings.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appCanvasMod {
  
  @JSImport("material-ui/internal/AppCanvas", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AppCanvasProps, js.Object, Any]
  
  type AppCanvas = Component[AppCanvasProps, js.Object, Any]
  
  trait AppCanvasProps extends StObject {
    
    var ref: js.UndefOr[LegacyRef[AppCanvas]] = js.undefined
  }
  object AppCanvasProps {
    
    inline def apply(): AppCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppCanvasProps]
    }
    
    extension [Self <: AppCanvasProps](x: Self) {
      
      inline def setRef(value: LegacyRef[AppCanvas]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ AppCanvas | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
