package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p2beta1ProductKeyValue extends StObject {
  
  /**
    * The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1ProductKeyValue {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1ProductKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ProductKeyValue]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1ProductKeyValue](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
