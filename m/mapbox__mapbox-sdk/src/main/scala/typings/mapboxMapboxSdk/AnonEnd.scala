package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: Double
  var fonts: js.Array[String]
  var ownerId: js.UndefOr[String] = js.undefined
  var start: Double
}

object AnonEnd {
  @scala.inline
  def apply(end: Double, fonts: js.Array[String], start: Double, ownerId: String = null): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnd]
  }
}

