package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderLineItemProductVariantAttribute extends StObject {
  
  /** The dimension of the variant. */
  var dimension: js.UndefOr[String] = js.undefined
  
  /** The value for the dimension. */
  var value: js.UndefOr[String] = js.undefined
}
object OrderLineItemProductVariantAttribute {
  
  inline def apply(): OrderLineItemProductVariantAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemProductVariantAttribute]
  }
  
  extension [Self <: OrderLineItemProductVariantAttribute](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
