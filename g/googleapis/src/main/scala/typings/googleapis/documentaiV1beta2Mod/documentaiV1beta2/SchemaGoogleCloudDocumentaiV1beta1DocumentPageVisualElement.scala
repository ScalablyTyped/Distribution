package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1DocumentPageVisualElement extends StObject {
  
  /**
    * A list of detected languages together with confidence.
    */
  var detectedLanguages: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedLanguage]] = js.undefined
  
  /**
    * Layout for VisualElement.
    */
  var layout: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1DocumentPageLayout] = js.undefined
  
  /**
    * Type of the VisualElement.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1DocumentPageVisualElement {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1DocumentPageVisualElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1DocumentPageVisualElement]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1DocumentPageVisualElement](x: Self) {
    
    inline def setDetectedLanguages(value: js.Array[SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedLanguage]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    inline def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    inline def setDetectedLanguagesVarargs(value: SchemaGoogleCloudDocumentaiV1beta1DocumentPageDetectedLanguage*): Self = StObject.set(x, "detectedLanguages", js.Array(value*))
    
    inline def setLayout(value: SchemaGoogleCloudDocumentaiV1beta1DocumentPageLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
