package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a change that a user has made to a resource.
  */
@js.native
trait SchemaChangeLog extends js.Object {
  
  /**
    * Account ID of the modified object.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Action which caused the change.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Time when the object was modified.
    */
  var changeTime: js.UndefOr[String] = js.native
  
  /**
    * Field name of the object which changed.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /**
    * ID of this change log.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#changeLog&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * New value of the object field.
    */
  var newValue: js.UndefOr[String] = js.native
  
  /**
    * ID of the object of this change log. The object could be a campaign,
    * placement, ad, or other type.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * Object type of the change log.
    */
  var objectType: js.UndefOr[String] = js.native
  
  /**
    * Old value of the object field.
    */
  var oldValue: js.UndefOr[String] = js.native
  
  /**
    * Subaccount ID of the modified object.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Transaction ID of this change log. When a single API call results in many
    * changes, each change will have a separate ID in the change log but will
    * share the same transactionId.
    */
  var transactionId: js.UndefOr[String] = js.native
  
  /**
    * ID of the user who modified the object.
    */
  var userProfileId: js.UndefOr[String] = js.native
  
  /**
    * User profile name of the user who modified the object.
    */
  var userProfileName: js.UndefOr[String] = js.native
}
object SchemaChangeLog {
  
  @scala.inline
  def apply(): SchemaChangeLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeLog]
  }
  
  @scala.inline
  implicit class SchemaChangeLogOps[Self <: SchemaChangeLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setChangeTime(value: String): Self = this.set("changeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeTime: Self = this.set("changeTime", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setObjectType(value: String): Self = this.set("objectType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectType: Self = this.set("objectType", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = this.set("transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionId: Self = this.set("transactionId", js.undefined)
    
    @scala.inline
    def setUserProfileId(value: String): Self = this.set("userProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileId: Self = this.set("userProfileId", js.undefined)
    
    @scala.inline
    def setUserProfileName(value: String): Self = this.set("userProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProfileName: Self = this.set("userProfileName", js.undefined)
  }
}
