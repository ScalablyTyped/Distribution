package typings
package atMaterialDashUiCoreLib.noSsrNoSsrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSsrProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var fallback: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object NoSsrProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNode, fallback: reactLib.reactMod.ReactNode = null): NoSsrProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSsrProps]
  }
}

