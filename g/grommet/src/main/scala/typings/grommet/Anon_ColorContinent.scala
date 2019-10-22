package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorContinent extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var continent: js.UndefOr[Anon_ActiveBase] = js.undefined
  var hover: js.UndefOr[Anon_ColorColorType] = js.undefined
  var place: js.UndefOr[Anon_ActiveBase] = js.undefined
}

object Anon_ColorContinent {
  @scala.inline
  def apply(
    color: ColorType = null,
    continent: Anon_ActiveBase = null,
    hover: Anon_ColorColorType = null,
    place: Anon_ActiveBase = null
  ): Anon_ColorContinent = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (continent != null) __obj.updateDynamic("continent")(continent)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (place != null) __obj.updateDynamic("place")(place)
    __obj.asInstanceOf[Anon_ColorContinent]
  }
}

