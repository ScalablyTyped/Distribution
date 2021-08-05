package typings.hapiJoi.mod

import typings.hapiJoi.hapiJoiStrings.ascending
import typings.hapiJoi.hapiJoiStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArraySortOptions extends StObject {
  
  var by: js.UndefOr[String | Reference] = js.undefined
  
  /**
    * @default 'ascending'
    */
  var order: js.UndefOr[ascending | descending] = js.undefined
}
object ArraySortOptions {
  
  inline def apply(): ArraySortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArraySortOptions]
  }
  
  extension [Self <: ArraySortOptions](x: Self) {
    
    inline def setBy(value: String | Reference): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    inline def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    inline def setOrder(value: ascending | descending): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
