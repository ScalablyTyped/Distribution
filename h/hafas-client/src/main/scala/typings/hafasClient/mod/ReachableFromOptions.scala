package typings.hafasClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReachableFromOptions extends StObject {
  
  /**
    * parse & expose entrances of stops/stations?
    * @default true
    */
  var entrances: js.UndefOr[Boolean] = js.native
  
  /**
    * maximum travel duration in minutes, pass `null` for infinite
    * @default 20
    */
  var maxDuration: js.UndefOr[Double] = js.native
  
  /**
    * maximum of transfers
    * @default 5
    */
  var maxTransfers: js.UndefOr[Double] = js.native
  
  /**
    * products
    * @default undefined
    */
  var products: js.UndefOr[Products] = js.native
  
  /**
    * parse & expose sub-stops of stations?
    * @default true
    */
  var subStops: js.UndefOr[Boolean] = js.native
  
  /**
    * when
    * @default undefined
    */
  var when: js.UndefOr[Date] = js.native
}
object ReachableFromOptions {
  
  @scala.inline
  def apply(): ReachableFromOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReachableFromOptions]
  }
  
  @scala.inline
  implicit class ReachableFromOptionsMutableBuilder[Self <: ReachableFromOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntrances(value: Boolean): Self = StObject.set(x, "entrances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrancesUndefined: Self = StObject.set(x, "entrances", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setMaxTransfers(value: Double): Self = StObject.set(x, "maxTransfers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTransfersUndefined: Self = StObject.set(x, "maxTransfers", js.undefined)
    
    @scala.inline
    def setProducts(value: Products): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setSubStops(value: Boolean): Self = StObject.set(x, "subStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubStopsUndefined: Self = StObject.set(x, "subStops", js.undefined)
    
    @scala.inline
    def setWhen(value: Date): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
  }
}
