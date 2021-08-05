package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multihash extends StObject {
  
  var ctx: Print
  
  var multihash: js.Any
  
  var timeout: js.Any
}
object Multihash {
  
  inline def apply(ctx: Print, multihash: js.Any, timeout: js.Any): Multihash = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], multihash = multihash.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multihash]
  }
  
  extension [Self <: Multihash](x: Self) {
    
    inline def setCtx(value: Print): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setMultihash(value: js.Any): Self = StObject.set(x, "multihash", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
