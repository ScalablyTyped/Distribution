package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaLabelPermission extends StObject {
  
  /**
    * Audience to grant a role to. The magic value of `audiences/default` may be used to apply the role to the default audience in the context of the organization that owns the Label.
    */
  var audience: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the email address for a user or group pricinpal. Not populated for audience principals. User and Group permissions may only be inserted using email address. On update requests, if email address is specified, no principal should be specified.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Group resource name.
    */
  var group: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of this permission.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Person resource name.
    */
  var person: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The role the principal should have.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaLabelPermission {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaLabelPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaLabelPermission]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaLabelPermission](x: Self) {
    
    inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceNull: Self = StObject.set(x, "audience", null)
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupNull: Self = StObject.set(x, "group", null)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPerson(value: String): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonNull: Self = StObject.set(x, "person", null)
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
