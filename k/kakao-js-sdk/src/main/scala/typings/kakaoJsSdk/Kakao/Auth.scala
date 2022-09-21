package typings.kakaoJsSdk.Kakao

import org.scalablytyped.runtime.StringDictionary
import typings.kakaoJsSdk.kakaoJsSdkStrings.connected
import typings.kakaoJsSdk.kakaoJsSdkStrings.not_connected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Auth {
  
  /* Rewritten from type alias, can be one of: 
    - typings.kakaoJsSdk.kakaoJsSdkStrings.small
    - typings.kakaoJsSdk.kakaoJsSdkStrings.medium
    - typings.kakaoJsSdk.kakaoJsSdkStrings.large
  */
  trait AuthButtonSize extends StObject
  object AuthButtonSize {
    
    inline def large: typings.kakaoJsSdk.kakaoJsSdkStrings.large = "large".asInstanceOf[typings.kakaoJsSdk.kakaoJsSdkStrings.large]
    
    inline def medium: typings.kakaoJsSdk.kakaoJsSdkStrings.medium = "medium".asInstanceOf[typings.kakaoJsSdk.kakaoJsSdkStrings.medium]
    
    inline def small: typings.kakaoJsSdk.kakaoJsSdkStrings.small = "small".asInstanceOf[typings.kakaoJsSdk.kakaoJsSdkStrings.small]
  }
  
  trait AuthError extends StObject {
    
    var error: String
    
    var error_description: String
  }
  object AuthError {
    
    inline def apply(error: String, error_description: String): AuthError = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], error_description = error_description.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthError]
    }
    
    extension [Self <: AuthError](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setError_description(value: String): Self = StObject.set(x, "error_description", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.kakaoJsSdk.kakaoJsSdkStrings.kr
    - typings.kakaoJsSdk.kakaoJsSdkStrings.en
  */
  trait AuthLanguage extends StObject
  object AuthLanguage {
    
    inline def en: typings.kakaoJsSdk.kakaoJsSdkStrings.en = "en".asInstanceOf[typings.kakaoJsSdk.kakaoJsSdkStrings.en]
    
    inline def kr: typings.kakaoJsSdk.kakaoJsSdkStrings.kr = "kr".asInstanceOf[typings.kakaoJsSdk.kakaoJsSdkStrings.kr]
  }
  
  trait AuthStatusObject extends StObject {
    
    var status: connected | not_connected
    
    var user: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object AuthStatusObject {
    
    inline def apply(status: connected | not_connected): AuthStatusObject = {
      val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthStatusObject]
    }
    
    extension [Self <: AuthStatusObject](x: Self) {
      
      inline def setStatus(value: connected | not_connected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUser(value: StringDictionary[Any]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait AuthSuccessObject extends StObject {
    
    var access_token: String
    
    // fixed 'bearer'
    var expires_in: Double
    
    var refresh_token: String
    
    var scope: String
    
    var token_type: String
  }
  object AuthSuccessObject {
    
    inline def apply(access_token: String, expires_in: Double, refresh_token: String, scope: String, token_type: String): AuthSuccessObject = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], refresh_token = refresh_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthSuccessObject]
    }
    
    extension [Self <: AuthSuccessObject](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
    }
  }
}
