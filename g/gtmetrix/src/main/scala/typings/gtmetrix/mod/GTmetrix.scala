package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link https://github.com/fvdm/nodejs-gtmetrix#methods}
  */
@js.native
trait GTmetrix extends js.Object {
  
  var account: AccountApi = js.native
  
  var browsers: BrowsersApi = js.native
  
  var locations: LocationsApi = js.native
  
  var test: TestApi = js.native
}
object GTmetrix {
  
  @scala.inline
  def apply(account: AccountApi, browsers: BrowsersApi, locations: LocationsApi, test: TestApi): GTmetrix = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], browsers = browsers.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.asInstanceOf[GTmetrix]
  }
  
  @scala.inline
  implicit class GTmetrixOps[Self <: GTmetrix] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: AccountApi): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowsers(value: BrowsersApi): Self = this.set("browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocations(value: LocationsApi): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: TestApi): Self = this.set("test", value.asInstanceOf[js.Any])
  }
}
