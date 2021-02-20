package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response[T] extends StObject {
  
  var data: js.Any = js.native
  
  //T|Error;
  var status: Double = js.native
  
  var success: Boolean = js.native
}
object Response {
  
  @scala.inline
  def apply[T](data: js.Any, status: Double, success: Boolean): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
  
  @scala.inline
  implicit class ResponseMutableBuilder[Self <: Response[_], T] (val x: Self with Response[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
