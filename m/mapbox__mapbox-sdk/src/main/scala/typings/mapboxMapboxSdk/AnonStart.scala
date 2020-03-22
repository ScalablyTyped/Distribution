package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends js.Object {
  var ownerId: js.UndefOr[String] = js.undefined
  var start: js.UndefOr[String] = js.undefined
}

object AnonStart {
  @scala.inline
  def apply(ownerId: String = null, start: String = null): AnonStart = {
    val __obj = js.Dynamic.literal()
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStart]
  }
}

