package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A particular location in the document.
  */
@js.native
trait SchemaLocation extends js.Object {
  /**
    * The zero-based index, in UTF-16 code units.  The index is relative to the
    * beginning of the segment specified by segment_id.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The ID of the header, footer or footnote the location is in. An empty
    * segment ID signifies the document&#39;s body.
    */
  var segmentId: js.UndefOr[String] = js.native
}

object SchemaLocation {
  @scala.inline
  def apply(index: Int | Double = null, segmentId: String = null): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocation]
  }
}

