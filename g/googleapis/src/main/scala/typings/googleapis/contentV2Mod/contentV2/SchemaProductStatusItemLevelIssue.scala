package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductStatusItemLevelIssue extends js.Object {
  /**
    * The attribute&#39;s name, if the issue is caused by a single attribute.
    */
  var attributeName: js.UndefOr[String] = js.native
  /**
    * The error code of the issue.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * A short issue description in English.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The destination the issue applies to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * A detailed issue description in English.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * The URL of a web page to help with resolving this issue.
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Whether the issue can be resolved by the merchant.
    */
  var resolution: js.UndefOr[String] = js.native
  /**
    * How this issue affects serving of the offer.
    */
  var servability: js.UndefOr[String] = js.native
}

object SchemaProductStatusItemLevelIssue {
  @scala.inline
  def apply(): SchemaProductStatusItemLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductStatusItemLevelIssue]
  }
  @scala.inline
  implicit class SchemaProductStatusItemLevelIssueOps[Self <: SchemaProductStatusItemLevelIssue] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeName: Self = this.set("attributeName", js.undefined)
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setServability(value: String): Self = this.set("servability", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServability: Self = this.set("servability", js.undefined)
  }
  
}

