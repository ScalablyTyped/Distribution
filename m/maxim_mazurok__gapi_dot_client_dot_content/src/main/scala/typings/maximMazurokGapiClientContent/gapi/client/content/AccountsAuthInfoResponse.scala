package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsAuthInfoResponse extends StObject {
  
  /**
    * The account identifiers corresponding to the authenticated user. - For an individual account: only the merchant ID is defined - For an aggregator: only the aggregator ID is defined
    * - For a subaccount of an MCA: both the merchant ID and the aggregator ID are defined.
    */
  var accountIdentifiers: js.UndefOr[js.Array[AccountIdentifier]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsAuthInfoResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object AccountsAuthInfoResponse {
  
  inline def apply(): AccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsAuthInfoResponse]
  }
  
  extension [Self <: AccountsAuthInfoResponse](x: Self) {
    
    inline def setAccountIdentifiers(value: js.Array[AccountIdentifier]): Self = StObject.set(x, "accountIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setAccountIdentifiersUndefined: Self = StObject.set(x, "accountIdentifiers", js.undefined)
    
    inline def setAccountIdentifiersVarargs(value: AccountIdentifier*): Self = StObject.set(x, "accountIdentifiers", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
