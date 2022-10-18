package typings.markdownItExternalLinks

import typings.markdownIt.libMod.Options
import typings.markdownIt.libRendererMod.Renderer
import typings.markdownIt.libTokenMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DefaultRender extends StObject {
    
    def defaultRender(tokens: js.Array[^], idx: Double, options: Options, env: Any, self: Renderer): String
  }
  object DefaultRender {
    
    inline def apply(defaultRender: (js.Array[^], Double, Options, Any, Renderer) => String): DefaultRender = {
      val __obj = js.Dynamic.literal(defaultRender = js.Any.fromFunction5(defaultRender))
      __obj.asInstanceOf[DefaultRender]
    }
    
    extension [Self <: DefaultRender](x: Self) {
      
      inline def setDefaultRender(value: (js.Array[^], Double, Options, Any, Renderer) => String): Self = StObject.set(x, "defaultRender", js.Any.fromFunction5(value))
    }
  }
}
