package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CtxAny extends StObject {
  
  var ctx: js.Any
}
object CtxAny {
  
  inline def apply(ctx: js.Any): CtxAny = {
    val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CtxAny]
  }
  
  extension [Self <: CtxAny](x: Self) {
    
    inline def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
  }
}
