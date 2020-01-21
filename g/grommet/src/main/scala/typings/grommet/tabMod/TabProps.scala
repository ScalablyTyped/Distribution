package typings.grommet.tabMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var plain: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(plain: js.UndefOr[Boolean] = js.undefined, title: ReactNode = null): TabProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

