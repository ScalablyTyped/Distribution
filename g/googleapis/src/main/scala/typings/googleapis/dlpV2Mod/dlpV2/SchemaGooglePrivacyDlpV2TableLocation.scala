package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a finding within a table.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TableLocation extends js.Object {
  /**
    * The zero-based index of the row where the finding is located.
    */
  var rowIndex: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2TableLocation {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TableLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TableLocation]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TableLocationOps[Self <: SchemaGooglePrivacyDlpV2TableLocation] (val x: Self) extends AnyVal {
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
    def setRowIndex(value: String): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowIndex: Self = this.set("rowIndex", js.undefined)
  }
  
}

