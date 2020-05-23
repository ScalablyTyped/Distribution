package typings.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typings.instagramPrivateApi.anon.Androidversion
import typings.instagramPrivateApi.anon.Cropcenter
import typings.instagramPrivateApi.anon.Sourceheight
import typings.instagramPrivateApi.postingOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureSidecarItem extends js.Object {
  var caption: js.UndefOr[Null] = js.undefined
  var device: js.UndefOr[Androidversion | String] = js.undefined
  var edits: js.UndefOr[Cropcenter | String] = js.undefined
  var extra: js.UndefOr[Sourceheight | String] = js.undefined
  var height: Double
  var source_type: js.UndefOr[String] = js.undefined
  var timezone_offset: js.UndefOr[String] = js.undefined
  var upload_id: String
  var usertags: js.UndefOr[PostingUsertags | String] = js.undefined
  var width: Double
}

object MediaConfigureSidecarItem {
  @scala.inline
  def apply(
    height: Double,
    upload_id: String,
    width: Double,
    device: Androidversion | String = null,
    edits: Cropcenter | String = null,
    extra: Sourceheight | String = null,
    source_type: String = null,
    timezone_offset: String = null,
    usertags: PostingUsertags | String = null
  ): MediaConfigureSidecarItem = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (edits != null) __obj.updateDynamic("edits")(edits.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset.asInstanceOf[js.Any])
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarItem]
  }
}

