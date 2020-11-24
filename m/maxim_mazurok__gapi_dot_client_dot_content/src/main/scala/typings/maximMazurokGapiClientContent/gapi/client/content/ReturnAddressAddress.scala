package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnAddressAddress extends js.Object {
  
  /** CLDR country code (e.g. "US"). */
  var country: js.UndefOr[String] = js.native
  
  /** City, town or commune. May also include dependent localities or sublocalities (e.g. neighborhoods or suburbs). */
  var locality: js.UndefOr[String] = js.native
  
  /** Postal code or ZIP (e.g. "94043"). */
  var postalCode: js.UndefOr[String] = js.native
  
  /** Name of the recipient to address returns to. */
  var recipientName: js.UndefOr[String] = js.native
  
  /** Top-level administrative subdivision of the country. For example, a state like California ("CA") or a province like Quebec ("QC"). */
  var region: js.UndefOr[String] = js.native
  
  /** Street-level part of the address. May be up to two lines, each line specified as an array element. */
  var streetAddress: js.UndefOr[js.Array[String]] = js.native
}
object ReturnAddressAddress {
  
  @scala.inline
  def apply(): ReturnAddressAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnAddressAddress]
  }
  
  @scala.inline
  implicit class ReturnAddressAddressOps[Self <: ReturnAddressAddress] (val x: Self) extends AnyVal {
    
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
