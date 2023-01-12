package typings.jsreportPdfUtils

import typings.jsreportCore.mod.Engine
import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportCore.mod.Recipe
import typings.jsreportCore.mod.Template
import typings.jsreportPdfUtils.anon.Contrent
import typings.jsreportPdfUtils.jsreportPdfUtilsBooleans.`true`
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.HighResolution
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.LowResolution
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.NotAllowed
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.append
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.merge
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): ExtensionDefinition = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ExtensionDefinition]
  
  @JSImport("jsreport-pdf-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PdfMeta extends StObject {
    
    var author: js.UndefOr[String] = js.undefined
    
    var creator: js.UndefOr[String] = js.undefined
    
    var keywords: js.UndefOr[String] = js.undefined
    
    var producer: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object PdfMeta {
    
    inline def apply(): PdfMeta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PdfMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfMeta] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
      
      inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
      
      inline def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      inline def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
      
      inline def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait PdfOperation extends StObject {
    
    var mergeWholeDocument: js.UndefOr[Boolean] = js.undefined
    
    var renderForEveryPage: js.UndefOr[Boolean] = js.undefined
    
    var template: js.UndefOr[Template] = js.undefined
    
    var templateShortid: js.UndefOr[String] = js.undefined
    
    var `type`: merge | append | prepend
  }
  object PdfOperation {
    
    inline def apply(`type`: merge | append | prepend): PdfOperation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PdfOperation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfOperation] (val x: Self) extends AnyVal {
      
      inline def setMergeWholeDocument(value: Boolean): Self = StObject.set(x, "mergeWholeDocument", value.asInstanceOf[js.Any])
      
      inline def setMergeWholeDocumentUndefined: Self = StObject.set(x, "mergeWholeDocument", js.undefined)
      
      inline def setRenderForEveryPage(value: Boolean): Self = StObject.set(x, "renderForEveryPage", value.asInstanceOf[js.Any])
      
      inline def setRenderForEveryPageUndefined: Self = StObject.set(x, "renderForEveryPage", js.undefined)
      
      inline def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateShortid(value: String): Self = StObject.set(x, "templateShortid", value.asInstanceOf[js.Any])
      
      inline def setTemplateShortidUndefined: Self = StObject.set(x, "templateShortid", js.undefined)
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setType(value: merge | append | prepend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PdfPassword extends StObject {
    
    var contentAccessibility: Boolean
    
    var copying: Boolean
    
    var documentAssembly: `true`
    
    var fillingForms: Boolean
    
    var modifying: Boolean
    
    var ownerPassword: String
    
    var password: String
    
    var printing: HighResolution | NotAllowed | LowResolution
  }
  object PdfPassword {
    
    inline def apply(
      contentAccessibility: Boolean,
      copying: Boolean,
      fillingForms: Boolean,
      modifying: Boolean,
      ownerPassword: String,
      password: String,
      printing: HighResolution | NotAllowed | LowResolution
    ): PdfPassword = {
      val __obj = js.Dynamic.literal(contentAccessibility = contentAccessibility.asInstanceOf[js.Any], copying = copying.asInstanceOf[js.Any], documentAssembly = true, fillingForms = fillingForms.asInstanceOf[js.Any], modifying = modifying.asInstanceOf[js.Any], ownerPassword = ownerPassword.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], printing = printing.asInstanceOf[js.Any])
      __obj.asInstanceOf[PdfPassword]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfPassword] (val x: Self) extends AnyVal {
      
      inline def setContentAccessibility(value: Boolean): Self = StObject.set(x, "contentAccessibility", value.asInstanceOf[js.Any])
      
      inline def setCopying(value: Boolean): Self = StObject.set(x, "copying", value.asInstanceOf[js.Any])
      
      inline def setDocumentAssembly(value: `true`): Self = StObject.set(x, "documentAssembly", value.asInstanceOf[js.Any])
      
      inline def setFillingForms(value: Boolean): Self = StObject.set(x, "fillingForms", value.asInstanceOf[js.Any])
      
      inline def setModifying(value: Boolean): Self = StObject.set(x, "modifying", value.asInstanceOf[js.Any])
      
      inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPrinting(value: HighResolution | NotAllowed | LowResolution): Self = StObject.set(x, "printing", value.asInstanceOf[js.Any])
    }
  }
  
  trait PdfSign extends StObject {
    
    var certificateAsset: Contrent
    
    var reason: String
  }
  object PdfSign {
    
    inline def apply(certificateAsset: Contrent, reason: String): PdfSign = {
      val __obj = js.Dynamic.literal(certificateAsset = certificateAsset.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[PdfSign]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfSign] (val x: Self) extends AnyVal {
      
      inline def setCertificateAsset(value: Contrent): Self = StObject.set(x, "certificateAsset", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait PdfTemplate
    extends StObject
       with Template {
    
    var pdfMeta: js.UndefOr[PdfMeta] = js.undefined
    
    var pdfOperations: js.UndefOr[js.Array[PdfOperation]] = js.undefined
    
    var pdfPassword: js.UndefOr[PdfPassword] = js.undefined
    
    var pdfSign: js.UndefOr[PdfSign] = js.undefined
  }
  object PdfTemplate {
    
    inline def apply(content: String, engine: Engine | String, recipe: Recipe | String): PdfTemplate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], recipe = recipe.asInstanceOf[js.Any])
      __obj.asInstanceOf[PdfTemplate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PdfTemplate] (val x: Self) extends AnyVal {
      
      inline def setPdfMeta(value: PdfMeta): Self = StObject.set(x, "pdfMeta", value.asInstanceOf[js.Any])
      
      inline def setPdfMetaUndefined: Self = StObject.set(x, "pdfMeta", js.undefined)
      
      inline def setPdfOperations(value: js.Array[PdfOperation]): Self = StObject.set(x, "pdfOperations", value.asInstanceOf[js.Any])
      
      inline def setPdfOperationsUndefined: Self = StObject.set(x, "pdfOperations", js.undefined)
      
      inline def setPdfOperationsVarargs(value: PdfOperation*): Self = StObject.set(x, "pdfOperations", js.Array(value*))
      
      inline def setPdfPassword(value: PdfPassword): Self = StObject.set(x, "pdfPassword", value.asInstanceOf[js.Any])
      
      inline def setPdfPasswordUndefined: Self = StObject.set(x, "pdfPassword", js.undefined)
      
      inline def setPdfSign(value: PdfSign): Self = StObject.set(x, "pdfSign", value.asInstanceOf[js.Any])
      
      inline def setPdfSignUndefined: Self = StObject.set(x, "pdfSign", js.undefined)
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    trait TemplateRegistry extends StObject {
      
      var PdfTemplate: typings.jsreportPdfUtils.mod.PdfTemplate
    }
    object TemplateRegistry {
      
      inline def apply(PdfTemplate: PdfTemplate): TemplateRegistry = {
        val __obj = js.Dynamic.literal(PdfTemplate = PdfTemplate.asInstanceOf[js.Any])
        __obj.asInstanceOf[TemplateRegistry]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: TemplateRegistry] (val x: Self) extends AnyVal {
        
        inline def setPdfTemplate(value: PdfTemplate): Self = StObject.set(x, "PdfTemplate", value.asInstanceOf[js.Any])
      }
    }
  }
}
