package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductStatusDestinationStatus extends StObject {
  
  /** List of country codes (ISO 3166-1 alpha-2) where the offer is approved. */
  var approvedCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the destination */
  var destination: js.UndefOr[String] = js.undefined
  
  /** List of country codes (ISO 3166-1 alpha-2) where the offer is disapproved. */
  var disapprovedCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of country codes (ISO 3166-1 alpha-2) where the offer is pending approval. */
  var pendingCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Destination approval status in `targetCountry` of the offer. */
  var status: js.UndefOr[String] = js.undefined
}
object ProductStatusDestinationStatus {
  
  inline def apply(): ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatusDestinationStatus]
  }
  
  extension [Self <: ProductStatusDestinationStatus](x: Self) {
    
    inline def setApprovedCountries(value: js.Array[String]): Self = StObject.set(x, "approvedCountries", value.asInstanceOf[js.Any])
    
    inline def setApprovedCountriesUndefined: Self = StObject.set(x, "approvedCountries", js.undefined)
    
    inline def setApprovedCountriesVarargs(value: String*): Self = StObject.set(x, "approvedCountries", js.Array(value*))
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDisapprovedCountries(value: js.Array[String]): Self = StObject.set(x, "disapprovedCountries", value.asInstanceOf[js.Any])
    
    inline def setDisapprovedCountriesUndefined: Self = StObject.set(x, "disapprovedCountries", js.undefined)
    
    inline def setDisapprovedCountriesVarargs(value: String*): Self = StObject.set(x, "disapprovedCountries", js.Array(value*))
    
    inline def setPendingCountries(value: js.Array[String]): Self = StObject.set(x, "pendingCountries", value.asInstanceOf[js.Any])
    
    inline def setPendingCountriesUndefined: Self = StObject.set(x, "pendingCountries", js.undefined)
    
    inline def setPendingCountriesVarargs(value: String*): Self = StObject.set(x, "pendingCountries", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
