package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameRecursive extends StObject {
  
  var cidBase: js.Any
  
  var ctx: IpfsAny
  
  var name: js.Any
  
  var recursive: js.Any
  
  var timeout: js.Any
}
object NameRecursive {
  
  inline def apply(cidBase: js.Any, ctx: IpfsAny, name: js.Any, recursive: js.Any, timeout: js.Any): NameRecursive = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameRecursive]
  }
  
  extension [Self <: NameRecursive](x: Self) {
    
    inline def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: IpfsAny): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
