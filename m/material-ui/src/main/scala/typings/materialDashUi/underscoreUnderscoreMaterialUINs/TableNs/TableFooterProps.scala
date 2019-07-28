package typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableFooterProps extends js.Object {
  // <tfoot/> is element that get the 'other' properties
  var adjustForCheckbox: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableFooterProps {
  @scala.inline
  def apply(
    adjustForCheckbox: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    style: CSSProperties = null
  ): TableFooterProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustForCheckbox)) __obj.updateDynamic("adjustForCheckbox")(adjustForCheckbox)
    if (className != null) __obj.updateDynamic("className")(className)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableFooterProps]
  }
}

