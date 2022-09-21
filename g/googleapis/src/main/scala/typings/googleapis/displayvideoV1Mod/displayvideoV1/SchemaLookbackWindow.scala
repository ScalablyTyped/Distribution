package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookbackWindow extends StObject {
  
  /**
    * Lookback window, in days, from the last time a given user clicked on one of your ads.
    */
  var clickDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Lookback window, in days, from the last time a given user viewed one of your ads.
    */
  var impressionDays: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLookbackWindow {
  
  inline def apply(): SchemaLookbackWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookbackWindow]
  }
  
  extension [Self <: SchemaLookbackWindow](x: Self) {
    
    inline def setClickDays(value: Double): Self = StObject.set(x, "clickDays", value.asInstanceOf[js.Any])
    
    inline def setClickDaysNull: Self = StObject.set(x, "clickDays", null)
    
    inline def setClickDaysUndefined: Self = StObject.set(x, "clickDays", js.undefined)
    
    inline def setImpressionDays(value: Double): Self = StObject.set(x, "impressionDays", value.asInstanceOf[js.Any])
    
    inline def setImpressionDaysNull: Self = StObject.set(x, "impressionDays", null)
    
    inline def setImpressionDaysUndefined: Self = StObject.set(x, "impressionDays", js.undefined)
  }
}
