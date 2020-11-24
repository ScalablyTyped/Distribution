package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetAssetsHistoryResponse extends js.Object {
  
  /** A list of assets with valid time windows. */
  var assets: js.UndefOr[js.Array[TemporalAsset]] = js.native
}
object BatchGetAssetsHistoryResponse {
  
  @scala.inline
  def apply(): BatchGetAssetsHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetAssetsHistoryResponse]
  }
  
  @scala.inline
  implicit class BatchGetAssetsHistoryResponseOps[Self <: BatchGetAssetsHistoryResponse] (val x: Self) extends AnyVal {
    
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
    def setAssetsVarargs(value: TemporalAsset*): Self = this.set("assets", js.Array(value :_*))
    
    @scala.inline
    def setAssets(value: js.Array[TemporalAsset]): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssets: Self = this.set("assets", js.undefined)
  }
}
