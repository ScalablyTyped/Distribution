package typings.mapboxGl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compact extends js.Object {
  var compact: js.UndefOr[Boolean] = js.undefined
  var customAttribution: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Compact {
  @scala.inline
  def apply(compact: js.UndefOr[Boolean] = js.undefined, customAttribution: String | js.Array[String] = null): Compact = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (customAttribution != null) __obj.updateDynamic("customAttribution")(customAttribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compact]
  }
}

