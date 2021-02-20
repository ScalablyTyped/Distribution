package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiaSettings extends StObject {
  
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
  implicit class LiaSettingsMutableBuilder[Self <: LiaSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCountrySettings(value: js.Array[LiaCountrySettings]): Self = StObject.set(x, "countrySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountrySettingsUndefined: Self = StObject.set(x, "countrySettings", js.undefined)
    
    @scala.inline
    def setCountrySettingsVarargs(value: LiaCountrySettings*): Self = StObject.set(x, "countrySettings", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
