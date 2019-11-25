package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyFooter extends js.Object {
  var body: js.UndefOr[Anon_AlignBackgroundBorder] = js.undefined
  var footer: js.UndefOr[Anon_AlignBackgroundBorderExtend] = js.undefined
  var header: js.UndefOr[Anon_AlignBackground] = js.undefined
  var row: js.UndefOr[Anon_Hover] = js.undefined
}

object Anon_BodyFooter {
  @scala.inline
  def apply(
    body: Anon_AlignBackgroundBorder = null,
    footer: Anon_AlignBackgroundBorderExtend = null,
    header: Anon_AlignBackground = null,
    row: Anon_Hover = null
  ): Anon_BodyFooter = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyFooter]
  }
}

