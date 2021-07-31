package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApksAddExternallyHostedResponse extends StObject {
  
  /** The definition of the externally-hosted APK and where it is located. */
  var externallyHostedApk: js.UndefOr[ExternallyHostedApk] = js.undefined
}
object ApksAddExternallyHostedResponse {
  
  @scala.inline
  def apply(): ApksAddExternallyHostedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApksAddExternallyHostedResponse]
  }
  
  @scala.inline
  implicit class ApksAddExternallyHostedResponseMutableBuilder[Self <: ApksAddExternallyHostedResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternallyHostedApk(value: ExternallyHostedApk): Self = StObject.set(x, "externallyHostedApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternallyHostedApkUndefined: Self = StObject.set(x, "externallyHostedApk", js.undefined)
  }
}
