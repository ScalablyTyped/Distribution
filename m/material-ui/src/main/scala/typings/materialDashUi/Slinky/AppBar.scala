package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typings.materialDashUi.appBarMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.AppBarProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object AppBar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.appBarMod.default].asInstanceOf[String | js.Object]
  def apply(
    iconClassNameLeft: String = null,
    iconClassNameRight: String = null,
    iconElementLeft: ReactElement = null,
    iconElementRight: ReactElement = null,
    iconStyleLeft: CSSProperties = null,
    iconStyleRight: CSSProperties = null,
    onLeftIconButtonClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onRightIconButtonClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    onTitleClick: MouseEvent[js.Object, NativeMouseEvent] => Unit = null,
    showMenuIconButton: js.UndefOr[Boolean] = js.undefined,
    title: TagMod[Any] = null,
    titleStyle: CSSProperties = null,
    zDepth: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (iconClassNameLeft != null) __obj.updateDynamic("iconClassNameLeft")(iconClassNameLeft)
    if (iconClassNameRight != null) __obj.updateDynamic("iconClassNameRight")(iconClassNameRight)
    if (iconElementLeft != null) __obj.updateDynamic("iconElementLeft")(iconElementLeft)
    if (iconElementRight != null) __obj.updateDynamic("iconElementRight")(iconElementRight)
    if (iconStyleLeft != null) __obj.updateDynamic("iconStyleLeft")(iconStyleLeft)
    if (iconStyleRight != null) __obj.updateDynamic("iconStyleRight")(iconStyleRight)
    if (onLeftIconButtonClick != null) __obj.updateDynamic("onLeftIconButtonClick")(js.Any.fromFunction1(onLeftIconButtonClick))
    if (onRightIconButtonClick != null) __obj.updateDynamic("onRightIconButtonClick")(js.Any.fromFunction1(onRightIconButtonClick))
    if (onTitleClick != null) __obj.updateDynamic("onTitleClick")(js.Any.fromFunction1(onTitleClick))
    if (!js.isUndefined(showMenuIconButton)) __obj.updateDynamic("showMenuIconButton")(showMenuIconButton)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle)
    if (zDepth != null) __obj.updateDynamic("zDepth")(zDepth.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AppBarProps
}

