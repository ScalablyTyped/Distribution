package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1Service extends StObject {
  
  /**
    * Required. The App Check enforcement mode for this service.
    */
  var enforcementMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The relative resource name of the service configuration object, in the format: ``` projects/{project_number\}/services/{service_id\} ``` Note that the `service_id` element must be a supported service ID. Currently, the following service IDs are supported: * `firebasestorage.googleapis.com` (Cloud Storage for Firebase) * `firebasedatabase.googleapis.com` (Firebase Realtime Database) * `firestore.googleapis.com` (Cloud Firestore)
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1Service {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1Service]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1Service](x: Self) {
    
    inline def setEnforcementMode(value: String): Self = StObject.set(x, "enforcementMode", value.asInstanceOf[js.Any])
    
    inline def setEnforcementModeNull: Self = StObject.set(x, "enforcementMode", null)
    
    inline def setEnforcementModeUndefined: Self = StObject.set(x, "enforcementMode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
