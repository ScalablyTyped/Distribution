package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallFunctionRequest extends StObject {
  
  /** Required. Input to be passed to the function. */
  var data: js.UndefOr[String] = js.undefined
}
object CallFunctionRequest {
  
  inline def apply(): CallFunctionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallFunctionRequest]
  }
  
  extension [Self <: CallFunctionRequest](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
