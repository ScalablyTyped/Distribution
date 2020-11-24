package typings.googleapis.oauth2V1Mod.oauth2V1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUserinfoplus extends js.Object {
  
  /**
    * The user&#39;s email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s last name.
    */
  var family_name: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s gender.
    */
  var gender: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s first name.
    */
  var given_name: js.UndefOr[String] = js.native
  
  /**
    * The hosted domain e.g. example.com if the user is Google apps user.
    */
  var hd: js.UndefOr[String] = js.native
  
  /**
    * The obfuscated ID of the user.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * URL of the profile page.
    */
  var link: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s preferred locale.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * The user&#39;s full name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * URL of the user&#39;s picture image.
    */
  var picture: js.UndefOr[String] = js.native
  
  /**
    * Boolean flag which is true if the email address is verified. Always
    * verified because we only return the user&#39;s primary email address.
    */
  var verified_email: js.UndefOr[Boolean] = js.native
}
object SchemaUserinfoplus {
  
  @scala.inline
  def apply(): SchemaUserinfoplus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserinfoplus]
  }
  
  @scala.inline
  implicit class SchemaUserinfoplusOps[Self <: SchemaUserinfoplus] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFamily_name(value: String): Self = this.set("family_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily_name: Self = this.set("family_name", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setGiven_name(value: String): Self = this.set("given_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGiven_name: Self = this.set("given_name", js.undefined)
    
    @scala.inline
    def setHd(value: String): Self = this.set("hd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHd: Self = this.set("hd", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicture: Self = this.set("picture", js.undefined)
    
    @scala.inline
    def setVerified_email(value: Boolean): Self = this.set("verified_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerified_email: Self = this.set("verified_email", js.undefined)
  }
}
