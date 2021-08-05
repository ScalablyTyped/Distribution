package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDeletionRequest extends StObject {
  
  /** This marks the point in time for which all user data before should be deleted */
  var deletionRequestTime: js.UndefOr[String] = js.undefined
  
  /** Firebase Project Id */
  var firebaseProjectId: js.UndefOr[String] = js.undefined
  
  /** User ID. */
  var id: js.UndefOr[Type] = js.undefined
  
  /** Value is "analytics#userDeletionRequest". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Property ID */
  var propertyId: js.UndefOr[String] = js.undefined
  
  /** Web property ID of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object UserDeletionRequest {
  
  inline def apply(): UserDeletionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDeletionRequest]
  }
  
  extension [Self <: UserDeletionRequest](x: Self) {
    
    inline def setDeletionRequestTime(value: String): Self = StObject.set(x, "deletionRequestTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionRequestTimeUndefined: Self = StObject.set(x, "deletionRequestTime", js.undefined)
    
    inline def setFirebaseProjectId(value: String): Self = StObject.set(x, "firebaseProjectId", value.asInstanceOf[js.Any])
    
    inline def setFirebaseProjectIdUndefined: Self = StObject.set(x, "firebaseProjectId", js.undefined)
    
    inline def setId(value: Type): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPropertyId(value: String): Self = StObject.set(x, "propertyId", value.asInstanceOf[js.Any])
    
    inline def setPropertyIdUndefined: Self = StObject.set(x, "propertyId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
