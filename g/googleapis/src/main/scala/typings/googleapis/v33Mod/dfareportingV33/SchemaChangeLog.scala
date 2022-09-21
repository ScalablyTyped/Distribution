package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChangeLog extends StObject {
  
  /**
    * Account ID of the modified object.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Action which caused the change.
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  var changeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Field name of the object which changed.
    */
  var fieldName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this change log.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#changeLog".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * New value of the object field.
    */
  var newValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the object of this change log. The object could be a campaign, placement, ad, or other type.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Object type of the change log.
    */
  var objectType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Old value of the object field.
    */
  var oldValue: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subaccount ID of the modified object.
    */
  var subaccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Transaction ID of this change log. When a single API call results in many changes, each change will have a separate ID in the change log but will share the same transactionId.
    */
  var transactionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the user who modified the object.
    */
  var userProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User profile name of the user who modified the object.
    */
  var userProfileName: js.UndefOr[String | Null] = js.undefined
}
object SchemaChangeLog {
  
  inline def apply(): SchemaChangeLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeLog]
  }
  
  extension [Self <: SchemaChangeLog](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setChangeTime(value: String): Self = StObject.set(x, "changeTime", value.asInstanceOf[js.Any])
    
    inline def setChangeTimeNull: Self = StObject.set(x, "changeTime", null)
    
    inline def setChangeTimeUndefined: Self = StObject.set(x, "changeTime", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameNull: Self = StObject.set(x, "fieldName", null)
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdNull: Self = StObject.set(x, "subaccountId", null)
    
    inline def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdNull: Self = StObject.set(x, "transactionId", null)
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    inline def setUserProfileId(value: String): Self = StObject.set(x, "userProfileId", value.asInstanceOf[js.Any])
    
    inline def setUserProfileIdNull: Self = StObject.set(x, "userProfileId", null)
    
    inline def setUserProfileIdUndefined: Self = StObject.set(x, "userProfileId", js.undefined)
    
    inline def setUserProfileName(value: String): Self = StObject.set(x, "userProfileName", value.asInstanceOf[js.Any])
    
    inline def setUserProfileNameNull: Self = StObject.set(x, "userProfileName", null)
    
    inline def setUserProfileNameUndefined: Self = StObject.set(x, "userProfileName", js.undefined)
  }
}
