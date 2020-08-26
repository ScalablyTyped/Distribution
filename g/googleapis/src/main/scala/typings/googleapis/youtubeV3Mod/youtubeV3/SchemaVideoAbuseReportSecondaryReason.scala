package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaVideoAbuseReportSecondaryReason extends js.Object {
  /**
    * The ID of this abuse report secondary reason.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The localized label for this abuse report secondary reason.
    */
  var label: js.UndefOr[String] = js.native
}

object SchemaVideoAbuseReportSecondaryReason {
  @scala.inline
  def apply(): SchemaVideoAbuseReportSecondaryReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoAbuseReportSecondaryReason]
  }
  @scala.inline
  implicit class SchemaVideoAbuseReportSecondaryReasonOps[Self <: SchemaVideoAbuseReportSecondaryReason] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

