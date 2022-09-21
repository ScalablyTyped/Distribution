package typings.googleapis.languageV1beta1Mod.languageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnnotateTextRequest extends StObject {
  
  /**
    * Input document.
    */
  var document: js.UndefOr[SchemaDocument] = js.undefined
  
  /**
    * The encoding type used by the API to calculate offsets.
    */
  var encodingType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The enabled features.
    */
  var features: js.UndefOr[SchemaFeatures] = js.undefined
}
object SchemaAnnotateTextRequest {
  
  inline def apply(): SchemaAnnotateTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotateTextRequest]
  }
  
  extension [Self <: SchemaAnnotateTextRequest](x: Self) {
    
    inline def setDocument(value: SchemaDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setEncodingType(value: String): Self = StObject.set(x, "encodingType", value.asInstanceOf[js.Any])
    
    inline def setEncodingTypeNull: Self = StObject.set(x, "encodingType", null)
    
    inline def setEncodingTypeUndefined: Self = StObject.set(x, "encodingType", js.undefined)
    
    inline def setFeatures(value: SchemaFeatures): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
  }
}
