package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesRequest extends StObject {
  
  /**
    * Required. The request messages specifying the Services to update. A maximum of 100 objects can be updated in a batch.
    */
  var requests: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1betaUpdateServiceRequest]] = js.undefined
  
  /**
    * Optional. A comma-separated list of names of fields in the Services to update. Example: `display_name`. If this field is present, the `update_mask` field in the UpdateServiceRequest messages must all match this field, or the entire batch fails and no updates will be committed.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaBatchUpdateServicesRequest](x: Self) {
    
    inline def setRequests(value: js.Array[SchemaGoogleFirebaseAppcheckV1betaUpdateServiceRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: SchemaGoogleFirebaseAppcheckV1betaUpdateServiceRequest*): Self = StObject.set(x, "requests", js.Array(value*))
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
