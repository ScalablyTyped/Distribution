package typings.heremaps.HNs.mapNs.providerNs.ImageTileProviderNs

import typings.heremaps.HNs.mapNs.ICopyright
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to initialize an ImageTileProvider instance
  * @property uri {string=} - The provider's unique resource identifier which must not contain an underscore "_". If omitted an auto-generated unique Session ID is used. If a cross
  * sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property getCopyrights {(function(H.geo.Rect, number): ?Array<H.map.ICopyright>)=} - A function to replace the default implementation of H.map.provider.Provider#getCopyrights
  * @property tileSize {number=} - The size of a tile as edge length in pixels. It must be 2^n where n is in range [0 ... 30], default is 256
  * @property getURL {function(number, number, number)} - The function to create an URL for the specified tile. If it returns a falsy the tile is not requested.
  * @property crossOrigin {(string | boolean=)} - The CORS settings to use for the crossOrigin attribute for the image, if omitted or if the value evaluates to false no CORS settings
  * are used.
  */
trait Options extends js.Object {
  var crossOrigin: js.UndefOr[String | Boolean] = js.undefined
  var getCopyrights: js.UndefOr[
    js.Function2[/* rect */ typings.heremaps.HNs.geoNs.Rect, /* n */ Double, js.Array[ICopyright]]
  ] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  def getURL(n1: Double, n2: Double, n3: Double): String
}

object Options {
  @scala.inline
  def apply(
    getURL: (Double, Double, Double) => String,
    crossOrigin: String | Boolean = null,
    getCopyrights: (/* rect */ typings.heremaps.HNs.geoNs.Rect, /* n */ Double) => js.Array[ICopyright] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    tileSize: Int | Double = null,
    uri: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(getURL = js.Any.fromFunction3(getURL))
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin.asInstanceOf[js.Any])
    if (getCopyrights != null) __obj.updateDynamic("getCopyrights")(js.Any.fromFunction2(getCopyrights))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Options]
  }
}

