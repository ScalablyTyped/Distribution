package typings.hapiAuthJwt2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Credentials extends StObject {
    
    var credentials: js.UndefOr[js.Any] = js.native
    
    var isValid: Boolean = js.native
  }
  object Credentials {
    
    @scala.inline
    def apply(isValid: Boolean): Credentials = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit class CredentialsMutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExtraInfo extends StObject {
    
    var extraInfo: js.UndefOr[typings.hapiAuthJwt2.mod.ExtraInfo] = js.native
    
    var key: String | js.Array[String] = js.native
  }
  object ExtraInfo {
    
    @scala.inline
    def apply(key: String | js.Array[String]): ExtraInfo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraInfo]
    }
    
    @scala.inline
    implicit class ExtraInfoMutableBuilder[Self <: ExtraInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraInfo(value: typings.hapiAuthJwt2.mod.ExtraInfo): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraInfoUndefined: Self = StObject.set(x, "extraInfo", js.undefined)
      
      @scala.inline
      def setKey(value: String | js.Array[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyVarargs(value: String*): Self = StObject.set(x, "key", js.Array(value :_*))
    }
  }
}
