package typings.materialUiCore.noSsrNoSsrMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoSsrProps extends js.Object {
  var children: ReactNode = js.native
  var fallback: js.UndefOr[ReactNode] = js.native
}

object NoSsrProps {
  @scala.inline
  def apply(children: ReactNode = null, fallback: ReactNode = null): NoSsrProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSsrProps]
  }
}

