package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountsCustomBatchRequestEntryLinkRequest extends StObject {
  
  /**
    * Action to perform for this link. The &quot;request&quot; action is only
    * available to select merchants.
    */
  var action: js.UndefOr[String] = js.native
  
  /**
    * Type of the link between the two accounts.
    */
  var linkType: js.UndefOr[String] = js.native
  
  /**
    * The ID of the linked account.
    */
  var linkedAccountId: js.UndefOr[String] = js.native
}
object SchemaAccountsCustomBatchRequestEntryLinkRequest {
  
  @scala.inline
  def apply(): SchemaAccountsCustomBatchRequestEntryLinkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchRequestEntryLinkRequest]
  }
  
  @scala.inline
  implicit class SchemaAccountsCustomBatchRequestEntryLinkRequestMutableBuilder[Self <: SchemaAccountsCustomBatchRequestEntryLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkTypeUndefined: Self = StObject.set(x, "linkType", js.undefined)
    
    @scala.inline
    def setLinkedAccountId(value: String): Self = StObject.set(x, "linkedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedAccountIdUndefined: Self = StObject.set(x, "linkedAccountId", js.undefined)
  }
}
