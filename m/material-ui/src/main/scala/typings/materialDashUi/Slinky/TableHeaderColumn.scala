package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.tableTableHeaderColumnMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs.TableHeaderColumnProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, colSpan, rowSpan */
object TableHeaderColumn
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.tableTableHeaderColumnMod.default].asInstanceOf[String | js.Object]
  def apply(
    columnNumber: Int | Double = null,
    onClick: (/* e */ MouseEvent[js.Object, NativeMouseEvent], /* column */ Double) => Unit = null,
    tooltip: String = null,
    tooltipStyle: CSSProperties = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (columnNumber != null) __obj.updateDynamic("columnNumber")(columnNumber.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltipStyle != null) __obj.updateDynamic("tooltipStyle")(tooltipStyle)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TableHeaderColumnProps
}

