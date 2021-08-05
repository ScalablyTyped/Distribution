package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLineItemProductVariantAttribute extends StObject {
  
  /**
    * The dimension of the variant.
    */
  var dimension: js.UndefOr[String] = js.undefined
  
  /**
    * The value for the dimension.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaOrderLineItemProductVariantAttribute {
  
  inline def apply(): SchemaOrderLineItemProductVariantAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemProductVariantAttribute]
  }
  
  extension [Self <: SchemaOrderLineItemProductVariantAttribute](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
