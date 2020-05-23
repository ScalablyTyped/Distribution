package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sourcetype extends js.Object {
  var source_type: String
  var upload_id: String
  var video: js.UndefOr[Audiomuted] = js.undefined
}

object Sourcetype {
  @scala.inline
  def apply(source_type: String, upload_id: String, video: Audiomuted = null): Sourcetype = {
    val __obj = js.Dynamic.literal(source_type = source_type.asInstanceOf[js.Any], upload_id = upload_id.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sourcetype]
  }
}

