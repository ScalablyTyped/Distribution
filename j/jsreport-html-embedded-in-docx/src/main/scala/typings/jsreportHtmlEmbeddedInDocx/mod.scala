package typings.jsreportHtmlEmbeddedInDocx

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportHtmlEmbeddedInDocx.jsreportHtmlEmbeddedInDocxStrings.`html-embedded-in-docx`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-html-embedded-in-docx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait Template extends StObject {
      
      var recipe: `html-embedded-in-docx` | String
    }
    object Template {
      
      inline def apply(recipe: `html-embedded-in-docx` | String): Template = {
        val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      extension [Self <: Template](x: Self) {
        
        inline def setRecipe(value: `html-embedded-in-docx` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      }
    }
  }
}
