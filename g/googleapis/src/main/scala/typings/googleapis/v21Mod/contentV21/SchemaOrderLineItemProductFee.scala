package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderLineItemProductFee extends StObject {
  
  /**
    * Amount of the fee.
    */
  var amount: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Name of the fee.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaOrderLineItemProductFee {
  
  @scala.inline
  def apply(): SchemaOrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLineItemProductFee]
  }
  
  @scala.inline
  implicit class SchemaOrderLineItemProductFeeMutableBuilder[Self <: SchemaOrderLineItemProductFee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
