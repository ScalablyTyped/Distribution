package typings.jssha.distSha3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KMACOptionsNoEncodingType extends StObject {
  
  var customization: js.UndefOr[GenericInputType] = js.undefined
  
  var kmacKey: GenericInputType
}
object KMACOptionsNoEncodingType {
  
  inline def apply(kmacKey: GenericInputType): KMACOptionsNoEncodingType = {
    val __obj = js.Dynamic.literal(kmacKey = kmacKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KMACOptionsNoEncodingType]
  }
  
  extension [Self <: KMACOptionsNoEncodingType](x: Self) {
    
    inline def setCustomization(value: GenericInputType): Self = StObject.set(x, "customization", value.asInstanceOf[js.Any])
    
    inline def setCustomizationUndefined: Self = StObject.set(x, "customization", js.undefined)
    
    inline def setKmacKey(value: GenericInputType): Self = StObject.set(x, "kmacKey", value.asInstanceOf[js.Any])
  }
}
