package typings.jsreportXlsx

import typings.jsreportCore.mod.Engine
import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportCore.mod.Template
import typings.jsreportXlsx.anon.PartialOptions
import typings.jsreportXlsx.jsreportXlsxStrings.xlsx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(options: PartialOptions): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-xlsx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var addBufferSize: Double
    
    var escapeAmp: Boolean
    
    var numberOfParsedAddIterations: Double
  }
  object Options {
    
    inline def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double): Options = {
      val __obj = js.Dynamic.literal(addBufferSize = addBufferSize.asInstanceOf[js.Any], escapeAmp = escapeAmp.asInstanceOf[js.Any], numberOfParsedAddIterations = numberOfParsedAddIterations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAddBufferSize(value: Double): Self = StObject.set(x, "addBufferSize", value.asInstanceOf[js.Any])
      
      inline def setEscapeAmp(value: Boolean): Self = StObject.set(x, "escapeAmp", value.asInstanceOf[js.Any])
      
      inline def setNumberOfParsedAddIterations(value: Double): Self = StObject.set(x, "numberOfParsedAddIterations", value.asInstanceOf[js.Any])
    }
  }
  
  trait Xlsx extends StObject {
    
    var shortid: String
  }
  object Xlsx {
    
    inline def apply(shortid: String): Xlsx = {
      val __obj = js.Dynamic.literal(shortid = shortid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Xlsx]
    }
    
    extension [Self <: Xlsx](x: Self) {
      
      inline def setShortid(value: String): Self = StObject.set(x, "shortid", value.asInstanceOf[js.Any])
    }
  }
  
  trait XlsxTemplate
    extends StObject
       with Template {
    
    @JSName("recipe")
    var recipe_XlsxTemplate: xlsx | String
  }
  object XlsxTemplate {
    
    inline def apply(content: String, engine: Engine | String, recipe: xlsx | String): XlsxTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[XlsxTemplate]
    }
    
    extension [Self <: XlsxTemplate](x: Self) {
      
      inline def setRecipe(value: xlsx | String): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var XlsxTemplate: typings.jsreportXlsx.mod.XlsxTemplate
    }
    object TemplateRegistry {
      
      inline def apply(XlsxTemplate: XlsxTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(XlsxTemplate = XlsxTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      extension [Self <: TemplateRegistry](x: Self) {
        
        inline def setXlsxTemplate(value: XlsxTemplate): Self = StObject.set(x, "XlsxTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
