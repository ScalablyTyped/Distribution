package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1DocumentPageBlock extends StObject {
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * Layout for Block.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentPageLayout] = js.undefined
  
  /**
    * The history of this annotation.
    */
  var provenance: js.UndefOr[SchemaGoogleCloudDocumentaiV1DocumentProvenance] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1DocumentPageBlock {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1DocumentPageBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1DocumentPageBlock]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1DocumentPageBlock](x: Self) {
    
    inline def setDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1DocumentPageDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setProvenance(value: SchemaGoogleCloudDocumentaiV1DocumentProvenance): Self = StObject.set(x, "provenance", value.asInstanceOf[js.Any])
    
    inline def setProvenanceUndefined: Self = StObject.set(x, "provenance", js.undefined)
  }
}
