package typings.materialUi.MaterialUI.List

import typings.materialUi.MaterialUI.EnhancedButtonProps
import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends EnhancedButtonProps {
  // <EnhancedButton/> is the element that get the 'other' properties
  var autoGenerateNestedIndicator: js.UndefOr[Boolean] = js.native
  var hoverColor: js.UndefOr[String] = js.native
  var initiallyOpen: js.UndefOr[Boolean] = js.native
  var innerDivStyle: js.UndefOr[CSSProperties] = js.native
  var insetChildren: js.UndefOr[Boolean] = js.native
  var leftAvatar: js.UndefOr[ReactElement] = js.native
  var leftCheckbox: js.UndefOr[ReactElement] = js.native
  var leftIcon: js.UndefOr[ReactElement] = js.native
  var nestedItems: js.UndefOr[js.Array[ReactElement]] = js.native
  var nestedLevel: js.UndefOr[Double] = js.native
  var nestedListStyle: js.UndefOr[CSSProperties] = js.native
  var onNestedListToggle: js.UndefOr[js.Function1[/* item */ ListItem, Unit]] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var primaryText: js.UndefOr[ReactNode] = js.native
  var primaryTogglesNestedList: js.UndefOr[Boolean] = js.native
  var rightAvatar: js.UndefOr[ReactElement] = js.native
  var rightIcon: js.UndefOr[ReactElement] = js.native
  var rightIconButton: js.UndefOr[ReactElement] = js.native
  var rightToggle: js.UndefOr[ReactElement] = js.native
  var secondaryText: js.UndefOr[ReactNode] = js.native
  var secondaryTextLines: js.UndefOr[Double] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoGenerateNestedIndicator(value: Boolean): Self = this.set("autoGenerateNestedIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGenerateNestedIndicator: Self = this.set("autoGenerateNestedIndicator", js.undefined)
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    @scala.inline
    def setInitiallyOpen(value: Boolean): Self = this.set("initiallyOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiallyOpen: Self = this.set("initiallyOpen", js.undefined)
    @scala.inline
    def setInnerDivStyle(value: CSSProperties): Self = this.set("innerDivStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerDivStyle: Self = this.set("innerDivStyle", js.undefined)
    @scala.inline
    def setInsetChildren(value: Boolean): Self = this.set("insetChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsetChildren: Self = this.set("insetChildren", js.undefined)
    @scala.inline
    def setLeftAvatar(value: ReactElement): Self = this.set("leftAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftAvatar: Self = this.set("leftAvatar", js.undefined)
    @scala.inline
    def setLeftCheckbox(value: ReactElement): Self = this.set("leftCheckbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftCheckbox: Self = this.set("leftCheckbox", js.undefined)
    @scala.inline
    def setLeftIcon(value: ReactElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    @scala.inline
    def setNestedItemsVarargs(value: ReactElement*): Self = this.set("nestedItems", js.Array(value :_*))
    @scala.inline
    def setNestedItems(value: js.Array[ReactElement]): Self = this.set("nestedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedItems: Self = this.set("nestedItems", js.undefined)
    @scala.inline
    def setNestedLevel(value: Double): Self = this.set("nestedLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedLevel: Self = this.set("nestedLevel", js.undefined)
    @scala.inline
    def setNestedListStyle(value: CSSProperties): Self = this.set("nestedListStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNestedListStyle: Self = this.set("nestedListStyle", js.undefined)
    @scala.inline
    def setOnNestedListToggle(value: /* item */ ListItem => Unit): Self = this.set("onNestedListToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNestedListToggle: Self = this.set("onNestedListToggle", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setPrimaryText(value: ReactNode): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    @scala.inline
    def setPrimaryTogglesNestedList(value: Boolean): Self = this.set("primaryTogglesNestedList", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryTogglesNestedList: Self = this.set("primaryTogglesNestedList", js.undefined)
    @scala.inline
    def setRightAvatar(value: ReactElement): Self = this.set("rightAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightAvatar: Self = this.set("rightAvatar", js.undefined)
    @scala.inline
    def setRightIcon(value: ReactElement): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    @scala.inline
    def setRightIconButton(value: ReactElement): Self = this.set("rightIconButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIconButton: Self = this.set("rightIconButton", js.undefined)
    @scala.inline
    def setRightToggle(value: ReactElement): Self = this.set("rightToggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightToggle: Self = this.set("rightToggle", js.undefined)
    @scala.inline
    def setSecondaryText(value: ReactNode): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    @scala.inline
    def setSecondaryTextLines(value: Double): Self = this.set("secondaryTextLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryTextLines: Self = this.set("secondaryTextLines", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

