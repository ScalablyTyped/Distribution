package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealServingMetadata extends StObject {
  
  /** Output only. Tracks which parties (if any) have paused a deal. */
  var dealPauseStatus: js.UndefOr[DealPauseStatus] = js.undefined
}
object DealServingMetadata {
  
  inline def apply(): DealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DealServingMetadata] (val x: Self) extends AnyVal {
    
    inline def setDealPauseStatus(value: DealPauseStatus): Self = StObject.set(x, "dealPauseStatus", value.asInstanceOf[js.Any])
    
    inline def setDealPauseStatusUndefined: Self = StObject.set(x, "dealPauseStatus", js.undefined)
  }
}
