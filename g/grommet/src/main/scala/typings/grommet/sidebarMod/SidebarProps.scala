package typings.grommet.sidebarMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SidebarProps extends js.Object {
  var footer: js.UndefOr[ReactNode] = js.undefined
  var header: js.UndefOr[ReactNode] = js.undefined
}

object SidebarProps {
  @scala.inline
  def apply(footer: ReactNode = null, header: ReactNode = null): SidebarProps = {
    val __obj = js.Dynamic.literal()
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[SidebarProps]
  }
}

