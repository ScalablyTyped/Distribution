package typings.grommet.dataTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sections[TBody, THeader, TFooter] extends js.Object {
  var body: js.UndefOr[TBody] = js.undefined
  var footer: js.UndefOr[TFooter] = js.undefined
  var header: js.UndefOr[THeader] = js.undefined
}

object Sections {
  @scala.inline
  def apply[TBody, THeader, TFooter](body: TBody = null, footer: TFooter = null, header: THeader = null): Sections[TBody, THeader, TFooter] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sections[TBody, THeader, TFooter]]
  }
}

