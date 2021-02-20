package typings.jsreportPdfUtils

import typings.jsreportCore.mod.ExtensionDefinition
import typings.jsreportCore.mod.Template
import typings.jsreportPdfUtils.anon.Contrent
import typings.jsreportPdfUtils.jsreportPdfUtilsBooleans.`true`
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.HighResolution
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.LowResolution
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.NotAllowed
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.append
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.merge
import typings.jsreportPdfUtils.jsreportPdfUtilsStrings.prepend
import typings.jsreportPdfUtils.mod.JsReportPdfUtils.PdfMeta
import typings.jsreportPdfUtils.mod.JsReportPdfUtils.PdfOperation
import typings.jsreportPdfUtils.mod.JsReportPdfUtils.PdfPassword
import typings.jsreportPdfUtils.mod.JsReportPdfUtils.PdfSign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsreport-pdf-utils", JSImport.Namespace)
  @js.native
  def apply(): ExtensionDefinition = js.native
  
  object JsReportPdfUtils {
    
    @js.native
    trait PdfMeta extends StObject {
      
      var author: js.UndefOr[String] = js.native
      
      var creator: js.UndefOr[String] = js.native
      
      var keywords: js.UndefOr[String] = js.native
      
      var producer: js.UndefOr[String] = js.native
      
      var subject: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object PdfMeta {
      
      @scala.inline
      def apply(): PdfMeta = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PdfMeta]
      }
      
      @scala.inline
      implicit class PdfMetaMutableBuilder[Self <: PdfMeta] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
        
        @scala.inline
        def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
        
        @scala.inline
        def setKeywords(value: String): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
        
        @scala.inline
        def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
        
        @scala.inline
        def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait PdfOperation extends StObject {
      
      var mergeWholeDocument: js.UndefOr[Boolean] = js.native
      
      var renderForEveryPage: js.UndefOr[Boolean] = js.native
      
      var template: js.UndefOr[Template] = js.native
      
      var templateShortid: js.UndefOr[String] = js.native
      
      var `type`: merge | append | prepend = js.native
    }
    object PdfOperation {
      
      @scala.inline
      def apply(`type`: merge | append | prepend): PdfOperation = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[PdfOperation]
      }
      
      @scala.inline
      implicit class PdfOperationMutableBuilder[Self <: PdfOperation] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMergeWholeDocument(value: Boolean): Self = StObject.set(x, "mergeWholeDocument", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMergeWholeDocumentUndefined: Self = StObject.set(x, "mergeWholeDocument", js.undefined)
        
        @scala.inline
        def setRenderForEveryPage(value: Boolean): Self = StObject.set(x, "renderForEveryPage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderForEveryPageUndefined: Self = StObject.set(x, "renderForEveryPage", js.undefined)
        
        @scala.inline
        def setTemplate(value: Template): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateShortid(value: String): Self = StObject.set(x, "templateShortid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateShortidUndefined: Self = StObject.set(x, "templateShortid", js.undefined)
        
        @scala.inline
        def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
        
        @scala.inline
        def setType(value: merge | append | prepend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PdfPassword extends StObject {
      
      var contentAccessibility: Boolean = js.native
      
      var copying: Boolean = js.native
      
      var documentAssembly: `true` = js.native
      
      var fillingForms: Boolean = js.native
      
      var modifying: Boolean = js.native
      
      var ownerPassword: String = js.native
      
      var password: String = js.native
      
      var printing: HighResolution | NotAllowed | LowResolution = js.native
    }
    object PdfPassword {
      
      @scala.inline
      def apply(
        contentAccessibility: Boolean,
        copying: Boolean,
        documentAssembly: `true`,
        fillingForms: Boolean,
        modifying: Boolean,
        ownerPassword: String,
        password: String,
        printing: HighResolution | NotAllowed | LowResolution
      ): PdfPassword = {
        val __obj = js.Dynamic.literal(contentAccessibility = contentAccessibility.asInstanceOf[js.Any], copying = copying.asInstanceOf[js.Any], documentAssembly = documentAssembly.asInstanceOf[js.Any], fillingForms = fillingForms.asInstanceOf[js.Any], modifying = modifying.asInstanceOf[js.Any], ownerPassword = ownerPassword.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], printing = printing.asInstanceOf[js.Any])
        __obj.asInstanceOf[PdfPassword]
      }
      
      @scala.inline
      implicit class PdfPasswordMutableBuilder[Self <: PdfPassword] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentAccessibility(value: Boolean): Self = StObject.set(x, "contentAccessibility", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCopying(value: Boolean): Self = StObject.set(x, "copying", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocumentAssembly(value: `true`): Self = StObject.set(x, "documentAssembly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFillingForms(value: Boolean): Self = StObject.set(x, "fillingForms", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModifying(value: Boolean): Self = StObject.set(x, "modifying", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrinting(value: HighResolution | NotAllowed | LowResolution): Self = StObject.set(x, "printing", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PdfSign extends StObject {
      
      var certificateAsset: Contrent = js.native
      
      var reason: String = js.native
    }
    object PdfSign {
      
      @scala.inline
      def apply(certificateAsset: Contrent, reason: String): PdfSign = {
        val __obj = js.Dynamic.literal(certificateAsset = certificateAsset.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
        __obj.asInstanceOf[PdfSign]
      }
      
      @scala.inline
      implicit class PdfSignMutableBuilder[Self <: PdfSign] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCertificateAsset(value: Contrent): Self = StObject.set(x, "certificateAsset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object jsreportCoreAugmentingMod {
    
    @js.native
    trait Template extends StObject {
      
      var pdfMeta: js.UndefOr[PdfMeta] = js.native
      
      var pdfOperations: js.UndefOr[js.Array[PdfOperation]] = js.native
      
      var pdfPassword: js.UndefOr[PdfPassword] = js.native
      
      var pdfSign: js.UndefOr[PdfSign] = js.native
    }
    object Template {
      
      @scala.inline
      def apply(): typings.jsreportPdfUtils.mod.jsreportCoreAugmentingMod.Template = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jsreportPdfUtils.mod.jsreportCoreAugmentingMod.Template]
      }
      
      @scala.inline
      implicit class TemplateMutableBuilder[Self <: typings.jsreportPdfUtils.mod.jsreportCoreAugmentingMod.Template] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPdfMeta(value: PdfMeta): Self = StObject.set(x, "pdfMeta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPdfMetaUndefined: Self = StObject.set(x, "pdfMeta", js.undefined)
        
        @scala.inline
        def setPdfOperations(value: js.Array[PdfOperation]): Self = StObject.set(x, "pdfOperations", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPdfOperationsUndefined: Self = StObject.set(x, "pdfOperations", js.undefined)
        
        @scala.inline
        def setPdfOperationsVarargs(value: PdfOperation*): Self = StObject.set(x, "pdfOperations", js.Array(value :_*))
        
        @scala.inline
        def setPdfPassword(value: PdfPassword): Self = StObject.set(x, "pdfPassword", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPdfPasswordUndefined: Self = StObject.set(x, "pdfPassword", js.undefined)
        
        @scala.inline
        def setPdfSign(value: PdfSign): Self = StObject.set(x, "pdfSign", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPdfSignUndefined: Self = StObject.set(x, "pdfSign", js.undefined)
      }
    }
  }
}
