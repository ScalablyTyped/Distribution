package typings.mapbox.mapboxMod._Global_.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerOptions extends js.Object {
  var filter: js.UndefOr[FilterFunction] = js.undefined
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.undefined
}

object FeatureLayerOptions {
  @scala.inline
  def apply(filter: /* feature */ js.Any => Boolean = null, sanitizer: /* template */ String => String = null): FeatureLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (sanitizer != null) __obj.updateDynamic("sanitizer")(js.Any.fromFunction1(sanitizer))
    __obj.asInstanceOf[FeatureLayerOptions]
  }
}

