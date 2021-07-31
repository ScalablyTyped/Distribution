package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaFirebaseLink extends StObject {
  
  /** Output only. Time when this FirebaseLink was originally created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Maximum user access to the GA4 property allowed to admins of the linked Firebase project. */
  var maximumUserAccess: js.UndefOr[String] = js.undefined
  
  /** Output only. Example format: properties/1234/firebaseLinks/5678 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. Firebase project resource name. When creating a FirebaseLink, you may provide this resource name using either a project number or project ID. Once this resource has been
    * created, returned FirebaseLinks will always have a project_name that contains a project number. Format: 'projects/{project number}' Example: 'projects/1234'
    */
  var project: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaFirebaseLink {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaFirebaseLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaFirebaseLink]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaFirebaseLinkMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaFirebaseLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setMaximumUserAccess(value: String): Self = StObject.set(x, "maximumUserAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUserAccessUndefined: Self = StObject.set(x, "maximumUserAccess", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
