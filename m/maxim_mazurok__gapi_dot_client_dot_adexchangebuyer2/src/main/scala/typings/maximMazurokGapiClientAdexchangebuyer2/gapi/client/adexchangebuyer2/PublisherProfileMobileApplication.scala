package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublisherProfileMobileApplication extends js.Object {
  
  /** The app store the app belongs to. */
  var appStore: js.UndefOr[String] = js.native
  
  /** The external ID for the app from its app store. */
  var externalAppId: js.UndefOr[String] = js.native
  
  /** The name of the app. */
  var name: js.UndefOr[String] = js.native
}
object PublisherProfileMobileApplication {
  
  @scala.inline
  def apply(): PublisherProfileMobileApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublisherProfileMobileApplication]
  }
  
  @scala.inline
  implicit class PublisherProfileMobileApplicationOps[Self <: PublisherProfileMobileApplication] (val x: Self) extends AnyVal {
    
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
    def setAppStore(value: String): Self = this.set("appStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStore: Self = this.set("appStore", js.undefined)
    
    @scala.inline
    def setExternalAppId(value: String): Self = this.set("externalAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAppId: Self = this.set("externalAppId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
