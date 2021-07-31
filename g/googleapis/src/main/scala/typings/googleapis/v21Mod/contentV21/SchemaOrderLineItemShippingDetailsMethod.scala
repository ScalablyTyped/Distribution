package typings.googleapis.v21Mod.contentV21

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
  
  @scala.inline
  def apply(): SchemaOrderLineItemShippingDetailsMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetailsMethod]
  }
  
  @scala.inline
  implicit class SchemaOrderLineItemShippingDetailsMethodMutableBuilder[Self <: SchemaOrderLineItemShippingDetailsMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    @scala.inline
    def setMaxDaysInTransit(value: Double): Self = StObject.set(x, "maxDaysInTransit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDaysInTransitUndefined: Self = StObject.set(x, "maxDaysInTransit", js.undefined)
    
    @scala.inline
    def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    @scala.inline
    def setMinDaysInTransit(value: Double): Self = StObject.set(x, "minDaysInTransit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDaysInTransitUndefined: Self = StObject.set(x, "minDaysInTransit", js.undefined)
  }
}
