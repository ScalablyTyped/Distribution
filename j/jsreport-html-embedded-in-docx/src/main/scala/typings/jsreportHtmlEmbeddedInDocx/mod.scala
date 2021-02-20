package typings.jsreportHtmlEmbeddedInDocx

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportHtmlEmbeddedInDocx.jsreportHtmlEmbeddedInDocxStrings.`html-embedded-in-docx`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-html-embedded-in-docx", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Template extends StObject {
      
      var recipe: `html-embedded-in-docx` | String = js.native
    }
    object Template {
      
      @scala.inline
      def apply(recipe: `html-embedded-in-docx` | String): Template = {
        val __obj = js.Dynamic.literal(recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRecipe(value: `html-embedded-in-docx` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      }
    }
  }
}
