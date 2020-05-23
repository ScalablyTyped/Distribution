package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait SaveWidgetOptions extends js.Object {
  var attribution: js.UndefOr[Attribution] = js.undefined
  var place: js.UndefOr[Place] = js.undefined
}

object SaveWidgetOptions {
  @scala.inline
  def apply(attribution: Attribution = null, place: Place = null): SaveWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveWidgetOptions]
  }
}

