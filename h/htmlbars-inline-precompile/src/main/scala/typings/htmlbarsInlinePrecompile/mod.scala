package typings.htmlbarsInlinePrecompile

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("htmlbars-inline-precompile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(tagged: TemplateStringsArray): TemplateFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(tagged.asInstanceOf[js.Any]).asInstanceOf[TemplateFactory]
  
  trait TemplateFactory extends StObject {
    
    var __htmlbars_inline_precompile_template_factory: Any
  }
  object TemplateFactory {
    
    inline def apply(__htmlbars_inline_precompile_template_factory: Any): TemplateFactory = {
      val __obj = js.Dynamic.literal(__htmlbars_inline_precompile_template_factory = __htmlbars_inline_precompile_template_factory.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateFactory]
    }
    
    extension [Self <: TemplateFactory](x: Self) {
      
      inline def set__htmlbars_inline_precompile_template_factory(value: Any): Self = StObject.set(x, "__htmlbars_inline_precompile_template_factory", value.asInstanceOf[js.Any])
    }
  }
}
