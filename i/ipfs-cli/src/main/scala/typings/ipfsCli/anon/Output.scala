package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  var ctx: Print
  
  var ipfsPath: js.Any
  
  var output: js.Any
  
  var timeout: js.Any
}
object Output {
  
  inline def apply(ctx: Print, ipfsPath: js.Any, output: js.Any, timeout: js.Any): Output = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  extension [Self <: Output](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setIpfsPath(value: js.Any): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
