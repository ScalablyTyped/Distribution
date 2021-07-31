package typings.jsoneditoronline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONEditorBuffer extends StObject {
  
  def flush(): String
  
  def set(text: String): Unit
  
  var text: String
}
object JSONEditorBuffer {
  
  @scala.inline
  def apply(flush: () => String, set: String => Unit, text: String): JSONEditorBuffer = {
    val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush), set = js.Any.fromFunction1(set), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorBuffer]
  }
  
  @scala.inline
  implicit class JSONEditorBufferMutableBuilder[Self <: JSONEditorBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlush(value: () => String): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: String => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
