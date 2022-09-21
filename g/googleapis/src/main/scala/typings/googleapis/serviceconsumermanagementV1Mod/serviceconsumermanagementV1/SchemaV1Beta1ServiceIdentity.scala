package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1Beta1ServiceIdentity extends StObject {
  
  /**
    * The email address of the service identity.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * P4 service identity resource name. An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/serviceIdentities/default`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The P4 service identity configuration tag. This must be defined in activation_grants. If not specified when creating the account, the tag is set to "default".
    */
  var tag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique and stable id of the service identity.
    */
  var uniqueId: js.UndefOr[String | Null] = js.undefined
}
object SchemaV1Beta1ServiceIdentity {
  
  inline def apply(): SchemaV1Beta1ServiceIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1Beta1ServiceIdentity]
  }
  
  extension [Self <: SchemaV1Beta1ServiceIdentity](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagNull: Self = StObject.set(x, "tag", null)
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    
    inline def setUniqueIdNull: Self = StObject.set(x, "uniqueId", null)
    
    inline def setUniqueIdUndefined: Self = StObject.set(x, "uniqueId", js.undefined)
  }
}
