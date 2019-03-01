package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShowCompass extends js.Object {
  var showCompass: js.UndefOr[scala.Boolean] = js.undefined
  var showZoom: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ShowCompass {
  @scala.inline
  def apply(
    showCompass: js.UndefOr[scala.Boolean] = js.undefined,
    showZoom: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ShowCompass = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showCompass)) __obj.updateDynamic("showCompass")(showCompass)
    if (!js.isUndefined(showZoom)) __obj.updateDynamic("showZoom")(showZoom)
    __obj.asInstanceOf[Anon_ShowCompass]
  }
}

