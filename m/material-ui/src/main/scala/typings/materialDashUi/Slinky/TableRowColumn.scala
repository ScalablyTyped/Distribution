package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.tableTableRowColumnMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs.TableRowColumnProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, colSpan, rowSpan */
object TableRowColumn
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.tableTableRowColumnMod.default].asInstanceOf[String | js.Object]
  def apply(
    columnNumber: Int | Double = null,
    hoverable: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit = null,
    onHover: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit = null,
    onHoverExit: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverable)) __obj.updateDynamic("hoverable")(hoverable)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2(onHover))
    if (onHoverExit != null) __obj.updateDynamic("onHoverExit")(js.Any.fromFunction2(onHoverExit))
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableRowColumnProps
}

