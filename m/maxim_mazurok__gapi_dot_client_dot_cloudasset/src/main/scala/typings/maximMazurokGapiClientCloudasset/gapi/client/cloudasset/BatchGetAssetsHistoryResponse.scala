package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetsHistoryResponse extends StObject {
  
  /** A list of assets with valid time windows. */
  var assets: js.UndefOr[js.Array[TemporalAsset]] = js.undefined
}
object BatchGetAssetsHistoryResponse {
  
  @scala.inline
  def apply(): BatchGetAssetsHistoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetAssetsHistoryResponse]
  }
  
  @scala.inline
  implicit class BatchGetAssetsHistoryResponseMutableBuilder[Self <: BatchGetAssetsHistoryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssets(value: js.Array[TemporalAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    @scala.inline
    def setAssetsVarargs(value: TemporalAsset*): Self = StObject.set(x, "assets", js.Array(value :_*))
  }
}
