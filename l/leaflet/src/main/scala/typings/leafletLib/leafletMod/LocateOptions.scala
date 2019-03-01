package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var maximumAge: js.UndefOr[scala.Double] = js.undefined
  var setView: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var watch: js.UndefOr[scala.Boolean] = js.undefined
}

object LocateOptions {
  @scala.inline
  def apply(
    enableHighAccuracy: js.UndefOr[scala.Boolean] = js.undefined,
    maxZoom: scala.Int | scala.Double = null,
    maximumAge: scala.Int | scala.Double = null,
    setView: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    watch: js.UndefOr[scala.Boolean] = js.undefined
  ): LocateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (maximumAge != null) __obj.updateDynamic("maximumAge")(maximumAge.asInstanceOf[js.Any])
    if (!js.isUndefined(setView)) __obj.updateDynamic("setView")(setView)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[LocateOptions]
  }
}

