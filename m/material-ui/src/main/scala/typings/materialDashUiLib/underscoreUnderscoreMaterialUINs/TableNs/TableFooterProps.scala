package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableFooterProps extends js.Object {
  // <tfoot/> is element that get the 'other' properties
  var adjustForCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object TableFooterProps {
  @scala.inline
  def apply(
    adjustForCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): TableFooterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustForCheckbox)) __obj.updateDynamic("adjustForCheckbox")(adjustForCheckbox)
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableFooterProps]
  }
}

