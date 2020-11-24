package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductStatusDestinationStatus extends js.Object {
  
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
  implicit class ProductStatusDestinationStatusOps[Self <: ProductStatusDestinationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApprovedCountriesVarargs(value: String*): Self = this.set("approvedCountries", js.Array(value :_*))
    
    @scala.inline
    def setApprovedCountries(value: js.Array[String]): Self = this.set("approvedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovedCountries: Self = this.set("approvedCountries", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDisapprovedCountriesVarargs(value: String*): Self = this.set("disapprovedCountries", js.Array(value :_*))
    
    @scala.inline
    def setDisapprovedCountries(value: js.Array[String]): Self = this.set("disapprovedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisapprovedCountries: Self = this.set("disapprovedCountries", js.undefined)
    
    @scala.inline
    def setPendingCountriesVarargs(value: String*): Self = this.set("pendingCountries", js.Array(value :_*))
    
    @scala.inline
    def setPendingCountries(value: js.Array[String]): Self = this.set("pendingCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingCountries: Self = this.set("pendingCountries", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
