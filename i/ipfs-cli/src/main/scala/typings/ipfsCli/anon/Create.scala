package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Create extends StObject {
  
  var cidVersion: js.Any
  
  var create: js.Any
  
  var ctx: GetStdinIpfs
  
  var flush: js.Any
  
  var hashAlg: js.Any
  
  var length: js.Any
  
  var mode: js.Any
  
  var mtime: js.Any
  
  var mtimeNsecs: js.Any
  
  var offset: js.Any
  
  var parents: js.Any
  
  var path: js.Any
  
  var progress: js.Any
  
  var rawLeaves: js.Any
  
  var reduceSingleLeafToSelf: js.Any
  
  var shardSplitThreshold: js.Any
  
  var strategy: js.Any
  
  var timeout: js.Any
  
  var truncate: js.Any
}
object Create {
  
  inline def apply(
    cidVersion: js.Any,
    create: js.Any,
    ctx: GetStdinIpfs,
    flush: js.Any,
    hashAlg: js.Any,
    length: js.Any,
    mode: js.Any,
    mtime: js.Any,
    mtimeNsecs: js.Any,
    offset: js.Any,
    parents: js.Any,
    path: js.Any,
    progress: js.Any,
    rawLeaves: js.Any,
    reduceSingleLeafToSelf: js.Any,
    shardSplitThreshold: js.Any,
    strategy: js.Any,
    timeout: js.Any,
    truncate: js.Any
  ): Create = {
    val __obj = js.Dynamic.literal(cidVersion = cidVersion.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], flush = flush.asInstanceOf[js.Any], hashAlg = hashAlg.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeNsecs = mtimeNsecs.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], rawLeaves = rawLeaves.asInstanceOf[js.Any], reduceSingleLeafToSelf = reduceSingleLeafToSelf.asInstanceOf[js.Any], shardSplitThreshold = shardSplitThreshold.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], truncate = truncate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
  
  extension [Self <: Create](x: Self) {
    
    inline def setCidVersion(value: js.Any): Self = StObject.set(x, "cidVersion", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: js.Any): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCtx(value: GetStdinIpfs): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setFlush(value: js.Any): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setHashAlg(value: js.Any): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setLength(value: js.Any): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: js.Any): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeNsecs(value: js.Any): Self = StObject.set(x, "mtimeNsecs", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Any): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: js.Any): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setRawLeaves(value: js.Any): Self = StObject.set(x, "rawLeaves", value.asInstanceOf[js.Any])
    
    inline def setReduceSingleLeafToSelf(value: js.Any): Self = StObject.set(x, "reduceSingleLeafToSelf", value.asInstanceOf[js.Any])
    
    inline def setShardSplitThreshold(value: js.Any): Self = StObject.set(x, "shardSplitThreshold", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: js.Any): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTruncate(value: js.Any): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
  }
}
