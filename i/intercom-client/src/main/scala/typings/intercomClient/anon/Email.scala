package typings.intercomClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var segment_id: js.UndefOr[String] = js.undefined
  var tag_id: js.UndefOr[String] = js.undefined
}

object Email {
  @scala.inline
  def apply(email: String = null, segment_id: String = null, tag_id: String = null): Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (segment_id != null) __obj.updateDynamic("segment_id")(segment_id.asInstanceOf[js.Any])
    if (tag_id != null) __obj.updateDynamic("tag_id")(tag_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

