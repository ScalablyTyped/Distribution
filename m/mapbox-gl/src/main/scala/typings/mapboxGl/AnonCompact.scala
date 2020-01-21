package typings.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompact extends js.Object {
  var compact: js.UndefOr[Boolean] = js.undefined
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AnonCompact {
  @scala.inline
  def apply(compact: js.UndefOr[Boolean] = js.undefined, customAttribution: String | js.Array[String] = null): AnonCompact = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customAttribution != null) __obj.updateDynamic("customAttribution")(customAttribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompact]
  }
}

