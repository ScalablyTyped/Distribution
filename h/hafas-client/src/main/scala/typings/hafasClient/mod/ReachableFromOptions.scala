package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReachableFromOptions extends StObject {
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.undefined
  
  /**
    * maximum travel duration in minutes, pass `null` for infinite
    * @default 20
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * maximum of transfers
    * @default 5
    */
  var maxTransfers: js.UndefOr[Double] = js.undefined
  
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
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when
    * @default undefined
    */
  var when: js.UndefOr[js.Date] = js.undefined
}
object ReachableFromOptions {
  
  inline def apply(): ReachableFromOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachableFromOptions]
  }
  
  extension [Self <: ReachableFromOptions](x: Self) {
    
    inline def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    inline def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setMaxTransfers(value: Double): Self = StObject.set(x, "maxTransfers", value.asInstanceOf[js.Any])
    
    inline def setMaxTransfersUndefined: Self = StObject.set(x, "maxTransfers", js.undefined)
    
    inline def setPolylines(value: Boolean): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    inline def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    inline def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
    
    inline def setWhen(value: js.Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
