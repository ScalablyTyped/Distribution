package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAccountStatusAccountLevelIssue extends js.Object {
  /**
    * Country for which this issue is reported.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The destination the issue applies to.
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Additional details about the issue.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * The URL of a web page to help resolving this issue.
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Issue identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Severity of the issue.
    */
  var severity: js.UndefOr[String] = js.native
  /**
    * Short description of the issue.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaAccountStatusAccountLevelIssue {
  @scala.inline
  def apply(): SchemaAccountStatusAccountLevelIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusAccountLevelIssue]
  }
  @scala.inline
  implicit class SchemaAccountStatusAccountLevelIssueOps[Self <: SchemaAccountStatusAccountLevelIssue] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

