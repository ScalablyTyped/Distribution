package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsAuthInfoResponse extends StObject {
  
  /**
    * The account identifiers corresponding to the authenticated user. - For an
    * individual account: only the merchant ID is defined - For an aggregator:
    * only the aggregator ID is defined - For a subaccount of an MCA: both the
    * merchant ID and the aggregator ID are defined.
    */
  var accountIdentifiers: js.UndefOr[js.Array[SchemaAccountIdentifier]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsAuthInfoResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAccountsAuthInfoResponse {
  
  inline def apply(): SchemaAccountsAuthInfoResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsAuthInfoResponse]
  }
  
  extension [Self <: SchemaAccountsAuthInfoResponse](x: Self) {
    
    inline def setAccountIdentifiers(value: js.Array[SchemaAccountIdentifier]): Self = StObject.set(x, "accountIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setAccountIdentifiersUndefined: Self = StObject.set(x, "accountIdentifiers", js.undefined)
    
    inline def setAccountIdentifiersVarargs(value: SchemaAccountIdentifier*): Self = StObject.set(x, "accountIdentifiers", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
