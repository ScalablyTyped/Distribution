package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddMatterPermissionsRequest extends StObject {
  
  /**
    * Only relevant if **sendEmails** is **true**. To CC the requestor in the email message, set to **true**. To not CC requestor, set to **false**.
    */
  var ccMe: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The account and its role to add.
    */
  var matterPermission: js.UndefOr[SchemaMatterPermission] = js.undefined
  
  /**
    * To send a notification email to the added account, set to **true**. To not send a notification email, set to **false**.
    */
  var sendEmails: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaAddMatterPermissionsRequest {
  
  inline def apply(): SchemaAddMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddMatterPermissionsRequest]
  }
  
  extension [Self <: SchemaAddMatterPermissionsRequest](x: Self) {
    
    inline def setCcMe(value: Boolean): Self = StObject.set(x, "ccMe", value.asInstanceOf[js.Any])
    
    inline def setCcMeNull: Self = StObject.set(x, "ccMe", null)
    
    inline def setCcMeUndefined: Self = StObject.set(x, "ccMe", js.undefined)
    
    inline def setMatterPermission(value: SchemaMatterPermission): Self = StObject.set(x, "matterPermission", value.asInstanceOf[js.Any])
    
    inline def setMatterPermissionUndefined: Self = StObject.set(x, "matterPermission", js.undefined)
    
    inline def setSendEmails(value: Boolean): Self = StObject.set(x, "sendEmails", value.asInstanceOf[js.Any])
    
    inline def setSendEmailsNull: Self = StObject.set(x, "sendEmails", null)
    
    inline def setSendEmailsUndefined: Self = StObject.set(x, "sendEmails", js.undefined)
  }
}
