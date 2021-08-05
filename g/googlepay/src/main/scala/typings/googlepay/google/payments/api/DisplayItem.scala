package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of a cart item.
  */
trait DisplayItem extends StObject {
  
  /**
    * The label to be displayed for the item.
    *
    * This field is required.
    */
  var label: String
  
  /**
    * Price of this item.
    *
    * The format of this string should follow the regular expression
    * format:
    * `^[0-9]+(\.[0-9][0-9])?$` (e.g., `"10.45"`)
    */
  var price: String
  
  /**
    * The status of a DisplayItem.
    *
    * This field is optional and default value is
    * [[DisplayItemStatus|`FINAL`]] if absent.
    */
  var status: js.UndefOr[DisplayItemStatus] = js.undefined
  
  /**
    * Type of displayed line item, this is going to be used for analysis
    * purpose.
    *
    * This field is required.
    */
  var `type`: DisplayItemType
}
object DisplayItem {
  
  inline def apply(label: String, price: String, `type`: DisplayItemType): DisplayItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayItem]
  }
  
  extension [Self <: DisplayItem](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DisplayItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: DisplayItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
