package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAmount extends StObject {
  
  /**
    * [required] The pre-tax or post-tax price depending on the location of the
    * order.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * [required] Tax value.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.native
}
object SchemaAmount {
  
  @scala.inline
  def apply(): SchemaAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAmount]
  }
  
  @scala.inline
  implicit class SchemaAmountMutableBuilder[Self <: SchemaAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriceAmount(value: SchemaPrice): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: SchemaPrice): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
