package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lifetime extends StObject {
  
  var ctx: Print
  
  var ipfsPath: js.Any
  
  var key: js.Any
  
  var lifetime: js.Any
  
  var resolve: js.Any
  
  var timeout: js.Any
  
  var ttl: js.Any
}
object Lifetime {
  
  inline def apply(
    ctx: Print,
    ipfsPath: js.Any,
    key: js.Any,
    lifetime: js.Any,
    resolve: js.Any,
    timeout: js.Any,
    ttl: js.Any
  ): Lifetime = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifetime]
  }
  
  extension [Self <: Lifetime](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setIpfsPath(value: js.Any): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
    
    inline def setKey(value: js.Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLifetime(value: js.Any): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: js.Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTtl(value: js.Any): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
  }
}
