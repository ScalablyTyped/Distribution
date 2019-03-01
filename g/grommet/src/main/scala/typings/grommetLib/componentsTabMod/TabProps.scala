package typings
package grommetLib.componentsTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps extends js.Object {
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String | reactLib.reactMod.ReactNs.ReactNode = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabProps]
  }
}

