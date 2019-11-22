package typings.instagramDashPrivateDashApi.distTypesMediaDotConfigureDashSidecarDotOptionsMod

import typings.instagramDashPrivateDashApi.Anon_AndroidreleaseAndroidversion
import typings.instagramDashPrivateDashApi.Anon_Cropcenter
import typings.instagramDashPrivateDashApi.Anon_Sourceheight
import typings.instagramDashPrivateDashApi.distTypesPostingDotOptionsMod.PostingUsertags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureSidecarItem extends js.Object {
  var caption: js.UndefOr[Null] = js.undefined
  var device: js.UndefOr[Anon_AndroidreleaseAndroidversion | String] = js.undefined
  var edits: js.UndefOr[Anon_Cropcenter | String] = js.undefined
  var extra: js.UndefOr[Anon_Sourceheight | String] = js.undefined
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
    caption: Null = null,
    device: Anon_AndroidreleaseAndroidversion | String = null,
    edits: Anon_Cropcenter | String = null,
    extra: Anon_Sourceheight | String = null,
    source_type: String = null,
    timezone_offset: String = null,
    usertags: PostingUsertags | String = null
  ): MediaConfigureSidecarItem = {
    val __obj = js.Dynamic.literal(height = height, upload_id = upload_id, width = width)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (edits != null) __obj.updateDynamic("edits")(edits.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type)
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset)
    if (usertags != null) __obj.updateDynamic("usertags")(usertags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarItem]
  }
}

