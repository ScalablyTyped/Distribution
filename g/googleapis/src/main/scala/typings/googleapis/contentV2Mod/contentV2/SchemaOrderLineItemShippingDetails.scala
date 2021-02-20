package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderLineItemShippingDetails extends StObject {
  
  /**
    * The delivery by date, in ISO 8601 format.
    */
  var deliverByDate: js.UndefOr[String] = js.native
  
  /**
    * Details of the shipping method.
    */
  var method: js.UndefOr[SchemaOrderLineItemShippingDetailsMethod] = js.native
  
  /**
    * The ship by date, in ISO 8601 format.
    */
  var shipByDate: js.UndefOr[String] = js.native
}
object SchemaOrderLineItemShippingDetails {
  
  @scala.inline
  def apply(): SchemaOrderLineItemShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemShippingDetails]
  }
  
  @scala.inline
  implicit class SchemaOrderLineItemShippingDetailsMutableBuilder[Self <: SchemaOrderLineItemShippingDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliverByDate(value: String): Self = StObject.set(x, "deliverByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliverByDateUndefined: Self = StObject.set(x, "deliverByDate", js.undefined)
    
    @scala.inline
    def setMethod(value: SchemaOrderLineItemShippingDetailsMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setShipByDate(value: String): Self = StObject.set(x, "shipByDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipByDateUndefined: Self = StObject.set(x, "shipByDate", js.undefined)
  }
}
