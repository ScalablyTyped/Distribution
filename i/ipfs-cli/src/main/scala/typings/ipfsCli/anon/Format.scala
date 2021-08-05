package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var cidBase: js.Any
  
  var ctx: Print
  
  var format: js.Any
  
  var hash: js.Any
  
  var path: js.Any
  
  var size: js.Any
  
  var timeout: js.Any
  
  var withLocal: js.Any
}
object Format {
  
  inline def apply(
    cidBase: js.Any,
    ctx: Print,
    format: js.Any,
    hash: js.Any,
    path: js.Any,
    size: js.Any,
    timeout: js.Any,
    withLocal: js.Any
  ): Format = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], withLocal = withLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: js.Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setHash(value: js.Any): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setWithLocal(value: js.Any): Self = StObject.set(x, "withLocal", value.asInstanceOf[js.Any])
  }
}
