package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInstanceMetadata extends js.Object {
  
  /** The time at which the operation failed or was completed successfully. */
  var finishTime: js.UndefOr[String] = js.native
  
  /** The request that prompted the initiation of this UpdateInstance operation. */
  var originalRequest: js.UndefOr[PartialUpdateInstanceRequest] = js.native
  
  /** The time at which the original request was received. */
  var requestTime: js.UndefOr[String] = js.native
}
object UpdateInstanceMetadata {
  
  @scala.inline
  def apply(): UpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceMetadata]
  }
  
  @scala.inline
  implicit class UpdateInstanceMetadataOps[Self <: UpdateInstanceMetadata] (val x: Self) extends AnyVal {
    
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
    def setFinishTime(value: String): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishTime: Self = this.set("finishTime", js.undefined)
    
    @scala.inline
    def setOriginalRequest(value: PartialUpdateInstanceRequest): Self = this.set("originalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalRequest: Self = this.set("originalRequest", js.undefined)
    
    @scala.inline
    def setRequestTime(value: String): Self = this.set("requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTime: Self = this.set("requestTime", js.undefined)
  }
}
