package typings.ibmCloudSdkCore

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.OutgoingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esAuthAuthenticatorsAuthenticatorInterfaceMod {
  
  trait AuthenticateOptions
    extends StObject
       with /* propName */ StringDictionary[Any] {
    
    /**
      * Headers to augment with authentication information.
      */
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  }
  object AuthenticateOptions {
    
    inline def apply(): AuthenticateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  trait AuthenticatorInterface extends StObject {
    
    /**
      * Add authentication information to the specified request.
      *
      * @param {object} requestOptions The request to augment with authentication information.
      * @param {object.<string, string>} requestOptions.headers The headers the
      *   authentication information will be added to.
      */
    def authenticate(requestOptions: AuthenticateOptions): js.Promise[Unit]
    
    /**
      * Returns a string that indicates the authentication type.
      */
    def authenticationType(): String
  }
  object AuthenticatorInterface {
    
    inline def apply(authenticate: AuthenticateOptions => js.Promise[Unit], authenticationType: () => String): AuthenticatorInterface = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction1(authenticate), authenticationType = js.Any.fromFunction0(authenticationType))
      __obj.asInstanceOf[AuthenticatorInterface]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthenticatorInterface] (val x: Self) extends AnyVal {
      
      inline def setAuthenticate(value: AuthenticateOptions => js.Promise[Unit]): Self = StObject.set(x, "authenticate", js.Any.fromFunction1(value))
      
      inline def setAuthenticationType(value: () => String): Self = StObject.set(x, "authenticationType", js.Any.fromFunction0(value))
    }
  }
}
