package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteDriveMetadataAclFixStatus extends StObject {
  
  var fixability: js.UndefOr[String] = js.undefined
  
  /**
    * List of recipient email addresses for which access can be granted. This field contains the same email addresses from the GetMessagePreviewMetadata request if all recipients can be
    * successfully added to the ACL as determined by Drive ACL Fixer. For now, the field is non-empty if and only if the "fixability" value is "CAN_FIX".
    */
  var fixableEmailAddress: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * List of recipient email addresses for which an out-of-domain-sharing warning must be shown, stating that these email addresses are not in the Google Apps organization that the
    * requested item belong to. Empty if all recipients are in the same Google Apps organization.
    */
  var outOfDomainWarningEmailAddress: js.UndefOr[js.Array[String]] = js.undefined
}
object AppsDynamiteDriveMetadataAclFixStatus {
  
  inline def apply(): AppsDynamiteDriveMetadataAclFixStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteDriveMetadataAclFixStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteDriveMetadataAclFixStatus] (val x: Self) extends AnyVal {
    
    inline def setFixability(value: String): Self = StObject.set(x, "fixability", value.asInstanceOf[js.Any])
    
    inline def setFixabilityUndefined: Self = StObject.set(x, "fixability", js.undefined)
    
    inline def setFixableEmailAddress(value: js.Array[String]): Self = StObject.set(x, "fixableEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setFixableEmailAddressUndefined: Self = StObject.set(x, "fixableEmailAddress", js.undefined)
    
    inline def setFixableEmailAddressVarargs(value: String*): Self = StObject.set(x, "fixableEmailAddress", js.Array(value*))
    
    inline def setOutOfDomainWarningEmailAddress(value: js.Array[String]): Self = StObject.set(x, "outOfDomainWarningEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setOutOfDomainWarningEmailAddressUndefined: Self = StObject.set(x, "outOfDomainWarningEmailAddress", js.undefined)
    
    inline def setOutOfDomainWarningEmailAddressVarargs(value: String*): Self = StObject.set(x, "outOfDomainWarningEmailAddress", js.Array(value*))
  }
}
