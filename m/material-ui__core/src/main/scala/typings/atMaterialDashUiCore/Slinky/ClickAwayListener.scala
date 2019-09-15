package typings.atMaterialDashUiCore.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.atMaterialDashUiCore.atMaterialDashUiCoreNumbers.`false`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onClick
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseDown
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseUp
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchEnd
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchStart
import typings.atMaterialDashUiCore.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
import typings.atMaterialDashUiCore.clickAwayListenerMod.default
import typings.react.reactMod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClickAwayListener
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.atMaterialDashUiCore.clickAwayListenerMod.default].asInstanceOf[String | js.Object]
  def apply(
    onClickAway: ChangeEvent[js.Object] => Unit,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ClickAwayListenerProps
}

