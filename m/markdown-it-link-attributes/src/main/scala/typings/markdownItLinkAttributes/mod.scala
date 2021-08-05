package typings.markdownItLinkAttributes

import org.scalablytyped.runtime.StringDictionary
import typings.markdownIt.libMod.MarkdownIt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(md: MarkdownIt, config: Config): Unit = (^.asInstanceOf[js.Dynamic].apply(md.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("markdown-it-link-attributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Config extends StObject {
    
    var attrs: StringDictionary[String]
  }
  object Config {
    
    inline def apply(attrs: StringDictionary[String]): Config = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAttrs(value: StringDictionary[String]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
}
