package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3DocumentPageParagraph extends StObject {
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * Layout for Paragraph.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3DocumentPageLayout] = js.undefined
  
  /**
    * The history of this annotation.
    */
  var provenance: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta3DocumentProvenance] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3DocumentPageParagraph {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3DocumentPageParagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3DocumentPageParagraph]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3DocumentPageParagraph](x: Self) {
    
    inline def setDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3DocumentPageDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1beta3DocumentPageDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1beta3DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setProvenance(value: SchemaGoogleCloudDocumentaiV1beta3DocumentProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
  }
}
