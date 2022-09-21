package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2KeyValuePairHint extends StObject {
  
  /**
    * The key text for the hint.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of the value. This is case-insensitive, and could be one of: ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER, ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will be ignored.
    */
  var valueTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2KeyValuePairHint {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2KeyValuePairHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2KeyValuePairHint]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2KeyValuePairHint](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValueTypes(value: js.Array[String]): Self = StObject.set(x, "valueTypes", value.asInstanceOf[js.Any])
    
    inline def setValueTypesNull: Self = StObject.set(x, "valueTypes", null)
    
    inline def setValueTypesUndefined: Self = StObject.set(x, "valueTypes", js.undefined)
    
    inline def setValueTypesVarargs(value: String*): Self = StObject.set(x, "valueTypes", js.Array(value*))
  }
}
