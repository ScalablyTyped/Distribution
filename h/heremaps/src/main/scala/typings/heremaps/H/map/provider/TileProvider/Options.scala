package typings.heremaps.H.map.provider.TileProvider

import typings.heremaps.H.map.ICopyright
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property uri {string=} - The provider&#x27;s unique resource identifier which must not contain an underscore &quot;_&quot;. If omitted an auto-generated unique Session ID is used.
  * If a cross sessions consistent IDs is needed (e.g. for storing provider data) this property must be specified.
  * @property min {number=} - The minimal supported zoom level, default is 0
  * @property max {number=} - The maximal supported zoom level, default is 22
  * @property getCopyrights {(function(H.geo.Rect, number): Array<H.map.ICopyright>)=} - A function to replace the default implememtation of H.map.provider.Provider#getCopyrights
  * @property tileSize {number=} - The size of a tile as edge length in pixels. It must be 2^n where n is in range [0 ... 30], default is 256
  */
trait Options extends js.Object {
  var getCopyrights: js.UndefOr[
    js.Function2[/* rect */ typings.heremaps.H.geo.Rect, /* number */ Double, js.Array[ICopyright]]
  ] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    getCopyrights: (/* rect */ typings.heremaps.H.geo.Rect, /* number */ Double) => js.Array[ICopyright] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    tileSize: Int | Double = null,
    uri: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (getCopyrights != null) __obj.updateDynamic("getCopyrights")(js.Any.fromFunction2(getCopyrights))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[Options]
  }
}

