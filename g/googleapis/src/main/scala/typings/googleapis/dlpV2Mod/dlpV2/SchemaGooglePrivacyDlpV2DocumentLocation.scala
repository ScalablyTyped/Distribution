package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a finding within a document.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DocumentLocation extends js.Object {
  /**
    * Offset of the line, from the beginning of the file, where the finding is
    * located.
    */
  var fileOffset: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2DocumentLocation {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DocumentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DocumentLocation]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DocumentLocationOps[Self <: SchemaGooglePrivacyDlpV2DocumentLocation] (val x: Self) extends AnyVal {
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
    def setFileOffset(value: String): Self = this.set("fileOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileOffset: Self = this.set("fileOffset", js.undefined)
  }
  
}

