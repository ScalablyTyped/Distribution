package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneysFromTripOptions extends StObject {
  
  /**
    * 'none', 'partial' or 'complete'
    * @default 'none'
    */
  var accessibility: js.UndefOr[String] = js.undefined
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return leg shapes?
    * @default false
    */
  var polylines: js.UndefOr[Boolean] = js.undefined
  
  /**
    * products
    * @default undefined
    */
  var products: js.UndefOr[Products] = js.undefined
  
  /**
    * parse & expose hints & warnings?
    * @default true
    */
  var remarks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return stations on the way?
    * @default false
    */
  var stopovers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return stations on the way?
    * @default false
    */
  /**
    * return tickets?
    * @default false
    */
  var tickets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * minimum time for a single transfer in minutes
    * @default 0
    */
  var transferTime: js.UndefOr[Double] = js.undefined
}
object JourneysFromTripOptions {
  
  inline def apply(): JourneysFromTripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneysFromTripOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JourneysFromTripOptions] (val x: Self) extends AnyVal {
    
    inline def setAccessibility(value: String): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setPolylines(value: Boolean): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setRemarks(value: Boolean): Self = StObject.set(x, "remarks", value.asInstanceOf[js.Any])
    
    inline def setRemarksUndefined: Self = StObject.set(x, "remarks", js.undefined)
    
    inline def setStopovers(value: Boolean): Self = StObject.set(x, "stopovers", value.asInstanceOf[js.Any])
    
    inline def setStopoversUndefined: Self = StObject.set(x, "stopovers", js.undefined)
    
    inline def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    inline def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
    
    inline def setTickets(value: Boolean): Self = StObject.set(x, "tickets", value.asInstanceOf[js.Any])
    
    inline def setTicketsUndefined: Self = StObject.set(x, "tickets", js.undefined)
    
    inline def setTransferTime(value: Double): Self = StObject.set(x, "transferTime", value.asInstanceOf[js.Any])
    
    inline def setTransferTimeUndefined: Self = StObject.set(x, "transferTime", js.undefined)
  }
}
