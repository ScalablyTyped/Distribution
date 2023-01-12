package typings.maximMazurokGapiClientBigqueryconnection.gapi.client.bigqueryconnection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudSqlCredential extends StObject {
  
  /** The password for the credential. */
  var password: js.UndefOr[String] = js.undefined
  
  /** The username for the credential. */
  var username: js.UndefOr[String] = js.undefined
}
object CloudSqlCredential {
  
  inline def apply(): CloudSqlCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudSqlCredential]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudSqlCredential] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
