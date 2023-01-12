package typings.grommet

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSkipLinkTargetMod {
  
  @JSImport("grommet/components/SkipLinkTarget", "SkipLinkTarget")
  @js.native
  val SkipLinkTarget: FC[SkipLinkTargetProps] = js.native
  
  trait SkipLinkTargetProps extends StObject {
    
    var id: String
    
    var label: js.UndefOr[ReactNode] = js.undefined
  }
  object SkipLinkTargetProps {
    
    inline def apply(id: String): SkipLinkTargetProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkipLinkTargetProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkipLinkTargetProps] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
