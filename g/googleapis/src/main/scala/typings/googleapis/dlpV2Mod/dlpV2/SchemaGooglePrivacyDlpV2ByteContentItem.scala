package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for bytes to inspect or redact.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ByteContentItem extends js.Object {
  /**
    * Content data to inspect or redact.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * The type of data stored in the bytes string. Default will be TEXT_UTF8.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2ByteContentItem {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ByteContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ByteContentItem]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ByteContentItemOps[Self <: SchemaGooglePrivacyDlpV2ByteContentItem] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

