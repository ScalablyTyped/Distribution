package typings.heremaps.HNs.serviceNs.PlatformNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used to create default layers
  * @property tileSize {number=} - tile size to be queried from the HERE Map Tile API, default is 256
  * @property ppi {number=} - 'ppi' parameter to use when querying tiles, default is not specified
  * @property lg {string=} - optional primary language parameter, default is not specified
  * @property lg2 {string=} - optional secondary language parameter, default is not specified
  * @property style {string=} - optional 'style' parameter to use when querying map tiles, default is not specified
  * @property pois {boolean=} - indicates if pois are displayed on the map
  * @property crossOrigin {(string | boolean=)} - indicates if CORS headers should be used for default layers, if false is specified, CORS headers are not set, defaults to 'anonymous'.
  * Be aware that storing of content is not possible if crossOrigin is not set to true (see H.Map#storeContent).
  */
trait DefaultLayersOptions extends js.Object {
  var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
  var lg: js.UndefOr[String] = js.undefined
  var lg2: js.UndefOr[String] = js.undefined
  var pois: js.UndefOr[Boolean] = js.undefined
  var ppi: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[String] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
}

object DefaultLayersOptions {
  @scala.inline
  def apply(
    crossOrigin: String | Boolean = null,
    lg: String = null,
    lg2: String = null,
    pois: js.UndefOr[Boolean] = js.undefined,
    ppi: Int | Double = null,
    style: String = null,
    tileSize: Int | Double = null
  ): DefaultLayersOptions = {
    val __obj = js.Dynamic.literal()
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (lg != null) __obj.updateDynamic("lg")(lg)
    if (lg2 != null) __obj.updateDynamic("lg2")(lg2)
    if (!js.isUndefined(pois)) __obj.updateDynamic("pois")(pois)
    if (ppi != null) __obj.updateDynamic("ppi")(ppi.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultLayersOptions]
  }
}

