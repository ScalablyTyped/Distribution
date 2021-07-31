package typings.highlightJs

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackResponse extends StObject {
  
  var data: Record[String, js.Any]
  
  def ignoreMatch(): Unit
}
object CallbackResponse {
  
  @scala.inline
  def apply(data: Record[String, js.Any], ignoreMatch: () => Unit): CallbackResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ignoreMatch = js.Any.fromFunction0(ignoreMatch))
    __obj.asInstanceOf[CallbackResponse]
  }
  
  @scala.inline
  implicit class CallbackResponseMutableBuilder[Self <: CallbackResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Record[String, js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreMatch(value: () => Unit): Self = StObject.set(x, "ignoreMatch", js.Any.fromFunction0(value))
  }
}
