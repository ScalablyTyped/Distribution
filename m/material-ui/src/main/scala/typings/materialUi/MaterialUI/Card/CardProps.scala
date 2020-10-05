package typings.materialUi.MaterialUI.Card

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  var expandable: js.UndefOr[Boolean] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var initiallyExpanded: js.UndefOr[Boolean] = js.native
  var onExpandChange: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.native
  var showExpandableButton: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CardProps {
  @scala.inline
  def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  @scala.inline
  implicit class CardPropsOps[Self <: CardProps] (val x: Self) extends AnyVal {
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
    def setActAsExpander(value: Boolean): Self = this.set("actAsExpander", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActAsExpander: Self = this.set("actAsExpander", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setExpandable(value: Boolean): Self = this.set("expandable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandable: Self = this.set("expandable", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setInitiallyExpanded(value: Boolean): Self = this.set("initiallyExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiallyExpanded: Self = this.set("initiallyExpanded", js.undefined)
    @scala.inline
    def setOnExpandChange(value: /* isExpanded */ Boolean => Unit): Self = this.set("onExpandChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnExpandChange: Self = this.set("onExpandChange", js.undefined)
    @scala.inline
    def setShowExpandableButton(value: Boolean): Self = this.set("showExpandableButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowExpandableButton: Self = this.set("showExpandableButton", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

