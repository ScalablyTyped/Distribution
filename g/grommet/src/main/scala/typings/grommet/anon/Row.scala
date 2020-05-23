package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Row extends js.Object {
  var body: js.UndefOr[AlignBackground] = js.undefined
  var footer: js.UndefOr[BackgroundBorder] = js.undefined
  var header: js.UndefOr[VerticalAlign] = js.undefined
  var row: js.UndefOr[HoverBackgroundExtend] = js.undefined
}

object Row {
  @scala.inline
  def apply(
    body: AlignBackground = null,
    footer: BackgroundBorder = null,
    header: VerticalAlign = null,
    row: HoverBackgroundExtend = null
  ): Row = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
}

