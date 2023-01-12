package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteDriveMetadataAclFixRequest extends StObject {
  
  /**
    * For Spaces messages: This field is ignored. For DMs messages: The list of email addresses that should be added to the Drive item's ACL. In general, the list should not be empty when
    * the boolean "should_fix" field is set; otherwise, the list should be empty. During transition - when clients do not specify this field but the "should_fix" is true, we follow the
    * legacy behavior: share to all users in the DM regardless of emails. This behavior is being phased out.
    */
  var recipientEmails: js.UndefOr[js.Array[String]] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  /** Whether to attempt to fix the ACL by adding the room or DM members to the Drive file's ACL. */
  var shouldFix: js.UndefOr[Boolean] = js.undefined
}
object AppsDynamiteDriveMetadataAclFixRequest {
  
  inline def apply(): AppsDynamiteDriveMetadataAclFixRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteDriveMetadataAclFixRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteDriveMetadataAclFixRequest] (val x: Self) extends AnyVal {
    
    inline def setRecipientEmails(value: js.Array[String]): Self = StObject.set(x, "recipientEmails", value.asInstanceOf[js.Any])
    
    inline def setRecipientEmailsUndefined: Self = StObject.set(x, "recipientEmails", js.undefined)
    
    inline def setRecipientEmailsVarargs(value: String*): Self = StObject.set(x, "recipientEmails", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setShouldFix(value: Boolean): Self = StObject.set(x, "shouldFix", value.asInstanceOf[js.Any])
    
    inline def setShouldFixUndefined: Self = StObject.set(x, "shouldFix", js.undefined)
  }
}
