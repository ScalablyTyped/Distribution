package typings.materialDashUi.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.materialDashUi.dropDownMenuMod.default
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.MenusNs.DropDownMenuProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.PopoverNs.PopoverAnimationProps
import typings.materialDashUi.underscoreUnderscoreMaterialUINs.propTypesNs.origin
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.SyntheticEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, disabled, multiple */
object DropDownMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.materialDashUi.dropDownMenuMod.default].asInstanceOf[String | js.Object]
  def apply(
    anchorOrigin: origin = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    animation: ReactComponentClass[PopoverAnimationProps] = null,
    iconButton: TagMod[Any] = null,
    iconStyle: CSSProperties = null,
    labelStyle: CSSProperties = null,
    listStyle: CSSProperties = null,
    maxHeight: Int | Double = null,
    menuItemStyle: CSSProperties = null,
    menuStyle: CSSProperties = null,
    onChange: (/* e */ SyntheticEvent[js.Object, typings.react.Event], /* index */ Double, /* menuItemValue */ js.Any) => Unit = null,
    onClose: /* e */ SyntheticEvent[js.Object, typings.react.Event] => Unit = null,
    openImmediately: js.UndefOr[Boolean] = js.undefined,
    selectedMenuItemStyle: CSSProperties = null,
    selectionRenderer: (/* value */ js.Any, /* menuItem */ js.Any) => Unit = null,
    targetOrigin: origin = null,
    underlineStyle: CSSProperties = null,
    value: js.Any = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (anchorOrigin != null) __obj.updateDynamic("anchorOrigin")(anchorOrigin)
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (iconButton != null) __obj.updateDynamic("iconButton")(iconButton)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (menuItemStyle != null) __obj.updateDynamic("menuItemStyle")(menuItemStyle)
    if (menuStyle != null) __obj.updateDynamic("menuStyle")(menuStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (!js.isUndefined(openImmediately)) __obj.updateDynamic("openImmediately")(openImmediately)
    if (selectedMenuItemStyle != null) __obj.updateDynamic("selectedMenuItemStyle")(selectedMenuItemStyle)
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction2(selectionRenderer))
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    if (underlineStyle != null) __obj.updateDynamic("underlineStyle")(underlineStyle)
    if (value != null) __obj.updateDynamic("value")(value)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DropDownMenuProps
}

