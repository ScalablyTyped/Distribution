package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayExtname extends StObject {
  
  var array: js.UndefOr[Any] = js.undefined
  
  var extname: js.UndefOr[String] = js.undefined
}
object ArrayExtname {
  
  inline def apply(): ArrayExtname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayExtname]
  }
  
  extension [Self <: ArrayExtname](x: Self) {
    
    inline def setArray(value: Any): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setExtnameUndefined: Self = StObject.set(x, "extname", js.undefined)
  }
}
