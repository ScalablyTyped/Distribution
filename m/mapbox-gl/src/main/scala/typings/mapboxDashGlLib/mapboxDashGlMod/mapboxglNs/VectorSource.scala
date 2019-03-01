package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorSource
  extends Source
     with AnySourceData
     with AnySourceImpl {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var bounds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var maxzoom: js.UndefOr[scala.Double] = js.undefined
  var minzoom: js.UndefOr[scala.Double] = js.undefined
  var scheme: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.xyz | mapboxDashGlLib.mapboxDashGlLibStrings.tms
  ] = js.undefined
  var tiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  @JSName("type")
  var type_VectorSource: mapboxDashGlLib.mapboxDashGlLibStrings.vector
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object VectorSource {
  @scala.inline
  def apply(
    `type`: mapboxDashGlLib.mapboxDashGlLibStrings.vector,
    attribution: java.lang.String = null,
    bounds: js.Array[scala.Double] = null,
    maxzoom: scala.Int | scala.Double = null,
    minzoom: scala.Int | scala.Double = null,
    scheme: mapboxDashGlLib.mapboxDashGlLibStrings.xyz | mapboxDashGlLib.mapboxDashGlLibStrings.tms = null,
    tiles: js.Array[java.lang.String] = null,
    url: java.lang.String = null
  ): VectorSource = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (maxzoom != null) __obj.updateDynamic("maxzoom")(maxzoom.asInstanceOf[js.Any])
    if (minzoom != null) __obj.updateDynamic("minzoom")(minzoom.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[VectorSource]
  }
}

