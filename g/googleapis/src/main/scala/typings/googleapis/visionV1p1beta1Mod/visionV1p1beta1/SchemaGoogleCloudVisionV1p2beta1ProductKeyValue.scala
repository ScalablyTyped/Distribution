package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A product label represented as a key-value pair.
  */
trait SchemaGoogleCloudVisionV1p2beta1ProductKeyValue extends StObject {
  
  /**
    * The key of the label attached to the product. Cannot be empty and cannot
    * exceed 128 bytes.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the label attached to the product. Cannot be empty and
    * cannot exceed 128 bytes.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1ProductKeyValue {
  
  inline def apply(): SchemaGoogleCloudVisionV1p2beta1ProductKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ProductKeyValue]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p2beta1ProductKeyValue](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
