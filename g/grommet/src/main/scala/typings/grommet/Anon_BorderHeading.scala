package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderHeading extends js.Object {
  var border: js.UndefOr[Anon_ColorSideColorType] = js.undefined
  var heading: js.UndefOr[Anon_Level] = js.undefined
  var icons: js.UndefOr[Anon_Collapse] = js.undefined
}

object Anon_BorderHeading {
  @scala.inline
  def apply(border: Anon_ColorSideColorType = null, heading: Anon_Level = null, icons: Anon_Collapse = null): Anon_BorderHeading = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderHeading]
  }
}

