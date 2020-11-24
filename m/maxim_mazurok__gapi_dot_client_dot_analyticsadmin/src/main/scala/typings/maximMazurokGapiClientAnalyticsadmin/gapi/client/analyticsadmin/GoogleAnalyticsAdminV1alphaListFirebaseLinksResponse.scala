package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse extends js.Object {
  
  /** List of FirebaseLinks. This will have at most one value. */
  var firebaseLinks: js.UndefOr[js.Array[GoogleAnalyticsAdminV1alphaFirebaseLink]] = js.native
}
object GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaListFirebaseLinksResponseOps[Self <: GoogleAnalyticsAdminV1alphaListFirebaseLinksResponse] (val x: Self) extends AnyVal {
    
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
    def setFirebaseLinksVarargs(value: GoogleAnalyticsAdminV1alphaFirebaseLink*): Self = this.set("firebaseLinks", js.Array(value :_*))
    
    @scala.inline
    def setFirebaseLinks(value: js.Array[GoogleAnalyticsAdminV1alphaFirebaseLink]): Self = this.set("firebaseLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirebaseLinks: Self = this.set("firebaseLinks", js.undefined)
  }
}
