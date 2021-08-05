package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsCustomBatchRequestEntryLinkRequest extends StObject {
  
  /**
    * Action to perform for this link. The &quot;request&quot; action is only
    * available to select merchants.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the link between the two accounts.
    */
  var linkType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the linked account.
    */
  var linkedAccountId: js.UndefOr[String] = js.undefined
}
object SchemaAccountsCustomBatchRequestEntryLinkRequest {
  
  inline def apply(): SchemaAccountsCustomBatchRequestEntryLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequestEntryLinkRequest]
  }
  
  extension [Self <: SchemaAccountsCustomBatchRequestEntryLinkRequest](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    inline def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    inline def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    inline def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
  }
}
