package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetGuestAttributesResponse extends StObject {
  
  /**
    * The guest attributes for the TPU workers.
    */
  var guestAttributes: js.UndefOr[js.Array[SchemaGuestAttributes]] = js.undefined
}
object SchemaGetGuestAttributesResponse {
  
  inline def apply(): SchemaGetGuestAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetGuestAttributesResponse]
  }
  
  extension [Self <: SchemaGetGuestAttributesResponse](x: Self) {
    
    inline def setGuestAttributes(value: js.Array[SchemaGuestAttributes]): Self = StObject.set(x, "guestAttributes", value.asInstanceOf[js.Any])
    
    inline def setGuestAttributesUndefined: Self = StObject.set(x, "guestAttributes", js.undefined)
    
    inline def setGuestAttributesVarargs(value: SchemaGuestAttributes*): Self = StObject.set(x, "guestAttributes", js.Array(value*))
  }
}
