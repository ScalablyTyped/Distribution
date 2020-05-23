package typings.leaflet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt extends js.Object {
  var alt: js.UndefOr[Double] = js.undefined
  var lat: Double
  var lng: Double
}

object Alt {
  @scala.inline
  def apply(lat: Double, lng: Double, alt: js.UndefOr[Double] = js.undefined): Alt = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    if (!js.isUndefined(alt)) __obj.updateDynamic("alt")(alt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
}

