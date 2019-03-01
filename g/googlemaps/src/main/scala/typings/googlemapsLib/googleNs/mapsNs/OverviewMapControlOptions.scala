package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverviewMapControlOptions extends js.Object {
  var opened: js.UndefOr[scala.Boolean] = js.undefined
}

object OverviewMapControlOptions {
  @scala.inline
  def apply(opened: js.UndefOr[scala.Boolean] = js.undefined): OverviewMapControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opened)) __obj.updateDynamic("opened")(opened)
    __obj.asInstanceOf[OverviewMapControlOptions]
  }
}

