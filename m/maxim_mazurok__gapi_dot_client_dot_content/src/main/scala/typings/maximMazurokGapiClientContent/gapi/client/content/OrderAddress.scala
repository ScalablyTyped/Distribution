package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderAddress extends js.Object {
  
  /** CLDR country code (e.g. "US"). */
  var country: js.UndefOr[String] = js.native
  
  /** Strings representing the lines of the printed label for mailing the order, for example: John Smith 1600 Amphitheatre Parkway Mountain View, CA, 94043 United States */
  var fullAddress: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether the address is a post office box. */
  var isPostOfficeBox: js.UndefOr[Boolean] = js.native
  
  /** City, town or commune. May also include dependent localities or sublocalities (e.g. neighborhoods or suburbs). */
  var locality: js.UndefOr[String] = js.native
  
  /** Postal Code or ZIP (e.g. "94043"). */
  var postalCode: js.UndefOr[String] = js.native
  
  /** Name of the recipient. */
  var recipientName: js.UndefOr[String] = js.native
  
  /** Top-level administrative subdivision of the country. For example, a state like California ("CA") or a province like Quebec ("QC"). */
  var region: js.UndefOr[String] = js.native
  
  /** Street-level part of the address. */
  var streetAddress: js.UndefOr[js.Array[String]] = js.native
}
object OrderAddress {
  
  @scala.inline
  def apply(): OrderAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderAddress]
  }
  
  @scala.inline
  implicit class OrderAddressOps[Self <: OrderAddress] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setFullAddressVarargs(value: String*): Self = this.set("fullAddress", js.Array(value :_*))
    
    @scala.inline
    def setFullAddress(value: js.Array[String]): Self = this.set("fullAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullAddress: Self = this.set("fullAddress", js.undefined)
    
    @scala.inline
    def setIsPostOfficeBox(value: Boolean): Self = this.set("isPostOfficeBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPostOfficeBox: Self = this.set("isPostOfficeBox", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setRecipientName(value: String): Self = this.set("recipientName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientName: Self = this.set("recipientName", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setStreetAddressVarargs(value: String*): Self = this.set("streetAddress", js.Array(value :_*))
    
    @scala.inline
    def setStreetAddress(value: js.Array[String]): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreetAddress: Self = this.set("streetAddress", js.undefined)
  }
}
