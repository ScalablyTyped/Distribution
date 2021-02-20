package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaDealServingMetadata extends StObject {
  
  /**
    * True if alcohol ads are allowed for this deal (read-only). This field is
    * only populated when querying for finalized orders using the method
    * GetFinalizedOrderDeals
    */
  var alcoholAdsAllowed: js.UndefOr[Boolean] = js.native
  
  /**
    * Tracks which parties (if any) have paused a deal. (readonly, except via
    * PauseResumeOrderDeals action)
    */
  var dealPauseStatus: js.UndefOr[SchemaDealServingMetadataDealPauseStatus] = js.native
}
object SchemaDealServingMetadata {
  
  @scala.inline
  def apply(): SchemaDealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealServingMetadata]
  }
  
  @scala.inline
  implicit class SchemaDealServingMetadataMutableBuilder[Self <: SchemaDealServingMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlcoholAdsAllowed(value: Boolean): Self = StObject.set(x, "alcoholAdsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlcoholAdsAllowedUndefined: Self = StObject.set(x, "alcoholAdsAllowed", js.undefined)
    
    @scala.inline
    def setDealPauseStatus(value: SchemaDealServingMetadataDealPauseStatus): Self = StObject.set(x, "dealPauseStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealPauseStatusUndefined: Self = StObject.set(x, "dealPauseStatus", js.undefined)
  }
}
