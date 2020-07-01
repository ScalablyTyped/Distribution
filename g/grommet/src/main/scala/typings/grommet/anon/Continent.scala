package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Continent extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var continent: js.UndefOr[Base] = js.undefined
  var hover: js.UndefOr[`1`] = js.undefined
  var place: js.UndefOr[Base] = js.undefined
}

object Continent {
  @scala.inline
  def apply(color: ColorType = null, continent: Base = null, hover: `1` = null, place: Base = null): Continent = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    __obj.asInstanceOf[Continent]
  }
}

