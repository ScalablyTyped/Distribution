package typings.hellosignSdk.mod

import typings.node.httpMod.IncomingHttpHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountResponse
  extends StObject
     with BaseResponse {
  
  var account: Account
}
object AccountResponse {
  
  inline def apply(account: Account, resHeaders: IncomingHttpHeaders): AccountResponse = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], resHeaders = resHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountResponse]
  }
  
  extension [Self <: AccountResponse](x: Self) {
    
    inline def setAccount(value: Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
  }
}
