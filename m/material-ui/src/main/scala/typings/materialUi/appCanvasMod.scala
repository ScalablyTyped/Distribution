package typings.materialUi

import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appCanvasMod {
  
  @JSImport("material-ui/internal/AppCanvas", JSImport.Default)
  @js.native
  class default ()
    extends Component[AppCanvasProps, js.Object, js.Any]
  
  @js.native
  trait AppCanvas
    extends Component[AppCanvasProps, js.Object, js.Any]
  
  trait AppCanvasProps
    extends StObject
       with Props[AppCanvas]
  object AppCanvasProps {
    
    @scala.inline
    def apply(): AppCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppCanvasProps]
    }
  }
}
