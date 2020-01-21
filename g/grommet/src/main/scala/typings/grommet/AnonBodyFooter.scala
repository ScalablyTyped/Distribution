package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBodyFooter extends js.Object {
  var body: js.UndefOr[AnonAlignBackgroundBorder] = js.undefined
  var footer: js.UndefOr[AnonAlignBackgroundBorderExtend] = js.undefined
  var header: js.UndefOr[AnonAlignBackground] = js.undefined
  var row: js.UndefOr[AnonHover] = js.undefined
}

object AnonBodyFooter {
  @scala.inline
  def apply(
    body: AnonAlignBackgroundBorder = null,
    footer: AnonAlignBackgroundBorderExtend = null,
    header: AnonAlignBackground = null,
    row: AnonHover = null
  ): AnonBodyFooter = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBodyFooter]
  }
}

