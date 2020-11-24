package typings.googleapis.runV1alpha1Mod.runV1alpha1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceNamespacesConfigurationsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Optional encoded string to continue paging.
    */
  var continue: js.UndefOr[String] = js.native
  
  /**
    * Allows to filter resources based on a specific value for a field name.
    * Send this in a query string format. i.e. 'metadata.name%3Dlorem'. Not
    * currently used by Cloud Run.
    */
  var fieldSelector: js.UndefOr[String] = js.native
  
  /**
    * Not currently used by Cloud Run.
    */
  var includeUninitialized: js.UndefOr[Boolean] = js.native
  
  /**
    * Allows to filter resources based on a label. Supported operations are =,
    * !=, exists, in, and notIn.
    */
  var labelSelector: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of records that should be returned.
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * The project ID or project number from which the configurations should be
    * listed.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The baseline resource version from which the list or watch operation
    * should start. Not currently used by Cloud Run.
    */
  var resourceVersion: js.UndefOr[String] = js.native
  
  /**
    * Flag that indicates that the client expects to watch this resource as
    * well. Not currently used by Cloud Run.
    */
  var watch: js.UndefOr[Boolean] = js.native
}
object ParamsResourceNamespacesConfigurationsList {
  
  @scala.inline
  def apply(): ParamsResourceNamespacesConfigurationsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNamespacesConfigurationsList]
  }
  
  @scala.inline
  implicit class ParamsResourceNamespacesConfigurationsListOps[Self <: ParamsResourceNamespacesConfigurationsList] (val x: Self) extends AnyVal {
    
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
    def setContinue(value: String): Self = this.set("continue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinue: Self = this.set("continue", js.undefined)
    
    @scala.inline
    def setFieldSelector(value: String): Self = this.set("fieldSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldSelector: Self = this.set("fieldSelector", js.undefined)
    
    @scala.inline
    def setIncludeUninitialized(value: Boolean): Self = this.set("includeUninitialized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUninitialized: Self = this.set("includeUninitialized", js.undefined)
    
    @scala.inline
    def setLabelSelector(value: String): Self = this.set("labelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelSelector: Self = this.set("labelSelector", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setResourceVersion(value: String): Self = this.set("resourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceVersion: Self = this.set("resourceVersion", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
