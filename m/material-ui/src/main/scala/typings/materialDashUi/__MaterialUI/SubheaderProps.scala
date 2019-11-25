package typings.materialDashUi.__MaterialUI

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubheaderProps extends js.Object {
  var inset: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SubheaderProps {
  @scala.inline
  def apply(inset: js.UndefOr[Boolean] = js.undefined, style: CSSProperties = null): SubheaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubheaderProps]
  }
}

