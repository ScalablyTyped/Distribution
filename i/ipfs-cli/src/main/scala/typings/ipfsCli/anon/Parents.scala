package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parents extends StObject {
  
  var cidVersion: js.Any
  
  var ctx: IpfsAny
  
  var dest: js.Any
  
  var flush: js.Any
  
  var hashAlg: js.Any
  
  var parents: js.Any
  
  var recursive: js.Any
  
  var shardSplitThreshold: js.Any
  
  var source: js.Any
  
  var timeout: js.Any
}
object Parents {
  
  inline def apply(
    cidVersion: js.Any,
    ctx: IpfsAny,
    dest: js.Any,
    flush: js.Any,
    hashAlg: js.Any,
    parents: js.Any,
    recursive: js.Any,
    shardSplitThreshold: js.Any,
    source: js.Any,
    timeout: js.Any
  ): Parents = {
    val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parents]
  }
  
  extension [Self <: Parents](x: Self) {
    
    inline def setCidVersion(value: js.Any): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: IpfsAny): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setDest(value: js.Any): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: js.Any): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setHashAlg(value: js.Any): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Any): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setShardSplitThreshold(value: js.Any): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
    
    inline def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
