package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a unique identifier of a beacon as broadcast by the device.
  */
trait SchemaAdvertisedId extends StObject {
  
  /**
    * The actual beacon identifier, as broadcast by the beacon hardware. Must
    * be [base64](http://tools.ietf.org/html/rfc4648#section-4) encoded in HTTP
    * requests, and will be so encoded (with padding) in responses. The base64
    * encoding should be of the binary byte-stream and not any textual (such as
    * hex) representation thereof. Required.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the identifier type. Required.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaAdvertisedId {
  
  inline def apply(): SchemaAdvertisedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertisedId]
  }
  
  extension [Self <: SchemaAdvertisedId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
