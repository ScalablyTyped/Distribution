package typings.grommet.formMod

import typings.grommet.anon.Errors
import typings.grommet.anon.Invalid
import typings.grommet.grommetStrings.blur
import typings.grommet.grommetStrings.submit
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormProps[T] extends js.Object {
  
  var errors: js.UndefOr[js.Object] = js.native
  
  var infos: js.UndefOr[js.Object] = js.native
  
  var messages: js.UndefOr[Invalid] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.native
  
  var onReset: js.UndefOr[js.Function1[/* event */ SyntheticEvent[Element, Event], _]] = js.native
  
  var onSubmit: js.UndefOr[js.Function1[/* event */ FormExtendedEvent[T, Element], Unit]] = js.native
  
  var onValidate: js.UndefOr[js.Function1[/* validationResults */ Errors, Unit]] = js.native
  
  var validate: js.UndefOr[blur | submit] = js.native
  
  var value: js.UndefOr[js.Object] = js.native
}
object FormProps {
  
  @scala.inline
  def apply[T](): FormProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps[T]]
  }
  
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps[_], T] (val x: Self with FormProps[T]) extends AnyVal {
    
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
    def setErrors(value: js.Object): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setInfos(value: js.Object): Self = this.set("infos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfos: Self = this.set("infos", js.undefined)
    
    @scala.inline
    def setMessages(value: Invalid): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ T => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnReset(value: /* event */ SyntheticEvent[Element, Event] => _): Self = this.set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    
    @scala.inline
    def setOnSubmit(value: /* event */ FormExtendedEvent[T, Element] => Unit): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    
    @scala.inline
    def setOnValidate(value: /* validationResults */ Errors => Unit): Self = this.set("onValidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValidate: Self = this.set("onValidate", js.undefined)
    
    @scala.inline
    def setValidate(value: blur | submit): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValue(value: js.Object): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
