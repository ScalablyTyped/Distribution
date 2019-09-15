package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.drawerMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.DrawerProps
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, open, className, width */
object Drawer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.drawerMod.default].asInstanceOf[String | js.Object]
  def apply(
    containerClassName: String = null,
    containerStyle: CSSProperties = null,
    disableSwipeToOpen: js.UndefOr[Boolean] = js.undefined,
    docked: js.UndefOr[Boolean] = js.undefined,
    onRequestChange: (/* opening */ Boolean, /* reason */ String) => Unit = null,
    openSecondary: js.UndefOr[Boolean] = js.undefined,
    overlayClassName: String = null,
    overlayStyle: CSSProperties = null,
    swipeAreaWidth: Int | Double = null,
    zDepth: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (!js.isUndefined(disableSwipeToOpen)) __obj.updateDynamic("disableSwipeToOpen")(disableSwipeToOpen)
    if (!js.isUndefined(docked)) __obj.updateDynamic("docked")(docked)
    if (onRequestChange != null) __obj.updateDynamic("onRequestChange")(js.Any.fromFunction2(onRequestChange))
    if (!js.isUndefined(openSecondary)) __obj.updateDynamic("openSecondary")(openSecondary)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (swipeAreaWidth != null) __obj.updateDynamic("swipeAreaWidth")(swipeAreaWidth.asInstanceOf[js.Any])
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DrawerProps
}

