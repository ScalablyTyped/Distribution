package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemShippingDetails extends StObject {
  
  /**
    * The delivery by date, in ISO 8601 format.
    */
  var deliverByDate: js.UndefOr[String] = js.undefined
  
  /**
    * Details of the shipping method.
    */
  var method: js.UndefOr[SchemaOrderLineItemShippingDetailsMethod] = js.undefined
  
  /**
    * The ship by date, in ISO 8601 format.
    */
  var shipByDate: js.UndefOr[String] = js.undefined
}
object SchemaOrderLineItemShippingDetails {
  
  inline def apply(): SchemaOrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetails]
  }
  
  extension [Self <: SchemaOrderLineItemShippingDetails](x: Self) {
    
    inline def setDeliverByDate(value: String): Self = StObject.set(x, "deliverByDate", value.asInstanceOf[js.Any])
    
    inline def setDeliverByDateUndefined: Self = StObject.set(x, "deliverByDate", js.undefined)
    
    inline def setMethod(value: SchemaOrderLineItemShippingDetailsMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setShipByDate(value: String): Self = StObject.set(x, "shipByDate", value.asInstanceOf[js.Any])
    
    inline def setShipByDateUndefined: Self = StObject.set(x, "shipByDate", js.undefined)
  }
}
