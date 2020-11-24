package typings.materialTextfield.characterCounterAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MDCTextFieldCharacterCounterAdapter extends js.Object {
  
  /**
    * Sets the text content of character counter element.
    */
  def setContent(content: String): Unit = js.native
}
object MDCTextFieldCharacterCounterAdapter {
  
  @scala.inline
  def apply(setContent: String => Unit): MDCTextFieldCharacterCounterAdapter = {
    val __obj = js.Dynamic.literal(setContent = js.Any.fromFunction1(setContent))
    __obj.asInstanceOf[MDCTextFieldCharacterCounterAdapter]
  }
  
  @scala.inline
  implicit class MDCTextFieldCharacterCounterAdapterOps[Self <: MDCTextFieldCharacterCounterAdapter] (val x: Self) extends AnyVal {
    
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
    def setSetContent(value: String => Unit): Self = this.set("setContent", js.Any.fromFunction1(value))
  }
}
