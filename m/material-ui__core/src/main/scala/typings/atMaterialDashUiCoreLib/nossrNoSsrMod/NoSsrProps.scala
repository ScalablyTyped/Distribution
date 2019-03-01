package typings
package atMaterialDashUiCoreLib.nossrNoSsrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSsrProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var fallback: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object NoSsrProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    fallback: reactLib.reactMod.ReactNs.ReactNode = null
  ): NoSsrProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSsrProps]
  }
}

