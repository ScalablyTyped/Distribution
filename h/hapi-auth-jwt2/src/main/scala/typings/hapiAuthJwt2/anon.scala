package typings.hapiAuthJwt2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Credentials extends StObject {
    
    var credentials: js.UndefOr[js.Any] = js.undefined
    
    var isValid: Boolean
  }
  object Credentials {
    
    inline def apply(isValid: Boolean): Credentials = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    extension [Self <: Credentials](x: Self) {
      
      inline def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtraInfo extends StObject {
    
    var extraInfo: js.UndefOr[typings.hapiAuthJwt2.mod.ExtraInfo] = js.undefined
    
    var key: String | js.Array[String]
  }
  object ExtraInfo {
    
    inline def apply(key: String | js.Array[String]): ExtraInfo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraInfo]
    }
    
    extension [Self <: ExtraInfo](x: Self) {
      
      inline def setExtraInfo(value: typings.hapiAuthJwt2.mod.ExtraInfo): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
      
      inline def setExtraInfoUndefined: Self = StObject.set(x, "extraInfo", js.undefined)
      
      inline def setKey(value: String | js.Array[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value :_*))
    }
  }
}
