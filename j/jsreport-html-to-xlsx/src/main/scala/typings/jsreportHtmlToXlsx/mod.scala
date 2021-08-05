package typings.jsreportHtmlToXlsx

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportHtmlToXlsx.anon.HtmlEngine
import typings.jsreportHtmlToXlsx.anon.PartialOptions
import typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.`html-to-xlsx`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(options: PartialOptions): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-html-to-xlsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with typings.jsreportXlsx.mod.Options {
    
    var strategy: String
  }
  object Options {
    
    inline def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double, strategy: String): Options = {
      val __obj = js.Dynamic.literal(addBufferSize = addBufferSize.asInstanceOf[js.Any], escapeAmp = escapeAmp.asInstanceOf[js.Any], numberOfParsedAddIterations = numberOfParsedAddIterations.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait Template extends StObject {
      
      var htmlToXlsx: HtmlEngine
      
      var recipe: `html-to-xlsx` | String
    }
    object Template {
      
      inline def apply(htmlToXlsx: HtmlEngine, recipe: `html-to-xlsx` | String): Template = {
        val __obj = js.Dynamic.literal(htmlToXlsx = htmlToXlsx.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      extension [Self <: Template](x: Self) {
        
        inline def setHtmlToXlsx(value: HtmlEngine): Self = StObject.set(x, "htmlToXlsx", value.asInstanceOf[js.Any])
        
        inline def setRecipe(value: `html-to-xlsx` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom
      - typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome
    */
    trait htmlEngine extends StObject
    object htmlEngine {
      
      inline def chrome: typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome = "chrome".asInstanceOf[typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome]
      
      inline def phantom: typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom = "phantom".asInstanceOf[typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom]
    }
  }
}
