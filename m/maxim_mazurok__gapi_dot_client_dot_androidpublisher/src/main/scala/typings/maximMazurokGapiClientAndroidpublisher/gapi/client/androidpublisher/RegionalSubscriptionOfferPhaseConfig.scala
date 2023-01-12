package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalSubscriptionOfferPhaseConfig extends StObject {
  
  /**
    * The absolute amount of money subtracted from the base plan price prorated over the phase duration that the user pays for this offer phase. For example, if the base plan price for
    * this region is $12 for a period of 1 year, then a $1 absolute discount for a phase of a duration of 3 months would correspond to a price of $2. The resulting price may not be
    * smaller than the minimum price allowed for this region.
    */
  var absoluteDiscount: js.UndefOr[Money] = js.undefined
  
  /** The absolute price the user pays for this offer phase. The price must not be smaller than the minimum price allowed for this region. */
  var price: js.UndefOr[Money] = js.undefined
  
  /** Required. Immutable. The region to which this config applies. */
  var regionCode: js.UndefOr[String] = js.undefined
  
  /**
    * The fraction of the base plan price prorated over the phase duration that the user pays for this offer phase. For example, if the base plan price for this region is $12 for a period
    * of 1 year, then a 50% discount for a phase of a duration of 3 months would correspond to a price of $1.50. The discount must be specified as a fraction strictly larger than 0 and
    * strictly smaller than 1. The resulting price will be rounded to the nearest billable unit (e.g. cents for USD). The relative discount is considered invalid if the discounted price
    * ends up being smaller than the minimum price allowed in this region.
    */
  var relativeDiscount: js.UndefOr[Double] = js.undefined
}
object RegionalSubscriptionOfferPhaseConfig {
  
  inline def apply(): RegionalSubscriptionOfferPhaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalSubscriptionOfferPhaseConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegionalSubscriptionOfferPhaseConfig] (val x: Self) extends AnyVal {
    
    inline def setAbsoluteDiscount(value: Money): Self = StObject.set(x, "absoluteDiscount", value.asInstanceOf[js.Any])
    
    inline def setAbsoluteDiscountUndefined: Self = StObject.set(x, "absoluteDiscount", js.undefined)
    
    inline def setPrice(value: Money): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setRelativeDiscount(value: Double): Self = StObject.set(x, "relativeDiscount", value.asInstanceOf[js.Any])
    
    inline def setRelativeDiscountUndefined: Self = StObject.set(x, "relativeDiscount", js.undefined)
  }
}
