package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContinent extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var continent: js.UndefOr[AnonBase] = js.undefined
  var hover: js.UndefOr[Anon0] = js.undefined
  var place: js.UndefOr[AnonBase] = js.undefined
}

object AnonContinent {
  @scala.inline
  def apply(color: ColorType = null, continent: AnonBase = null, hover: Anon0 = null, place: AnonBase = null): AnonContinent = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContinent]
  }
}

