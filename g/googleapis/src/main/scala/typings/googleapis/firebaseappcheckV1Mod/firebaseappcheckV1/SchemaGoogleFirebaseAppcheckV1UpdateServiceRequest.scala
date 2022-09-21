package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1UpdateServiceRequest extends StObject {
  
  /**
    * Required. The Service to update. The Service's `name` field is used to identify the Service to be updated, in the format: ``` projects/{project_number\}/services/{service_id\} ``` Note that the `service_id` element must be a supported service ID. Currently, the following service IDs are supported: * `firebasestorage.googleapis.com` (Cloud Storage for Firebase) * `firebasedatabase.googleapis.com` (Firebase Realtime Database) * `firestore.googleapis.com` (Cloud Firestore)
    */
  var service: js.UndefOr[SchemaGoogleFirebaseAppcheckV1Service] = js.undefined
  
  /**
    * Required. A comma-separated list of names of fields in the Service to update. Example: `enforcement_mode`.
    */
  var updateMask: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1UpdateServiceRequest {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1UpdateServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1UpdateServiceRequest]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1UpdateServiceRequest](x: Self) {
    
    inline def setService(value: SchemaGoogleFirebaseAppcheckV1Service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskNull: Self = StObject.set(x, "updateMask", null)
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
