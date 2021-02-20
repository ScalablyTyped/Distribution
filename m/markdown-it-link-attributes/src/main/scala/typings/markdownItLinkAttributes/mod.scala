package typings.markdownItLinkAttributes

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("markdown-it-link-attributes", JSImport.Namespace)
  @js.native
  def apply(md: MarkdownIt, config: Config): Unit = js.native
  
  @js.native
  trait Config extends StObject {
    
    var attrs: StringDictionary[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(attrs: StringDictionary[String]): Config = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
}
