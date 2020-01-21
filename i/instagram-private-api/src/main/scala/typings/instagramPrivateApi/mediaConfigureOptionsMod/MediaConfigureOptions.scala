package typings.instagramPrivateApi.mediaConfigureOptionsMod

import typings.instagramPrivateApi.AnonCropcenterCroporiginalsize
import typings.instagramPrivateApi.AnonSourceheight
import typings.instagramPrivateApi.instagramPrivateApiStrings.`0`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureOptions extends js.Object {
  var disable_comments: js.UndefOr[Boolean] = js.undefined
  var edits: js.UndefOr[AnonCropcenterCroporiginalsize] = js.undefined
  var extra: js.UndefOr[AnonSourceheight] = js.undefined
  var geotag_enabled: js.UndefOr[`1` | `0`] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var media_folder: js.UndefOr[String] = js.undefined
  var media_latitude: js.UndefOr[String] = js.undefined
  var media_longitude: js.UndefOr[String] = js.undefined
  var posting_latitude: js.UndefOr[String] = js.undefined
  var posting_longitude: js.UndefOr[String] = js.undefined
  var scene_capture_type: js.UndefOr[String] = js.undefined
  var software: js.UndefOr[String] = js.undefined
  var source_type: js.UndefOr[String] = js.undefined
  var upload_id: String
  var width: js.UndefOr[Double] = js.undefined
}

object MediaConfigureOptions {
  @scala.inline
  def apply(
    upload_id: String,
    disable_comments: js.UndefOr[Boolean] = js.undefined,
    edits: AnonCropcenterCroporiginalsize = null,
    extra: AnonSourceheight = null,
    geotag_enabled: `1` | `0` = null,
    height: Int | Double = null,
    media_folder: String = null,
    media_latitude: String = null,
    media_longitude: String = null,
    posting_latitude: String = null,
    posting_longitude: String = null,
    scene_capture_type: String = null,
    software: String = null,
    source_type: String = null,
    width: Int | Double = null
  ): MediaConfigureOptions = {
    val __obj = js.Dynamic.literal(upload_id = upload_id.asInstanceOf[js.Any])
    if (!js.isUndefined(disable_comments)) __obj.updateDynamic("disable_comments")(disable_comments.asInstanceOf[js.Any])
    if (edits != null) __obj.updateDynamic("edits")(edits.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (geotag_enabled != null) __obj.updateDynamic("geotag_enabled")(geotag_enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (media_folder != null) __obj.updateDynamic("media_folder")(media_folder.asInstanceOf[js.Any])
    if (media_latitude != null) __obj.updateDynamic("media_latitude")(media_latitude.asInstanceOf[js.Any])
    if (media_longitude != null) __obj.updateDynamic("media_longitude")(media_longitude.asInstanceOf[js.Any])
    if (posting_latitude != null) __obj.updateDynamic("posting_latitude")(posting_latitude.asInstanceOf[js.Any])
    if (posting_longitude != null) __obj.updateDynamic("posting_longitude")(posting_longitude.asInstanceOf[js.Any])
    if (scene_capture_type != null) __obj.updateDynamic("scene_capture_type")(scene_capture_type.asInstanceOf[js.Any])
    if (software != null) __obj.updateDynamic("software")(software.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureOptions]
  }
}

