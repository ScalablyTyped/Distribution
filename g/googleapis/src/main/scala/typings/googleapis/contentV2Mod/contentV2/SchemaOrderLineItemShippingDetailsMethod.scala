package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemShippingDetailsMethod extends StObject {
  
  /**
    * The carrier for the shipping. Optional. See shipments[].carrier for a
    * list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum transit time.
    */
  var maxDaysInTransit: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the shipping method.
    */
  var methodName: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum transit time.
    */
  var minDaysInTransit: js.UndefOr[Double] = js.undefined
}
object SchemaOrderLineItemShippingDetailsMethod {
  
  inline def apply(): SchemaOrderLineItemShippingDetailsMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetailsMethod]
  }
  
  extension [Self <: SchemaOrderLineItemShippingDetailsMethod](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setMaxDaysInTransit(value: Double): Self = StObject.set(x, "maxDaysInTransit", value.asInstanceOf[js.Any])
    
    inline def setMaxDaysInTransitUndefined: Self = StObject.set(x, "maxDaysInTransit", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setMinDaysInTransit(value: Double): Self = StObject.set(x, "minDaysInTransit", value.asInstanceOf[js.Any])
    
    inline def setMinDaysInTransitUndefined: Self = StObject.set(x, "minDaysInTransit", js.undefined)
  }
}
