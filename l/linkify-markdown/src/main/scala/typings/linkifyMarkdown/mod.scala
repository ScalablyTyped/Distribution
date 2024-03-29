package typings.linkifyMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linkify-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linkify(source: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("linkify")(source.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def linkify(source: String, options: LinkifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("linkify")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait LinkifyOptions extends StObject {
    
    var repository: js.UndefOr[String] = js.undefined
    
    var strong: js.UndefOr[Boolean] = js.undefined
  }
  object LinkifyOptions {
    
    inline def apply(): LinkifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkifyOptions] (val x: Self) extends AnyVal {
      
      inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    }
  }
}
