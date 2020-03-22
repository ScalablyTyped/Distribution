package typings.intercomClient

import typings.intercomClient.intercomClientStrings.segmentDotlist
import typings.intercomClient.userMod.Segment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSegments extends js.Object {
  var segments: js.Array[Segment]
  var `type`: segmentDotlist
}

object AnonSegments {
  @scala.inline
  def apply(segments: js.Array[Segment], `type`: segmentDotlist): AnonSegments = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSegments]
  }
}

