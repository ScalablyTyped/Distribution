package typings.grommet

import typings.grommet.dropMod.DropProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tipMod {
  
  @JSImport("grommet/components/Tip", "Tip")
  @js.native
  val Tip: FC[TipProps] = js.native
  
  trait TipProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var content: js.UndefOr[ReactNode] = js.undefined
    
    var dropProps: js.UndefOr[DropProps] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
  }
  object TipProps {
    
    inline def apply(): TipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TipProps]
    }
    
    extension [Self <: TipProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDropProps(value: DropProps): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    }
  }
}
