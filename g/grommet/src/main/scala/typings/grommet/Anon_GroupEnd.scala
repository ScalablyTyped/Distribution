package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupEnd extends js.Object {
  var groupEnd: js.UndefOr[Anon_BorderAnonSide] = js.undefined
  var groupHeader: js.UndefOr[Anon_BackgroundBorderFill] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var icons: js.UndefOr[Anon_Ascending] = js.undefined
  var primary: js.UndefOr[Anon_Weight] = js.undefined
  var resize: js.UndefOr[Anon_BorderAnonColorSide] = js.undefined
}

object Anon_GroupEnd {
  @scala.inline
  def apply(
    groupEnd: Anon_BorderAnonSide = null,
    groupHeader: Anon_BackgroundBorderFill = null,
    header: js.Object = null,
    icons: Anon_Ascending = null,
    primary: Anon_Weight = null,
    resize: Anon_BorderAnonColorSide = null
  ): Anon_GroupEnd = {
    val __obj = js.Dynamic.literal()
    if (groupEnd != null) __obj.updateDynamic("groupEnd")(groupEnd)
    if (groupHeader != null) __obj.updateDynamic("groupHeader")(groupHeader)
    if (header != null) __obj.updateDynamic("header")(header)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (primary != null) __obj.updateDynamic("primary")(primary)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[Anon_GroupEnd]
  }
}

