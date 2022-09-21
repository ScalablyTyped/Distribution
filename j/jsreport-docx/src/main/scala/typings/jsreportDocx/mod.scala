package typings.jsreportDocx

import typings.jsreportCore.mod.Engine
import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportCore.mod.Recipe
import typings.jsreportCore.mod.TemplateBase
import typings.jsreportDocx.anon.Content
import typings.jsreportDocx.anon.Enabled
import typings.jsreportDocx.mod.JsReportDocx.Configuration
import typings.jsreportDocx.mod.JsReportDocx.DocxTemplateModifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  inline def apply(cfg: Configuration): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply(cfg.asInstanceOf[js.Any]).asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-docx", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object JsReportDocx {
    
    trait Configuration extends StObject {
      
      var preview: js.UndefOr[Enabled] = js.undefined
    }
    object Configuration {
      
      inline def apply(): Configuration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Configuration]
      }
      
      extension [Self <: Configuration](x: Self) {
        
        inline def setPreview(value: Enabled): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
        
        inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      }
    }
    
    trait DocxTemplate extends StObject {
      
      var templateAsetShortid: js.UndefOr[String] = js.undefined
      
      var templateAsset: js.UndefOr[Content] = js.undefined
    }
    object DocxTemplate {
      
      inline def apply(): DocxTemplate = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DocxTemplate]
      }
      
      extension [Self <: DocxTemplate](x: Self) {
        
        inline def setTemplateAsetShortid(value: String): Self = StObject.set(x, "templateAsetShortid", value.asInstanceOf[js.Any])
        
        inline def setTemplateAsetShortidUndefined: Self = StObject.set(x, "templateAsetShortid", js.undefined)
        
        inline def setTemplateAsset(value: Content): Self = StObject.set(x, "templateAsset", value.asInstanceOf[js.Any])
        
        inline def setTemplateAssetUndefined: Self = StObject.set(x, "templateAsset", js.undefined)
      }
    }
    
    trait DocxTemplateModifier
      extends StObject
         with TemplateBase {
      
      var docx: js.UndefOr[DocxTemplate] = js.undefined
    }
    object DocxTemplateModifier {
      
      inline def apply(engine: Engine | String, recipe: Recipe | String): DocxTemplateModifier = {
        val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
        __obj.asInstanceOf[DocxTemplateModifier]
      }
      
      extension [Self <: DocxTemplateModifier](x: Self) {
        
        inline def setDocx(value: DocxTemplate): Self = StObject.set(x, "docx", value.asInstanceOf[js.Any])
        
        inline def setDocxUndefined: Self = StObject.set(x, "docx", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var DocxTemplateModifier: typings.jsreportDocx.mod.JsReportDocx.DocxTemplateModifier
    }
    object TemplateRegistry {
      
      inline def apply(DocxTemplateModifier: DocxTemplateModifier): TemplateRegistry = {
        val __obj = js.Dynamic.literal(DocxTemplateModifier = DocxTemplateModifier.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      extension [Self <: TemplateRegistry](x: Self) {
        
        inline def setDocxTemplateModifier(value: DocxTemplateModifier): Self = StObject.set(x, "DocxTemplateModifier", value.asInstanceOf[js.Any])
      }
    }
  }
}
