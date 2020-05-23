package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocateOptions extends js.Object {
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var setView: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var watch: js.UndefOr[Boolean] = js.undefined
}

object LocateOptions {
  @scala.inline
  def apply(
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    maximumAge: js.UndefOr[Double] = js.undefined,
    setView: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    watch: js.UndefOr[Boolean] = js.undefined
  ): LocateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumAge)) __obj.updateDynamic("maximumAge")(maximumAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(setView)) __obj.updateDynamic("setView")(setView.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(watch)) __obj.updateDynamic("watch")(watch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocateOptions]
  }
}

