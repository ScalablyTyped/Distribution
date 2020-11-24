package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for iSDK to get reopen attribution for app universal link open
  * deeplinking. This endpoint is meant for only iOS requests.
  */
@js.native
trait SchemaGetIosReopenAttributionRequest extends js.Object {
  
  /**
    * APP bundle ID.
    */
  var bundleId: js.UndefOr[String] = js.native
  
  /**
    * FDL link to be verified from an app universal link open. The FDL link can
    * be one of: 1) short FDL. e.g. &lt;app_code&gt;.page.link/&lt;ddl_id&gt;,
    * or 2) long FDL. e.g. &lt;app_code&gt;.page.link/?{query params}, or 3)
    * Invite FDL. e.g. &lt;app_code&gt;.page.link/i/&lt;invite_id_or_alias&gt;
    */
  var requestedLink: js.UndefOr[String] = js.native
  
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.native
}
object SchemaGetIosReopenAttributionRequest {
  
  @scala.inline
  def apply(): SchemaGetIosReopenAttributionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosReopenAttributionRequest]
  }
  
  @scala.inline
  implicit class SchemaGetIosReopenAttributionRequestOps[Self <: SchemaGetIosReopenAttributionRequest] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("bundleId", js.undefined)
    
    @scala.inline
    def setRequestedLink(value: String): Self = this.set("requestedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedLink: Self = this.set("requestedLink", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSdkVersion: Self = this.set("sdkVersion", js.undefined)
  }
}
