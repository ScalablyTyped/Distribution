package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealServingMetadata extends StObject {
  
  /**
    * Output only. Tracks which parties (if any) have paused a deal.
    */
  var dealPauseStatus: js.UndefOr[SchemaDealPauseStatus] = js.undefined
}
object SchemaDealServingMetadata {
  
  inline def apply(): SchemaDealServingMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealServingMetadata]
  }
  
  extension [Self <: SchemaDealServingMetadata](x: Self) {
    
    inline def setDealPauseStatus(value: SchemaDealPauseStatus): Self = StObject.set(x, "dealPauseStatus", value.asInstanceOf[js.Any])
    
    inline def setDealPauseStatusUndefined: Self = StObject.set(x, "dealPauseStatus", js.undefined)
  }
}
