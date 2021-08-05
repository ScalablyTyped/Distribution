package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bool extends StObject {
  
  var bool: js.Any
  
  var ctx: Print
  
  var json: js.Any
  
  var key: js.Any
  
  var timeout: js.Any
  
  var value: js.Any
}
object Bool {
  
  inline def apply(bool: js.Any, ctx: Print, json: js.Any, key: js.Any, timeout: js.Any, value: js.Any): Bool = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bool]
  }
  
  extension [Self <: Bool](x: Self) {
    
    inline def setBool(value: js.Any): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
