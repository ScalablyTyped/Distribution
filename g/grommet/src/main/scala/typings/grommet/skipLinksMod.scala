package typings.grommet

import typings.grommet.anon.SkipTo
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipLinksMod {
  
  @JSImport("grommet/components/SkipLinks", "SkipLinks")
  @js.native
  val SkipLinks: FC[SkipLinksProps] = js.native
  
  trait SkipLinksProps extends StObject {
    
    var children: ReactNode
    
    var messages: js.UndefOr[SkipTo] = js.undefined
  }
  object SkipLinksProps {
    
    inline def apply(): SkipLinksProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipLinksProps]
    }
    
    extension [Self <: SkipLinksProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setMessages(value: SkipTo): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    }
  }
}
