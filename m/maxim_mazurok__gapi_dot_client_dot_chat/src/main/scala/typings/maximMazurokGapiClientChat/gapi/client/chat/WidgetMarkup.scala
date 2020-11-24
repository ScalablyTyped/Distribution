package typings.maximMazurokGapiClientChat.gapi.client.chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetMarkup extends js.Object {
  
  /** A list of buttons. Buttons is also oneof data and only one of these fields should be set. */
  var buttons: js.UndefOr[js.Array[Button]] = js.native
  
  /** Display an image in this widget. */
  var image: js.UndefOr[Image] = js.native
  
  /** Display a key value item in this widget. */
  var keyValue: js.UndefOr[KeyValue] = js.native
  
  /** Display a text paragraph in this widget. */
  var textParagraph: js.UndefOr[TextParagraph] = js.native
}
object WidgetMarkup {
  
  @scala.inline
  def apply(): WidgetMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetMarkup]
  }
  
  @scala.inline
  implicit class WidgetMarkupOps[Self <: WidgetMarkup] (val x: Self) extends AnyVal {
    
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
    def setButtonsVarargs(value: Button*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[Button]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setKeyValue(value: KeyValue): Self = this.set("keyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyValue: Self = this.set("keyValue", js.undefined)
    
    @scala.inline
    def setTextParagraph(value: TextParagraph): Self = this.set("textParagraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextParagraph: Self = this.set("textParagraph", js.undefined)
  }
}
