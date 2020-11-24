package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaFirebaseLink extends js.Object {
  
  /** Output only. Time when this FirebaseLink was originally created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Maximum user access to the GA4 property allowed to admins of the linked Firebase project. */
  var maximumUserAccess: js.UndefOr[String] = js.native
  
  /** Output only. Example format: properties/1234/firebaseLinks/5678 */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Immutable. Firebase project resource name. When creating a FirebaseLink, you may provide this resource name using either a project number or project ID. Once this resource has been
    * created, returned FirebaseLinks will always have a project_name that contains a project number. Format: 'projects/{project number}' Example: 'projects/1234'
    */
  var project: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaFirebaseLink {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaFirebaseLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaFirebaseLink]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaFirebaseLinkOps[Self <: GoogleAnalyticsAdminV1alphaFirebaseLink] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setMaximumUserAccess(value: String): Self = this.set("maximumUserAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumUserAccess: Self = this.set("maximumUserAccess", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
}
