package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupEnd extends js.Object {
  var groupEnd: js.UndefOr[AnonBorderAnonSideSize] = js.undefined
  var groupHeader: js.UndefOr[AnonFill] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var icons: js.UndefOr[AnonAscending] = js.undefined
  var primary: js.UndefOr[AnonWeight] = js.undefined
  var resize: js.UndefOr[AnonBorderAnonColorSide] = js.undefined
}

object AnonGroupEnd {
  @scala.inline
  def apply(
    groupEnd: AnonBorderAnonSideSize = null,
    groupHeader: AnonFill = null,
    header: js.Object = null,
    icons: AnonAscending = null,
    primary: AnonWeight = null,
    resize: AnonBorderAnonColorSide = null
  ): AnonGroupEnd = {
    val __obj = js.Dynamic.literal()
    if (groupEnd != null) __obj.updateDynamic("groupEnd")(groupEnd.asInstanceOf[js.Any])
    if (groupHeader != null) __obj.updateDynamic("groupHeader")(groupHeader.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupEnd]
  }
}

