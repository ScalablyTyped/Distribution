package typings.layuiSrc.anon

import typings.layuiSrc.layuiSrcStrings.`null`
import typings.layuiSrc.layuiSrcStrings.asc
import typings.layuiSrc.layuiSrcStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field extends StObject {
  
  var field: String
  
  var `type`: js.UndefOr[`null` | desc | asc] = js.undefined
}
object Field {
  
  inline def apply(field: String): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setType(value: `null` | desc | asc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
