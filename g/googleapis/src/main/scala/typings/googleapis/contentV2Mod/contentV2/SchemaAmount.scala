package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAmount extends StObject {
  
  /**
    * [required] Value before taxes.
    */
  var pretax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * [required] Tax value.
    */
  var tax: js.UndefOr[SchemaPrice] = js.undefined
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
    def setPretax(value: SchemaPrice): Self = StObject.set(x, "pretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPretaxUndefined: Self = StObject.set(x, "pretax", js.undefined)
    
    @scala.inline
    def setTax(value: SchemaPrice): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
  }
}
