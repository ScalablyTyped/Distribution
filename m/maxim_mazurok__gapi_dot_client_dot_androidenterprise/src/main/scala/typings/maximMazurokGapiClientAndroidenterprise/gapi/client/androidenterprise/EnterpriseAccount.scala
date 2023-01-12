package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterpriseAccount extends StObject {
  
  /** The email address of the service account. */
  var accountEmail: js.UndefOr[String] = js.undefined
}
object EnterpriseAccount {
  
  inline def apply(): EnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAccount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnterpriseAccount] (val x: Self) extends AnyVal {
    
    inline def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    inline def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
  }
}
