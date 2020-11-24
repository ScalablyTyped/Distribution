package typings.instagramPrivateApi.userLookupOptionsMod

import typings.instagramPrivateApi.anon.Countrycode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserLookupOptions extends js.Object {
  
  var countryCodes: js.UndefOr[js.Array[Countrycode]] = js.native
  
  var directlySignIn: js.UndefOr[Boolean] = js.native
  
  var query: String = js.native
  
  var waterfallId: js.UndefOr[String] = js.native
}
object UserLookupOptions {
  
  @scala.inline
  def apply(query: String): UserLookupOptions = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserLookupOptions]
  }
  
  @scala.inline
  implicit class UserLookupOptionsOps[Self <: UserLookupOptions] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodesVarargs(value: Countrycode*): Self = this.set("countryCodes", js.Array(value :_*))
    
    @scala.inline
    def setCountryCodes(value: js.Array[Countrycode]): Self = this.set("countryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCodes: Self = this.set("countryCodes", js.undefined)
    
    @scala.inline
    def setDirectlySignIn(value: Boolean): Self = this.set("directlySignIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectlySignIn: Self = this.set("directlySignIn", js.undefined)
    
    @scala.inline
    def setWaterfallId(value: String): Self = this.set("waterfallId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterfallId: Self = this.set("waterfallId", js.undefined)
  }
}
