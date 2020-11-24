package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiaSettings extends js.Object {
  
  /** The ID of the account to which these LIA settings belong. Ignored upon update, always present in get request responses. */
  var accountId: js.UndefOr[String] = js.native
  
  /** The LIA settings for each country. */
  var countrySettings: js.UndefOr[js.Array[LiaCountrySettings]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#liaSettings`" */
  var kind: js.UndefOr[String] = js.native
}
object LiaSettings {
  
  @scala.inline
  def apply(): LiaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaSettings]
  }
  
  @scala.inline
  implicit class LiaSettingsOps[Self <: LiaSettings] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setCountrySettingsVarargs(value: LiaCountrySettings*): Self = this.set("countrySettings", js.Array(value :_*))
    
    @scala.inline
    def setCountrySettings(value: js.Array[LiaCountrySettings]): Self = this.set("countrySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountrySettings: Self = this.set("countrySettings", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
