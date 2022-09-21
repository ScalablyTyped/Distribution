package typings.googleapis.serviceconsumermanagementV1beta1Mod.serviceconsumermanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaV1beta1ServiceAccount extends StObject {
  
  /**
    * The email address of the service account.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. See b/136209818.
    */
  var iamAccountName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * P4 SA resource name. An example name would be: `services/serviceconsumermanagement.googleapis.com/projects/123/serviceAccounts/default`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The P4 SA configuration tag. This must be defined in activation_grants. If not specified when creating the account, the tag is set to "default".
    */
  var tag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique and stable id of the service account.
    */
  var uniqueId: js.UndefOr[String | Null] = js.undefined
}
object SchemaV1beta1ServiceAccount {
  
  inline def apply(): SchemaV1beta1ServiceAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaV1beta1ServiceAccount]
  }
  
  extension [Self <: SchemaV1beta1ServiceAccount](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setIamAccountName(value: String): Self = StObject.set(x, "iamAccountName", value.asInstanceOf[js.Any])
    
    inline def setIamAccountNameNull: Self = StObject.set(x, "iamAccountName", null)
    
    inline def setIamAccountNameUndefined: Self = StObject.set(x, "iamAccountName", js.undefined)
    
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
