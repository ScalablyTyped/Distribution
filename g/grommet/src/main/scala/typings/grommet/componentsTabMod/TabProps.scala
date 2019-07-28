package typings.grommet.componentsTabMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var plain: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String | ReactNode] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(plain: js.UndefOr[Boolean] = js.undefined, title: String | ReactNode = null): TabProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

