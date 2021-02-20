package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApksAddExternallyHostedRequest extends StObject {
  
  /** The definition of the externally-hosted APK and where it is located. */
  var externallyHostedApk: js.UndefOr[ExternallyHostedApk] = js.native
}
object ApksAddExternallyHostedRequest {
  
  @scala.inline
  def apply(): ApksAddExternallyHostedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApksAddExternallyHostedRequest]
  }
  
  @scala.inline
  implicit class ApksAddExternallyHostedRequestMutableBuilder[Self <: ApksAddExternallyHostedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternallyHostedApk(value: ExternallyHostedApk): Self = StObject.set(x, "externallyHostedApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternallyHostedApkUndefined: Self = StObject.set(x, "externallyHostedApk", js.undefined)
  }
}
