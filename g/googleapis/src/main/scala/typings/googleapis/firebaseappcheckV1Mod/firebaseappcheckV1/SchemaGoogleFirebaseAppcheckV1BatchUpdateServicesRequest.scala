package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesRequest extends StObject {
  
  /**
    * Required. The request messages specifying the Services to update. A maximum of 100 objects can be updated in a batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1UpdateServiceRequest]] = js.undefined
  
  /**
    * Optional. A comma-separated list of names of fields in the Services to update. Example: `display_name`. If the `update_mask` field is set in both this request and any of the UpdateServiceRequest messages, they must match or the entire batch fails and no updates will be committed.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1BatchUpdateServicesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleFirebaseAppcheckV1UpdateServiceRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleFirebaseAppcheckV1UpdateServiceRequest*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
