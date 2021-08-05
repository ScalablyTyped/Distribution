package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flush extends StObject {
  
  var ctx: IpfsAny
  
  var flush: js.Any
  
  var hashAlg: js.Any
  
  var mode: js.Any
  
  var path: js.Any
  
  var recursive: js.Any
  
  var shardSplitThreshold: js.Any
  
  var timeout: js.Any
}
object Flush {
  
  inline def apply(
    ctx: IpfsAny,
    flush: js.Any,
    hashAlg: js.Any,
    mode: js.Any,
    path: js.Any,
    recursive: js.Any,
    shardSplitThreshold: js.Any,
    timeout: js.Any
  ): Flush = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flush]
  }
  
  extension [Self <: Flush](x: Self) {
    
    inline def setCtx(value: IpfsAny): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: js.Any): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setHashAlg(value: js.Any): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setShardSplitThreshold(value: js.Any): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
