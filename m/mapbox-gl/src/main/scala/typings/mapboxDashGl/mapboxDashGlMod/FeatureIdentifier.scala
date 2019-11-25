package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureIdentifier extends js.Object {
  var id: js.UndefOr[String | Double] = js.undefined
  var source: String
  var sourceLayer: js.UndefOr[String] = js.undefined
}

object FeatureIdentifier {
  @scala.inline
  def apply(source: String, id: String | Double = null, sourceLayer: String = null): FeatureIdentifier = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (sourceLayer != null) __obj.updateDynamic("sourceLayer")(sourceLayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureIdentifier]
  }
}

