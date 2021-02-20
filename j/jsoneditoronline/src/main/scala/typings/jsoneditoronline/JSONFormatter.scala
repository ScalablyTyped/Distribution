package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONFormatter extends StObject {
  
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
  implicit class JSONFormatterMutableBuilder[Self <: JSONFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: () => js.Object): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnError(value: String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: js.Object => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
