package typings.intercomClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSegmentid extends js.Object {
  var segment_id: js.UndefOr[String] = js.undefined
  var tag_id: js.UndefOr[String] = js.undefined
}

object AnonSegmentid {
  @scala.inline
  def apply(segment_id: String = null, tag_id: String = null): AnonSegmentid = {
    val __obj = js.Dynamic.literal()
    if (segment_id != null) __obj.updateDynamic("segment_id")(segment_id.asInstanceOf[js.Any])
    if (tag_id != null) __obj.updateDynamic("tag_id")(tag_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSegmentid]
  }
}

