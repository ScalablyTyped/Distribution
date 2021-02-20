package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallFunctionRequest extends StObject {
  
  /** Required. Input to be passed to the function. */
  var data: js.UndefOr[String] = js.native
}
object CallFunctionRequest {
  
  @scala.inline
  def apply(): CallFunctionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallFunctionRequest]
  }
  
  @scala.inline
  implicit class CallFunctionRequestMutableBuilder[Self <: CallFunctionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
