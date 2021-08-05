package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var cidBase: js.Any
  
  var cidVersion: js.Any
  
  var ctx: Print
  
  var name: js.Any
  
  var ref: js.Any
  
  var root: js.Any
  
  var timeout: js.Any
}
object Root {
  
  inline def apply(
    cidBase: js.Any,
    cidVersion: js.Any,
    ctx: Print,
    name: js.Any,
    ref: js.Any,
    root: js.Any,
    timeout: js.Any
  ): Root = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], cidVersion = cidVersion.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    inline def setCidVersion(value: js.Any): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRef(value: js.Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
