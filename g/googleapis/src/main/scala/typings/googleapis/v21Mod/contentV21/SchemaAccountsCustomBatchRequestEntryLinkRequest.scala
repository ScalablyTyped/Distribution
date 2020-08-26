package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountsCustomBatchRequestEntryLinkRequest extends js.Object {
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
  implicit class SchemaAccountsCustomBatchRequestEntryLinkRequestOps[Self <: SchemaAccountsCustomBatchRequestEntryLinkRequest] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setLinkType(value: String): Self = this.set("linkType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkType: Self = this.set("linkType", js.undefined)
    @scala.inline
    def setLinkedAccountId(value: String): Self = this.set("linkedAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkedAccountId: Self = this.set("linkedAccountId", js.undefined)
  }
  
}

