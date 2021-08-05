package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nocache extends StObject {
  
  var ctx: Print
  
  var name: js.Any
  
  var nocache: js.Any
  
  var recursive: js.Any
  
  var stream: js.Any
  
  var timeout: js.Any
}
object Nocache {
  
  inline def apply(ctx: Print, name: js.Any, nocache: js.Any, recursive: js.Any, stream: js.Any, timeout: js.Any): Nocache = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nocache = nocache.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nocache]
  }
  
  extension [Self <: Nocache](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNocache(value: js.Any): Self = StObject.set(x, "nocache", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
