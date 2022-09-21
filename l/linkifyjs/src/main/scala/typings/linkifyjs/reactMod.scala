package typings.linkifyjs

import typings.linkifyjs.mod.Options
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("linkifyjs/react", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LinkifyProps, js.Object, Any]
  
  type Linkify = Component[LinkifyProps, js.Object, Any]
  
  trait LinkifyProps extends StObject {
    
    var options: js.UndefOr[Options] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
  }
  object LinkifyProps {
    
    inline def apply(): LinkifyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkifyProps]
    }
    
    extension [Self <: LinkifyProps](x: Self) {
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
