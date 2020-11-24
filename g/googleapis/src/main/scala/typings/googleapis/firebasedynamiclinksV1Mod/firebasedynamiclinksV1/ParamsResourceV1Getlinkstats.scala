package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceV1Getlinkstats extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The span of time requested in days.
    */
  var durationDays: js.UndefOr[String] = js.native
  
  /**
    * Dynamic Link URL. e.g. https://abcd.app.goo.gl/wxyz
    */
  var dynamicLink: js.UndefOr[String] = js.native
  
  /**
    * Google SDK version. Version takes the form "$major.$minor.$patch"
    */
  var sdkVersion: js.UndefOr[String] = js.native
}
object ParamsResourceV1Getlinkstats {
  
  @scala.inline
  def apply(): ParamsResourceV1Getlinkstats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1Getlinkstats]
  }
  
  @scala.inline
  implicit class ParamsResourceV1GetlinkstatsOps[Self <: ParamsResourceV1Getlinkstats] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDurationDays(value: String): Self = this.set("durationDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationDays: Self = this.set("durationDays", js.undefined)
    
    @scala.inline
    def setDynamicLink(value: String): Self = this.set("dynamicLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicLink: Self = this.set("dynamicLink", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkVersion: Self = this.set("sdkVersion", js.undefined)
  }
}
