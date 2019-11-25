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
  var resize: js.UndefOr[Anon_BorderAnonColorSideColorType] = js.undefined
}

object Anon_GroupEnd {
  @scala.inline
  def apply(
    groupEnd: Anon_BorderAnonSide = null,
    groupHeader: Anon_BackgroundBorderFill = null,
    header: js.Object = null,
    icons: Anon_Ascending = null,
    primary: Anon_Weight = null,
    resize: Anon_BorderAnonColorSideColorType = null
  ): Anon_GroupEnd = {
    val __obj = js.Dynamic.literal()
    if (groupEnd != null) __obj.updateDynamic("groupEnd")(groupEnd.asInstanceOf[js.Any])
    if (groupHeader != null) __obj.updateDynamic("groupHeader")(groupHeader.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GroupEnd]
  }
}

