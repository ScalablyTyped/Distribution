package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response[T /* <: js.Object */]
  extends StObject
     with APIResponseSuccess {
  
  @JSName("data")
  var data_Response: T
}
object Response {
  
  @scala.inline
  def apply[T /* <: js.Object */](data: T, meta: APIResponseMeta): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response[?], T /* <: js.Object */] (val x: Self & Response[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
