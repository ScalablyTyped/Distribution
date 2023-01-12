package typings.lesgo.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var sub: js.UndefOr[(Record[String, Any]) | Null] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setSub(value: Record[String, Any]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubNull: Self = StObject.set(x, "sub", null)
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
  }
}
