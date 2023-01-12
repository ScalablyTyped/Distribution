package typings.jsreportJsrender

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportCore.mod.Recipe
import typings.jsreportCore.mod.Template
import typings.jsreportJsrender.jsreportJsrenderStrings.jsrender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-jsrender", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait JsRenderTemplate
    extends StObject
       with Template {
    
    @JSName("engine")
    var engine_JsRenderTemplate: jsrender | String
  }
  object JsRenderTemplate {
    
    inline def apply(content: String, engine: jsrender | String, recipe: Recipe | String): JsRenderTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsRenderTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsRenderTemplate] (val x: Self) extends AnyVal {
      
      inline def setEngine(value: jsrender | String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var JsRenderTemplate: typings.jsreportJsrender.mod.JsRenderTemplate
    }
    object TemplateRegistry {
      
      inline def apply(JsRenderTemplate: JsRenderTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(JsRenderTemplate = JsRenderTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TemplateRegistry] (val x: Self) extends AnyVal {
        
        inline def setJsRenderTemplate(value: JsRenderTemplate): Self = StObject.set(x, "JsRenderTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
