package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxIpfsPath extends StObject {
  
  var cidBase: js.Any
  
  var ctx: js.Any
  
  var ipfsPath: js.Any
  
  var recursive: js.Any
  
  var timeout: js.Any
}
object CtxIpfsPath {
  
  inline def apply(cidBase: js.Any, ctx: js.Any, ipfsPath: js.Any, recursive: js.Any, timeout: js.Any): CtxIpfsPath = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxIpfsPath]
  }
  
  extension [Self <: CtxIpfsPath](x: Self) {
    
    inline def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setIpfsPath(value: js.Any): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
