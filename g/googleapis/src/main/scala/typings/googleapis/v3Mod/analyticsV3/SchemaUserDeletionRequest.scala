package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a user deletion request resource.
  */
trait SchemaUserDeletionRequest extends StObject {
  
  /**
    * This marks the point in time for which all user data before should be
    * deleted
    */
  var deletionRequestTime: js.UndefOr[String] = js.undefined
  
  /**
    * Firebase Project Id
    */
  var firebaseProjectId: js.UndefOr[String] = js.undefined
  
  /**
    * User ID.
    */
  var id: js.UndefOr[Type] = js.undefined
  
  /**
    * Value is &quot;analytics#userDeletionRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object SchemaUserDeletionRequest {
  
  @scala.inline
  def apply(): SchemaUserDeletionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDeletionRequest]
  }
  
  @scala.inline
  implicit class SchemaUserDeletionRequestMutableBuilder[Self <: SchemaUserDeletionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionRequestTime(value: String): Self = StObject.set(x, "deletionRequestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionRequestTimeUndefined: Self = StObject.set(x, "deletionRequestTime", js.undefined)
    
    @scala.inline
    def setFirebaseProjectId(value: String): Self = StObject.set(x, "firebaseProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirebaseProjectIdUndefined: Self = StObject.set(x, "firebaseProjectId", js.undefined)
    
    @scala.inline
    def setId(value: Type): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
