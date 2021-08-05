package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IpfsPath extends StObject {
  
  var ctx: Print
  
  var ipfsPath: js.Any
  
  var length: js.Any
  
  var offset: js.Any
  
  var timeout: js.Any
}
object IpfsPath {
  
  inline def apply(ctx: Print, ipfsPath: js.Any, length: js.Any, offset: js.Any, timeout: js.Any): IpfsPath = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpfsPath]
  }
  
  extension [Self <: IpfsPath](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setIpfsPath(value: js.Any): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
    
    inline def setLength(value: js.Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
