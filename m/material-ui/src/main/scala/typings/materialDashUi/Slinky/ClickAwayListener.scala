package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.internalClickAwayListenerMod.ClickAwayListenerProps
import typings.materialDashUi.internalClickAwayListenerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children */
object ClickAwayListener
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.internalClickAwayListenerMod.default].asInstanceOf[String | js.Object]
  def apply(onClickAway: js.Any = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onClickAway != null) __obj.updateDynamic("onClickAway")(onClickAway)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ClickAwayListenerProps
}

