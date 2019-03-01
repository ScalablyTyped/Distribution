package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compact extends js.Object {
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var customAttribution: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_Compact {
  @scala.inline
  def apply(
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    customAttribution: java.lang.String | js.Array[java.lang.String] = null
  ): Anon_Compact = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (customAttribution != null) __obj.updateDynamic("customAttribution")(customAttribution.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Compact]
  }
}

