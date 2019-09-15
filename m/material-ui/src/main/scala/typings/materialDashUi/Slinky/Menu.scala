package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.materialDashUi.menuMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.MenusNs.MenuProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.ReactLink
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: onKeyDown, style, multiple, width, value */
object Menu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.menuMod.default].asInstanceOf[String | js.Object]
  def apply(
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    desktop: js.UndefOr[Boolean] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    initiallyKeyboardFocused: js.UndefOr[Boolean] = js.undefined,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    onChange: (/* e */ SyntheticEvent[js.Object, typings.react.Event], /* itemValue */ js.Any | js.Array[_]) => Unit = null,
    onEscKeyDown: KeyboardEvent[js.Object] => Unit = null,
    onItemClick: (/* e */ SyntheticEvent[js.Object, typings.react.Event], /* item */ typings.materialDashUi.underscoreUnderscoreMaterialUINs.MenusNs.MenuItem) => Unit = null,
    selectedMenuItemStyle: CSSProperties = null,
    valueLink: ReactLink[_ | js.Array[_]] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop)
    if (!js.isUndefined(disableAutoFocus)) __obj.updateDynamic("disableAutoFocus")(disableAutoFocus)
    if (!js.isUndefined(initiallyKeyboardFocused)) __obj.updateDynamic("initiallyKeyboardFocused")(initiallyKeyboardFocused)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(js.Any.fromFunction1(onEscKeyDown))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle)
    if (valueLink != null) __obj.updateDynamic("valueLink")(valueLink)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuProps
}

