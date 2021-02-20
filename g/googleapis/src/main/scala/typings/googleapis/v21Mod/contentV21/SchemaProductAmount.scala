package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaProductAmount extends StObject {
  
  /**
    * The pre-tax or post-tax price depending on the location of the order.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Remitted tax value.
    */
  var remittedTaxAmount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Tax value.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.native
}
object SchemaProductAmount {
  
  @scala.inline
  def apply(): SchemaProductAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAmount]
  }
  
  @scala.inline
  implicit class SchemaProductAmountMutableBuilder[Self <: SchemaProductAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriceAmount(value: SchemaPrice): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    @scala.inline
    def setRemittedTaxAmount(value: SchemaPrice): Self = StObject.set(x, "remittedTaxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemittedTaxAmountUndefined: Self = StObject.set(x, "remittedTaxAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: SchemaPrice): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
