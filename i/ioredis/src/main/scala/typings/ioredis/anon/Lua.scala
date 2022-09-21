package typings.ioredis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lua extends StObject {
  
  var lua: String
  
  var numberOfKeys: js.UndefOr[Double] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object Lua {
  
  inline def apply(lua: String): Lua = {
    val __obj = js.Dynamic.literal(lua = lua.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lua]
  }
  
  extension [Self <: Lua](x: Self) {
    
    inline def setLua(value: String): Self = StObject.set(x, "lua", value.asInstanceOf[js.Any])
    
    inline def setNumberOfKeys(value: Double): Self = StObject.set(x, "numberOfKeys", value.asInstanceOf[js.Any])
    
    inline def setNumberOfKeysUndefined: Self = StObject.set(x, "numberOfKeys", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
