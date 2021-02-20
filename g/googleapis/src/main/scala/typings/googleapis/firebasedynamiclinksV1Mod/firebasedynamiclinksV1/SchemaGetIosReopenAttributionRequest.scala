package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for iSDK to get reopen attribution for app universal link open
  * deeplinking. This endpoint is meant for only iOS requests.
  */
@js.native
trait SchemaGetIosReopenAttributionRequest extends StObject {
  
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
  implicit class SchemaGetIosReopenAttributionRequestMutableBuilder[Self <: SchemaGetIosReopenAttributionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "bundleId", js.undefined)
    
    @scala.inline
    def setRequestedLink(value: String): Self = StObject.set(x, "requestedLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedLinkUndefined: Self = StObject.set(x, "requestedLink", js.undefined)
    
    @scala.inline
    def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkVersionUndefined: Self = StObject.set(x, "sdkVersion", js.undefined)
  }
}
