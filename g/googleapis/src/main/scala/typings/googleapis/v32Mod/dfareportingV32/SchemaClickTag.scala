package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Click Tag.
  */
@js.native
trait SchemaClickTag extends js.Object {
  /**
    * Parameter value for the specified click tag. This field contains a
    * click-through url.
    */
  var clickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.native
  /**
    * Advertiser event name associated with the click tag. This field is used
    * by DISPLAY_IMAGE_GALLERY and HTML5_BANNER creatives. Applicable to
    * DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var eventName: js.UndefOr[String] = js.native
  /**
    * Parameter name for the specified click tag. For DISPLAY_IMAGE_GALLERY
    * creative assets, this field must match the value of the creative
    * asset&#39;s creativeAssetId.name field.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaClickTag {
  @scala.inline
  def apply(): SchemaClickTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClickTag]
  }
  @scala.inline
  implicit class SchemaClickTagOps[Self <: SchemaClickTag] (val x: Self) extends AnyVal {
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
    def setClickThroughUrl(value: SchemaCreativeClickThroughUrl): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

