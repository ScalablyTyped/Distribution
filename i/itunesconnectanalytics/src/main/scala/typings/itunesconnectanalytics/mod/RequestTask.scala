package typings.itunesconnectanalytics.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestTask extends StObject {
  
  def completed(error: Error, body: String): Unit
  
  var query: String
}
object RequestTask {
  
  @scala.inline
  def apply(completed: (Error, String) => Unit, query: String): RequestTask = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTask]
  }
  
  @scala.inline
  implicit class RequestTaskMutableBuilder[Self <: RequestTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: (Error, String) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
