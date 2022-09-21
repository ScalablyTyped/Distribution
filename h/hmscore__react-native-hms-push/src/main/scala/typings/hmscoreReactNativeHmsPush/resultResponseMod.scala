package typings.hmscoreReactNativeHmsPush

import typings.hmscoreReactNativeHmsPush.hmsPushResultCodeMod.HmsPushResultCodeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultResponseMod {
  
  trait ErrorResponse extends StObject {
    
    var code: HmsPushResultCodeEnum
    
    var message: String
    
    var nativeStackAndroid: Any
    
    var userInfo: Null | js.Object
  }
  object ErrorResponse {
    
    inline def apply(code: HmsPushResultCodeEnum, message: String, nativeStackAndroid: Any): ErrorResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], nativeStackAndroid = nativeStackAndroid.asInstanceOf[js.Any], userInfo = null)
      __obj.asInstanceOf[ErrorResponse]
    }
    
    extension [Self <: ErrorResponse](x: Self) {
      
      inline def setCode(value: HmsPushResultCodeEnum): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setNativeStackAndroid(value: Any): Self = StObject.set(x, "nativeStackAndroid", value.asInstanceOf[js.Any])
      
      inline def setUserInfo(value: js.Object): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
      
      inline def setUserInfoNull: Self = StObject.set(x, "userInfo", null)
    }
  }
  
  trait ResultResponse[T] extends StObject {
    
    var result: T
    
    var result_code: HmsPushResultCodeEnum
  }
  object ResultResponse {
    
    inline def apply[T](result: T, result_code: HmsPushResultCodeEnum): ResultResponse[T] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], result_code = result_code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultResponse[T]]
    }
    
    extension [Self <: ResultResponse[?], T](x: Self & ResultResponse[T]) {
      
      inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResult_code(value: HmsPushResultCodeEnum): Self = StObject.set(x, "result_code", value.asInstanceOf[js.Any])
    }
  }
}
