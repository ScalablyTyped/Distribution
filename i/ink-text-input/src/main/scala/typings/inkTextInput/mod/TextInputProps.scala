package typings.inkTextInput.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInputProps extends js.Object {
  var focus: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object TextInputProps {
  @scala.inline
  def apply(): TextInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputProps]
  }
  @scala.inline
  implicit class TextInputPropsOps[Self <: TextInputProps] (val x: Self) extends AnyVal {
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
    def setFocus(value: Boolean): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    @scala.inline
    def setOnChange(value: /* value */ String => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnSubmit(value: /* value */ String => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

