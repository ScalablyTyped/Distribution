package typings.jsreportHtmlToXlsx

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportHtmlToXlsx.anon.HtmlEngine
import typings.jsreportHtmlToXlsx.anon.PartialOptions
import typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.`html-to-xlsx`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-html-to-xlsx", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  @JSImport("jsreport-html-to-xlsx", JSImport.Namespace)
  @js.native
  def apply(options: PartialOptions): ExtensionDefinition = js.native
  
  @js.native
  trait Options
    extends typings.jsreportXlsx.mod.Options {
    
    var strategy: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double, strategy: String): Options = {
      val __obj = js.Dynamic.literal(addBufferSize = addBufferSize.asInstanceOf[js.Any], escapeAmp = escapeAmp.asInstanceOf[js.Any], numberOfParsedAddIterations = numberOfParsedAddIterations.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Template extends StObject {
      
      var htmlToXlsx: HtmlEngine = js.native
      
      var recipe: `html-to-xlsx` | String = js.native
    }
    object Template {
      
      @scala.inline
      def apply(htmlToXlsx: HtmlEngine, recipe: `html-to-xlsx` | String): Template = {
        val __obj = js.Dynamic.literal(htmlToXlsx = htmlToXlsx.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHtmlToXlsx(value: HtmlEngine): Self = StObject.set(x, "htmlToXlsx", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecipe(value: `html-to-xlsx` | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom
      - typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome
    */
    trait htmlEngine extends StObject
    object htmlEngine {
      
      @scala.inline
      def chrome: typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome = "chrome".asInstanceOf[typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.chrome]
      
      @scala.inline
      def phantom: typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom = "phantom".asInstanceOf[typings.jsreportHtmlToXlsx.jsreportHtmlToXlsxStrings.phantom]
    }
  }
}
