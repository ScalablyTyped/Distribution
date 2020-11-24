package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaApksAddExternallyHostedRequest extends js.Object {
  
  /**
    * The definition of the externally-hosted APK and where it is located.
    */
  var externallyHostedApk: js.UndefOr[SchemaExternallyHostedApk] = js.native
}
object SchemaApksAddExternallyHostedRequest {
  
  @scala.inline
  def apply(): SchemaApksAddExternallyHostedRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApksAddExternallyHostedRequest]
  }
  
  @scala.inline
  implicit class SchemaApksAddExternallyHostedRequestOps[Self <: SchemaApksAddExternallyHostedRequest] (val x: Self) extends AnyVal {
    
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
    def setExternallyHostedApk(value: SchemaExternallyHostedApk): Self = this.set("externallyHostedApk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternallyHostedApk: Self = this.set("externallyHostedApk", js.undefined)
  }
}
