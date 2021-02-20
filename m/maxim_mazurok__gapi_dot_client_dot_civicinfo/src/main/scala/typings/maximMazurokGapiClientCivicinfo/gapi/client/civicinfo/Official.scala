package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Official extends StObject {
  
  /** Addresses at which to contact the official. */
  var address: js.UndefOr[js.Array[SimpleAddressType]] = js.native
  
  /** A list of known (social) media channels for this official. */
  var channels: js.UndefOr[js.Array[Channel]] = js.native
  
  /** The direct email addresses for the official. */
  var emails: js.UndefOr[js.Array[String]] = js.native
  
  /** The official's name. */
  var name: js.UndefOr[String] = js.native
  
  /** The full name of the party the official belongs to. */
  var party: js.UndefOr[String] = js.native
  
  /** The official's public contact phone numbers. */
  var phones: js.UndefOr[js.Array[String]] = js.native
  
  /** A URL for a photo of the official. */
  var photoUrl: js.UndefOr[String] = js.native
  
  /** The official's public website URLs. */
  var urls: js.UndefOr[js.Array[String]] = js.native
}
object Official {
  
  @scala.inline
  def apply(): Official = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Official]
  }
  
  @scala.inline
  implicit class OfficialMutableBuilder[Self <: Official] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: js.Array[SimpleAddressType]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: SimpleAddressType*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[Channel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParty(value: String): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    @scala.inline
    def setPhones(value: js.Array[String]): Self = StObject.set(x, "phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhonesUndefined: Self = StObject.set(x, "phones", js.undefined)
    
    @scala.inline
    def setPhonesVarargs(value: String*): Self = StObject.set(x, "phones", js.Array(value :_*))
    
    @scala.inline
    def setPhotoUrl(value: String): Self = StObject.set(x, "photoUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUrlUndefined: Self = StObject.set(x, "photoUrl", js.undefined)
    
    @scala.inline
    def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
