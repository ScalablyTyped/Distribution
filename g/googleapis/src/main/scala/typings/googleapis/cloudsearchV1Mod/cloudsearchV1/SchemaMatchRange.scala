package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Matched range of a snippet [start, end).
  */
@js.native
trait SchemaMatchRange extends js.Object {
  /**
    * End of the match in the snippet.
    */
  var end: js.UndefOr[Double] = js.native
  /**
    * Starting position of the match in the snippet.
    */
  var start: js.UndefOr[Double] = js.native
}

object SchemaMatchRange {
  @scala.inline
  def apply(end: Int | Double = null, start: Int | Double = null): SchemaMatchRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMatchRange]
  }
}

