package typings.jsreportHtmlEmbeddedInDocx

import typings.jsreportCore.mod.Engine
import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportCore.mod.Template
import typings.jsreportHtmlEmbeddedInDocx.jsreportHtmlEmbeddedInDocxStrings.`html-embedded-in-docx`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-html-embedded-in-docx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HtmlEmbeddedInDocxTemplate
    extends StObject
       with Template {
    
    @JSName("recipe")
    var recipe_HtmlEmbeddedInDocxTemplate: `html-embedded-in-docx` | String
  }
  object HtmlEmbeddedInDocxTemplate {
    
    inline def apply(content: String, engine: Engine | String, recipe: `html-embedded-in-docx` | String): HtmlEmbeddedInDocxTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlEmbeddedInDocxTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlEmbeddedInDocxTemplate] (val x: Self) extends AnyVal {
      
      inline def setRecipe(value: `html-embedded-in-docx` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var HtmlEmbeddedInDocxTemplate: typings.jsreportHtmlEmbeddedInDocx.mod.HtmlEmbeddedInDocxTemplate
    }
    object TemplateRegistry {
      
      inline def apply(HtmlEmbeddedInDocxTemplate: HtmlEmbeddedInDocxTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(HtmlEmbeddedInDocxTemplate = HtmlEmbeddedInDocxTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TemplateRegistry] (val x: Self) extends AnyVal {
        
        inline def setHtmlEmbeddedInDocxTemplate(value: HtmlEmbeddedInDocxTemplate): Self = StObject.set(x, "HtmlEmbeddedInDocxTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
