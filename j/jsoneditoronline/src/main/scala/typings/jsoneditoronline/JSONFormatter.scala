package typings.jsoneditoronline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONFormatter extends js.Object {
  
  def get(): js.Object = js.native
  
  def getText(): String = js.native
  
  def onError(err: String): Unit = js.native
  
  def set(json: js.Object): Unit = js.native
  
  def setText(jsonString: String): Unit = js.native
}
object JSONFormatter {
  
  @scala.inline
  def apply(
    get: () => js.Object,
    getText: () => String,
    onError: String => Unit,
    set: js.Object => Unit,
    setText: String => Unit
  ): JSONFormatter = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), getText = js.Any.fromFunction0(getText), onError = js.Any.fromFunction1(onError), set = js.Any.fromFunction1(set), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[JSONFormatter]
  }
  
  @scala.inline
  implicit class JSONFormatterOps[Self <: JSONFormatter] (val x: Self) extends AnyVal {
    
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
    def setGet(value: () => js.Object): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: String => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: js.Object => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
  }
}
