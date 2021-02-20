package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnterpriseAccount extends StObject {
  
  /** The email address of the service account. */
  var accountEmail: js.UndefOr[String] = js.native
}
object EnterpriseAccount {
  
  @scala.inline
  def apply(): EnterpriseAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseAccount]
  }
  
  @scala.inline
  implicit class EnterpriseAccountMutableBuilder[Self <: EnterpriseAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountEmail(value: String): Self = StObject.set(x, "accountEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEmailUndefined: Self = StObject.set(x, "accountEmail", js.undefined)
  }
}
