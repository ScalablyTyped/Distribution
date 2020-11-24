package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Person extends js.Object {
  
  /** The person's email addresses */
  var emailAddresses: js.UndefOr[js.Array[EmailAddress]] = js.native
  
  /** The resource name of the person to provide information about. See People.get from Google People API. */
  var name: js.UndefOr[String] = js.native
  
  /** Obfuscated ID of a person. */
  var obfuscatedId: js.UndefOr[String] = js.native
  
  /** The person's name */
  var personNames: js.UndefOr[js.Array[Name]] = js.native
  
  /** A person's read-only photo. A picture shown next to the person's name to help others recognize the person in search results. */
  var photos: js.UndefOr[js.Array[Photo]] = js.native
}
object Person {
  
  @scala.inline
  def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
    
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
    def setEmailAddressesVarargs(value: EmailAddress*): Self = this.set("emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddresses(value: js.Array[EmailAddress]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddresses: Self = this.set("emailAddresses", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setObfuscatedId(value: String): Self = this.set("obfuscatedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObfuscatedId: Self = this.set("obfuscatedId", js.undefined)
    
    @scala.inline
    def setPersonNamesVarargs(value: Name*): Self = this.set("personNames", js.Array(value :_*))
    
    @scala.inline
    def setPersonNames(value: js.Array[Name]): Self = this.set("personNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersonNames: Self = this.set("personNames", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: Photo*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[Photo]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
  }
}
