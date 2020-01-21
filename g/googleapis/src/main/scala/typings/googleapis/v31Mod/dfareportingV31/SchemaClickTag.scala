package typings.googleapis.v31Mod.dfareportingV31

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
  def apply(
    clickThroughUrl: SchemaCreativeClickThroughUrl = null,
    eventName: String = null,
    name: String = null
  ): SchemaClickTag = {
    val __obj = js.Dynamic.literal()
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaClickTag]
  }
}

