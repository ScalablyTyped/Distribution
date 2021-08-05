package typings.grommet

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipLinkMod {
  
  @JSImport("grommet/components/SkipLink", "SkipLink")
  @js.native
  val SkipLink: FC[SkipLinkProps] = js.native
  
  trait SkipLinkProps extends StObject {
    
    var id: String
    
    var label: js.UndefOr[ReactNode] = js.undefined
  }
  object SkipLinkProps {
    
    inline def apply(id: String): SkipLinkProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipLinkProps]
    }
    
    extension [Self <: SkipLinkProps](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
