package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.tms
import typings.mapboxGl.mapboxGlStrings.vector
import typings.mapboxGl.mapboxGlStrings.xyz
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
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.undefined
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
    maxzoom: js.UndefOr[Double] = js.undefined,
    minzoom: js.UndefOr[Double] = js.undefined,
    promoteId: PromoteIdSpecification = null,
    scheme: xyz | tms = null,
    tiles: js.Array[String] = null,
    url: String = null
  ): VectorSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(maxzoom)) __obj.updateDynamic("maxzoom")(maxzoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minzoom)) __obj.updateDynamic("minzoom")(minzoom.get.asInstanceOf[js.Any])
    if (promoteId != null) __obj.updateDynamic("promoteId")(promoteId.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (tiles != null) __obj.updateDynamic("tiles")(tiles.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorSource]
  }
}

