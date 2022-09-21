package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalListCustomersResponse extends StObject {
  
  /**
    * The list of customers that match the request.
    */
  var customers: js.UndefOr[js.Array[SchemaSasPortalCustomer]] = js.undefined
  
  /**
    * A pagination token returned from a previous call to ListCustomers that indicates from where listing should continue. If the field is missing or empty, it means there are no more customers.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalListCustomersResponse {
  
  inline def apply(): SchemaSasPortalListCustomersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalListCustomersResponse]
  }
  
  extension [Self <: SchemaSasPortalListCustomersResponse](x: Self) {
    
    inline def setCustomers(value: js.Array[SchemaSasPortalCustomer]): Self = StObject.set(x, "customers", value.asInstanceOf[js.Any])
    
    inline def setCustomersUndefined: Self = StObject.set(x, "customers", js.undefined)
    
    inline def setCustomersVarargs(value: SchemaSasPortalCustomer*): Self = StObject.set(x, "customers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
