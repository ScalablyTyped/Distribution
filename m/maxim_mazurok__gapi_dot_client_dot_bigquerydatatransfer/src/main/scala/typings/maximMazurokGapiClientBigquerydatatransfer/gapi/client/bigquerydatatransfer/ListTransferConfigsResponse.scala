package typings.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTransferConfigsResponse extends js.Object {
  
  /**
    * Output only. The next-pagination token. For multiple-page list results, this token can be used as the `ListTransferConfigsRequest.page_token` to request the next page of list
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Output only. The stored pipeline transfer configurations. */
  var transferConfigs: js.UndefOr[js.Array[TransferConfig]] = js.native
}
object ListTransferConfigsResponse {
  
  @scala.inline
  def apply(): ListTransferConfigsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTransferConfigsResponse]
  }
  
  @scala.inline
  implicit class ListTransferConfigsResponseOps[Self <: ListTransferConfigsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferConfigsVarargs(value: TransferConfig*): Self = this.set("transferConfigs", js.Array(value :_*))
    
    @scala.inline
    def setTransferConfigs(value: js.Array[TransferConfig]): Self = this.set("transferConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferConfigs: Self = this.set("transferConfigs", js.undefined)
  }
}
