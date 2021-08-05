package typings.jsreportDocx

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportDocx.anon.Content
import typings.jsreportDocx.anon.Enabled
import typings.jsreportDocx.mod.JsReportDocx.Configuration
import typings.jsreportDocx.mod.JsReportDocx.DocxTemplate
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
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait Template extends StObject {
      
      var docx: js.UndefOr[DocxTemplate] = js.undefined
    }
    object Template {
      
      inline def apply(): Template = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Template]
      }
      
      extension [Self <: Template](x: Self) {
        
        inline def setDocx(value: DocxTemplate): Self = StObject.set(x, "docx", value.asInstanceOf[js.Any])
        
        inline def setDocxUndefined: Self = StObject.set(x, "docx", js.undefined)
      }
    }
  }
}
