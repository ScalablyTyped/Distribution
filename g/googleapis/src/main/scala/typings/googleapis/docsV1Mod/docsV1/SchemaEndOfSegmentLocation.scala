package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location at the end of a body, header, footer or footnote. The location is
  * immediately before the last newline in the document segment.
  */
@js.native
trait SchemaEndOfSegmentLocation extends js.Object {
  /**
    * The ID of the header, footer or footnote the location is in. An empty
    * segment ID signifies the document&#39;s body.
    */
  var segmentId: js.UndefOr[String] = js.native
}

object SchemaEndOfSegmentLocation {
  @scala.inline
  def apply(segmentId: String = null): SchemaEndOfSegmentLocation = {
    val __obj = js.Dynamic.literal()
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEndOfSegmentLocation]
  }
}

