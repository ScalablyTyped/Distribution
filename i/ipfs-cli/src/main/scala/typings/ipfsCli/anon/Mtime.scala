package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mtime extends StObject {
  
  var cidVersion: js.Any
  
  var ctx: IpfsAny
  
  var flush: js.Any
  
  var hashAlg: js.Any
  
  var mtime: js.Any
  
  var mtimeNsecs: js.Any
  
  var path: js.Any
  
  var shardSplitThreshold: js.Any
  
  var timeout: js.Any
}
object Mtime {
  
  inline def apply(
    cidVersion: js.Any,
    ctx: IpfsAny,
    flush: js.Any,
    hashAlg: js.Any,
    mtime: js.Any,
    mtimeNsecs: js.Any,
    path: js.Any,
    shardSplitThreshold: js.Any,
    timeout: js.Any
  ): Mtime = {
    val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeNsecs = mtimeNsecs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mtime]
  }
  
  extension [Self <: Mtime](x: Self) {
    
    inline def setCidVersion(value: js.Any): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: IpfsAny): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: js.Any): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setHashAlg(value: js.Any): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: js.Any): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeNsecs(value: js.Any): Self = StObject.set(x, "mtimeNsecs", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setShardSplitThreshold(value: js.Any): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
