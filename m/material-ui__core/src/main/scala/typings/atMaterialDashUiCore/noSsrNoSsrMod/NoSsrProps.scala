package typings.atMaterialDashUiCore.noSsrNoSsrMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSsrProps extends js.Object {
  var children: ReactNode
  var fallback: js.UndefOr[ReactNode] = js.undefined
}

object NoSsrProps {
  @scala.inline
  def apply(children: ReactNode, fallback: ReactNode = null): NoSsrProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSsrProps]
  }
}

