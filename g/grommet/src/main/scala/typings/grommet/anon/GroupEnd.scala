package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupEnd extends js.Object {
  var groupEnd: js.UndefOr[BorderSideSize] = js.undefined
  var groupHeader: js.UndefOr[Fill] = js.undefined
  var header: js.UndefOr[js.Object] = js.undefined
  var icons: js.UndefOr[Ascending] = js.undefined
  var primary: js.UndefOr[Weight] = js.undefined
  var resize: js.UndefOr[BorderColorSide] = js.undefined
}

object GroupEnd {
  @scala.inline
  def apply(
    groupEnd: BorderSideSize = null,
    groupHeader: Fill = null,
    header: js.Object = null,
    icons: Ascending = null,
    primary: Weight = null,
    resize: BorderColorSide = null
  ): GroupEnd = {
    val __obj = js.Dynamic.literal()
    if (groupEnd != null) __obj.updateDynamic("groupEnd")(groupEnd.asInstanceOf[js.Any])
    if (groupHeader != null) __obj.updateDynamic("groupHeader")(groupHeader.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupEnd]
  }
}

