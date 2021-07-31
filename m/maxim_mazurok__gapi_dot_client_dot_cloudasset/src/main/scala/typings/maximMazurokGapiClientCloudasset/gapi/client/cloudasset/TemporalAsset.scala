package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporalAsset extends StObject {
  
  /** An asset in Google Cloud. */
  var asset: js.UndefOr[Asset] = js.undefined
  
  /** Whether the asset has been deleted or not. */
  var deleted: js.UndefOr[Boolean] = js.undefined
  
  /** Prior copy of the asset. Populated if prior_asset_state is PRESENT. Currently this is only set for responses in Real-Time Feed. */
  var priorAsset: js.UndefOr[Asset] = js.undefined
  
  /** State of prior_asset. */
  var priorAssetState: js.UndefOr[String] = js.undefined
  
  /** The time window when the asset data and state was observed. */
  var window: js.UndefOr[TimeWindow] = js.undefined
}
object TemporalAsset {
  
  @scala.inline
  def apply(): TemporalAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalAsset]
  }
  
  @scala.inline
  implicit class TemporalAssetMutableBuilder[Self <: TemporalAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: Asset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setPriorAsset(value: Asset): Self = StObject.set(x, "priorAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorAssetState(value: String): Self = StObject.set(x, "priorAssetState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorAssetStateUndefined: Self = StObject.set(x, "priorAssetState", js.undefined)
    
    @scala.inline
    def setPriorAssetUndefined: Self = StObject.set(x, "priorAsset", js.undefined)
    
    @scala.inline
    def setWindow(value: TimeWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
  }
}
