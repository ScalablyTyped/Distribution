package typings.linkifyjs

import typings.linkifyjs.mod.Options
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactMod {
  
  @JSImport("linkifyjs/react", JSImport.Default)
  @js.native
  class default ()
    extends Component[LinkifyProps, js.Object, js.Any]
  
  type Linkify = Component[LinkifyProps, js.Object, js.Any]
  
  @js.native
  trait LinkifyProps extends StObject {
    
    var options: js.UndefOr[Options] = js.native
    
    var tagName: js.UndefOr[String] = js.native
  }
  object LinkifyProps {
    
    @scala.inline
    def apply(): LinkifyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkifyProps]
    }
    
    @scala.inline
    implicit class LinkifyPropsMutableBuilder[Self <: LinkifyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    }
  }
}
