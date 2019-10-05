package typings.heremaps.H.service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which are used to initialize the tile provider.
  * @property crossOrigin {boolean=} - The string to be set for the crossOrigin attribute for loaded images
  */
trait TileProviderOptions extends js.Object {
  var crossOrigin: js.UndefOr[Boolean] = js.undefined
}

object TileProviderOptions {
  @scala.inline
  def apply(crossOrigin: js.UndefOr[Boolean] = js.undefined): TileProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crossOrigin)) __obj.updateDynamic("crossOrigin")(crossOrigin)
    __obj.asInstanceOf[TileProviderOptions]
  }
}

