package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeLog extends StObject {
  
  /** Account ID of the modified object. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Action which caused the change. */
  var action: js.UndefOr[String] = js.native
  
  var changeTime: js.UndefOr[String] = js.native
  
  /** Field name of the object which changed. */
  var fieldName: js.UndefOr[String] = js.native
  
  /** ID of this change log. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLog". */
  var kind: js.UndefOr[String] = js.native
  
  /** New value of the object field. */
  var newValue: js.UndefOr[String] = js.native
  
  /** ID of the object of this change log. The object could be a campaign, placement, ad, or other type. */
  var objectId: js.UndefOr[String] = js.native
  
  /** Object type of the change log. */
  var objectType: js.UndefOr[String] = js.native
  
  /** Old value of the object field. */
  var oldValue: js.UndefOr[String] = js.native
  
  /** Subaccount ID of the modified object. */
  var subaccountId: js.UndefOr[String] = js.native
  
  /** Transaction ID of this change log. When a single API call results in many changes, each change will have a separate ID in the change log but will share the same transactionId. */
  var transactionId: js.UndefOr[String] = js.native
  
  /** ID of the user who modified the object. */
  var userProfileId: js.UndefOr[String] = js.native
  
  /** User profile name of the user who modified the object. */
  var userProfileName: js.UndefOr[String] = js.native
}
object ChangeLog {
  
  @scala.inline
  def apply(): ChangeLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeLog]
  }
  
  @scala.inline
  implicit class ChangeLogMutableBuilder[Self <: ChangeLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setChangeTime(value: String): Self = StObject.set(x, "changeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTimeUndefined: Self = StObject.set(x, "changeTime", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    @scala.inline
    def setUserProfileId(value: String): Self = StObject.set(x, "userProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileIdUndefined: Self = StObject.set(x, "userProfileId", js.undefined)
    
    @scala.inline
    def setUserProfileName(value: String): Self = StObject.set(x, "userProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProfileNameUndefined: Self = StObject.set(x, "userProfileName", js.undefined)
  }
}
