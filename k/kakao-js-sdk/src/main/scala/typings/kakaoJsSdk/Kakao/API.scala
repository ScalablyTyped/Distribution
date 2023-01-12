package typings.kakaoJsSdk.Kakao

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object API {
  
  trait ApiError extends StObject {
    
    var code: Double
    
    var msg: String
  }
  object ApiError {
    
    inline def apply(code: Double, msg: String): ApiError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApiError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  type ApiResponse = StringDictionary[Any]
  
  type RequestAlwaysCallback = js.Function1[/* param */ ApiResponse | ApiError, Unit]
  
  type RequestFailCallback = js.Function1[/* error */ ApiError, Unit]
  
  type RequestSuccessCallback = js.Function1[/* response */ ApiResponse, Unit]
}
