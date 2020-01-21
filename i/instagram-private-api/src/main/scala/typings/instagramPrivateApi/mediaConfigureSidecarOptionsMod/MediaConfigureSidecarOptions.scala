package typings.instagramPrivateApi.mediaConfigureSidecarOptionsMod

import typings.instagramPrivateApi.AnonAndroidreleaseAndroidversion
import typings.instagramPrivateApi.mediaConfigureOptionsMod.MediaLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaConfigureSidecarOptions extends js.Object {
  var _csrftoken: js.UndefOr[String] = js.undefined
  var _uid: js.UndefOr[String] = js.undefined
  var _uuid: js.UndefOr[String] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var children_metadata: js.Array[MediaConfigureSidecarItem]
  var client_sidecar_id: js.UndefOr[String] = js.undefined
  var device: js.UndefOr[AnonAndroidreleaseAndroidversion] = js.undefined
  var device_id: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[MediaLocation | String] = js.undefined
  var source_type: js.UndefOr[String] = js.undefined
  var timezone_offset: js.UndefOr[String] = js.undefined
  var upload_id: js.UndefOr[String] = js.undefined
}

object MediaConfigureSidecarOptions {
  @scala.inline
  def apply(
    children_metadata: js.Array[MediaConfigureSidecarItem],
    _csrftoken: String = null,
    _uid: String = null,
    _uuid: String = null,
    caption: String = null,
    client_sidecar_id: String = null,
    device: AnonAndroidreleaseAndroidversion = null,
    device_id: String = null,
    location: MediaLocation | String = null,
    source_type: String = null,
    timezone_offset: String = null,
    upload_id: String = null
  ): MediaConfigureSidecarOptions = {
    val __obj = js.Dynamic.literal(children_metadata = children_metadata.asInstanceOf[js.Any])
    if (_csrftoken != null) __obj.updateDynamic("_csrftoken")(_csrftoken.asInstanceOf[js.Any])
    if (_uid != null) __obj.updateDynamic("_uid")(_uid.asInstanceOf[js.Any])
    if (_uuid != null) __obj.updateDynamic("_uuid")(_uuid.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (client_sidecar_id != null) __obj.updateDynamic("client_sidecar_id")(client_sidecar_id.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (device_id != null) __obj.updateDynamic("device_id")(device_id.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (source_type != null) __obj.updateDynamic("source_type")(source_type.asInstanceOf[js.Any])
    if (timezone_offset != null) __obj.updateDynamic("timezone_offset")(timezone_offset.asInstanceOf[js.Any])
    if (upload_id != null) __obj.updateDynamic("upload_id")(upload_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaConfigureSidecarOptions]
  }
}

