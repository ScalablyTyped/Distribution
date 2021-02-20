package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductStatusDestinationStatus extends StObject {
  
  /** List of country codes (ISO 3166-1 alpha-2) where the offer is approved. */
  var approvedCountries: js.UndefOr[js.Array[String]] = js.native
  
  /** The name of the destination */
  var destination: js.UndefOr[String] = js.native
  
  /** List of country codes (ISO 3166-1 alpha-2) where the offer is disapproved. */
  var disapprovedCountries: js.UndefOr[js.Array[String]] = js.native
  
  /** List of country codes (ISO 3166-1 alpha-2) where the offer is pending approval. */
  var pendingCountries: js.UndefOr[js.Array[String]] = js.native
  
  /** Destination approval status in `targetCountry` of the offer. */
  var status: js.UndefOr[String] = js.native
}
object ProductStatusDestinationStatus {
  
  @scala.inline
  def apply(): ProductStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductStatusDestinationStatus]
  }
  
  @scala.inline
  implicit class ProductStatusDestinationStatusMutableBuilder[Self <: ProductStatusDestinationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovedCountries(value: js.Array[String]): Self = StObject.set(x, "approvedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedCountriesUndefined: Self = StObject.set(x, "approvedCountries", js.undefined)
    
    @scala.inline
    def setApprovedCountriesVarargs(value: String*): Self = StObject.set(x, "approvedCountries", js.Array(value :_*))
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setDisapprovedCountries(value: js.Array[String]): Self = StObject.set(x, "disapprovedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisapprovedCountriesUndefined: Self = StObject.set(x, "disapprovedCountries", js.undefined)
    
    @scala.inline
    def setDisapprovedCountriesVarargs(value: String*): Self = StObject.set(x, "disapprovedCountries", js.Array(value :_*))
    
    @scala.inline
    def setPendingCountries(value: js.Array[String]): Self = StObject.set(x, "pendingCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCountriesUndefined: Self = StObject.set(x, "pendingCountries", js.undefined)
    
    @scala.inline
    def setPendingCountriesVarargs(value: String*): Self = StObject.set(x, "pendingCountries", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
