package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerOptions extends js.Object {
  /**
    * The icon displayed when drawing a marker.
    *
    * @default L.Icon.Default()
    */
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  /**
    * Determines if the draw tool remains enabled after drawing a shape.
    *
    * @default false
    */
  var repeatMode: js.UndefOr[Boolean] = js.undefined
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}

object MarkerOptions {
  @scala.inline
  def apply(
    icon: Icon_[IconOptions] | DivIcon_ = null,
    repeatMode: js.UndefOr[Boolean] = js.undefined,
    zIndexOffset: js.UndefOr[Double] = js.undefined
  ): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexOffset)) __obj.updateDynamic("zIndexOffset")(zIndexOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerOptions]
  }
}

