package typings.higButton.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /** Prevents user interaction with the button */
  var disabled: js.UndefOr[Boolean] = js.native
  /** A @hig/icon element */
  var icon: js.UndefOr[Element] = js.native
  /** Sets the link of a button */
  var link: js.UndefOr[String] = js.native
  /** Triggers blur when focus is moved away from icon */
  var onBlur: js.UndefOr[Callback] = js.native
  /** Triggers when you click the button */
  var onClick: js.UndefOr[Callback] = js.native
  /** Triggers when focus is moved to button */
  var onFocus: js.UndefOr[Callback] = js.native
  /** Triggers when you hover over the button */
  var onHover: js.UndefOr[Callback] = js.native
  /** Triggers when the user's mouse is pressed over the button */
  var onMouseDown: js.UndefOr[Callback] = js.native
  /** Triggers when the user's mouse is over the button */
  var onMouseEnter: js.UndefOr[Callback] = js.native
  /** Triggers when the user's mouse is no longer over the button */
  var onMouseLeave: js.UndefOr[Callback] = js.native
  /** Triggers when the user's mouse is no longer pressed over the button */
  var onMouseUp: js.UndefOr[Callback] = js.native
  /** Adds custom/overriding styles */
  var stylesheet: js.UndefOr[js.Any] = js.native
  /** Specifies where to display the linked URL */
  var target: js.UndefOr[AvailableTargets_] = js.native
  /** Sets the title of a button */
  var title: String = js.native
  /** Specifies type of button */
  var `type`: js.UndefOr[AvailableTypes_] = js.native
  /** Specifies width of button */
  var width: js.UndefOr[AvailableWidths_] = js.native
}

object Props {
  @scala.inline
  def apply(title: String): Props = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: Element): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    @scala.inline
    def setOnHover(value: () => Unit): Self = this.set("onHover", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOnMouseDown(value: () => Unit): Self = this.set("onMouseDown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnMouseEnter(value: () => Unit): Self = this.set("onMouseEnter", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(value: () => Unit): Self = this.set("onMouseLeave", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnMouseUp(value: () => Unit): Self = this.set("onMouseUp", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseUp: Self = this.set("onMouseUp", js.undefined)
    @scala.inline
    def setStylesheet(value: js.Any): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
    @scala.inline
    def setTarget(value: AvailableTargets_): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setType(value: AvailableTypes_): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWidth(value: AvailableWidths_): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

