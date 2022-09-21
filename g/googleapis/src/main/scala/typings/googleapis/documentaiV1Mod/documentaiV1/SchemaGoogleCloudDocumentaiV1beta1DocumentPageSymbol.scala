package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentPageSymbol extends StObject {
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * Layout for Symbol.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1DocumentPageLayout] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentPageSymbol {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentPageSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentPageSymbol]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentPageSymbol](x: Self) {
    
    inline def setDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1beta1DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
