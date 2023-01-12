package typings.massive.mod

import typings.massive.massiveStrings.ASC
import typings.massive.massiveStrings.DESC
import typings.massive.massiveStrings.FIRST
import typings.massive.massiveStrings.LAST
import typings.massive.massiveStrings.asc_
import typings.massive.massiveStrings.desc_
import typings.massive.massiveStrings.first_
import typings.massive.massiveStrings.last_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderingOptions extends StObject {
  
  var direction: js.UndefOr[ASC | asc_ | DESC | desc_] = js.undefined
  
  var expr: js.UndefOr[String] = js.undefined
  
  var field: js.UndefOr[String] = js.undefined
  
  var last: js.UndefOr[String] = js.undefined
  
  var nulls: js.UndefOr[FIRST | first_ | LAST | last_] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object OrderingOptions {
  
  inline def apply(): OrderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderingOptions] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: ASC | asc_ | DESC | desc_): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setExpr(value: String): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
    
    inline def setNulls(value: FIRST | first_ | LAST | last_): Self = StObject.set(x, "nulls", value.asInstanceOf[js.Any])
    
    inline def setNullsUndefined: Self = StObject.set(x, "nulls", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
