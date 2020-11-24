package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApksAddExternallyHostedRequest extends js.Object {
  
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
  implicit class ApksAddExternallyHostedRequestOps[Self <: ApksAddExternallyHostedRequest] (val x: Self) extends AnyVal {
    
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
    def setExternallyHostedApk(value: ExternallyHostedApk): Self = this.set("externallyHostedApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternallyHostedApk: Self = this.set("externallyHostedApk", js.undefined)
  }
}
