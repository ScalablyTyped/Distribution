package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporalAsset extends js.Object {
  
  /** An asset in Google Cloud. */
  var asset: js.UndefOr[Asset] = js.native
  
  /** Whether the asset has been deleted or not. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** Prior copy of the asset. Populated if prior_asset_state is PRESENT. Currently this is only set for responses in Real-Time Feed. */
  var priorAsset: js.UndefOr[Asset] = js.native
  
  /** State of prior_asset. */
  var priorAssetState: js.UndefOr[String] = js.native
  
  /** The time window when the asset data and state was observed. */
  var window: js.UndefOr[TimeWindow] = js.native
}
object TemporalAsset {
  
  @scala.inline
  def apply(): TemporalAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalAsset]
  }
  
  @scala.inline
  implicit class TemporalAssetOps[Self <: TemporalAsset] (val x: Self) extends AnyVal {
    
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
    def setAsset(value: Asset): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setPriorAsset(value: Asset): Self = this.set("priorAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorAsset: Self = this.set("priorAsset", js.undefined)
    
    @scala.inline
    def setPriorAssetState(value: String): Self = this.set("priorAssetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorAssetState: Self = this.set("priorAssetState", js.undefined)
    
    @scala.inline
    def setWindow(value: TimeWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
