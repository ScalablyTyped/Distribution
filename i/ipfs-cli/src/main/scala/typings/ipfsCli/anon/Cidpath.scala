package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cidpath extends StObject {
  
  var cidpath: js.Any
  
  var ctx: Print
  
  var localResolve: js.Any
  
  var timeout: js.Any
}
object Cidpath {
  
  inline def apply(cidpath: js.Any, ctx: Print, localResolve: js.Any, timeout: js.Any): Cidpath = {
    val __obj = js.Dynamic.literal(cidpath = cidpath.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], localResolve = localResolve.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cidpath]
  }
  
  extension [Self <: Cidpath](x: Self) {
    
    inline def setCidpath(value: js.Any): Self = StObject.set(x, "cidpath", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setLocalResolve(value: js.Any): Self = StObject.set(x, "localResolve", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
