package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleApiServiceusageV1beta1GetServiceIdentityResponse extends StObject {
  
  /**
    * Service identity that service producer can use to access consumer resources. If exists is true, it contains email and unique_id. If exists is false, it contains pre-constructed email and empty unique_id.
    */
  var identity: js.UndefOr[SchemaGoogleApiServiceusageV1beta1ServiceIdentity] = js.undefined
  
  /**
    * Service identity state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleApiServiceusageV1beta1GetServiceIdentityResponse {
  
  inline def apply(): SchemaGoogleApiServiceusageV1beta1GetServiceIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1beta1GetServiceIdentityResponse]
  }
  
  extension [Self <: SchemaGoogleApiServiceusageV1beta1GetServiceIdentityResponse](x: Self) {
    
    inline def setIdentity(value: SchemaGoogleApiServiceusageV1beta1ServiceIdentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
