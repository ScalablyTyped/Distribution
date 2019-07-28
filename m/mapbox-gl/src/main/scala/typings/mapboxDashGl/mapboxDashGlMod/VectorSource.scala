package typings.mapboxDashGl.mapboxDashGlMod

import typings.mapboxDashGl.mapboxDashGlStrings.tms
import typings.mapboxDashGl.mapboxDashGlStrings.vector
import typings.mapboxDashGl.mapboxDashGlStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorSource
  extends Source
     with AnySourceData
     with AnySourceImpl {
  var attribution: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[js.Array[Double]] = js.undefined
  var maxzoom: js.UndefOr[Double] = js.undefined
  var minzoom: js.UndefOr[Double] = js.undefined
  var scheme: js.UndefOr[xyz | tms] = js.undefined
  var tiles: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("type")
  var type_VectorSource: vector
  var url: js.UndefOr[String] = js.undefined
}

object VectorSource {
  @scala.inline
  def apply(
    `type`: vector,
    attribution: String = null,
    bounds: js.Array[Double] = null,
    maxzoom: Int | Double = null,
    minzoom: Int | Double = null,
    scheme: xyz | tms = null,
    tiles: js.Array[String] = null,
    url: String = null
  ): VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
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

