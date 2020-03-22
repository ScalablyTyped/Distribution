package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRow extends js.Object {
  var body: js.UndefOr[AnonAlignBackground] = js.undefined
  var footer: js.UndefOr[AnonBackgroundBorder] = js.undefined
  var header: js.UndefOr[AnonVerticalAlign] = js.undefined
  var row: js.UndefOr[AnonHoverAnonBackgroundExtend] = js.undefined
}

object AnonRow {
  @scala.inline
  def apply(
    body: AnonAlignBackground = null,
    footer: AnonBackgroundBorder = null,
    header: AnonVerticalAlign = null,
    row: AnonHoverAnonBackgroundExtend = null
  ): AnonRow = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRow]
  }
}

