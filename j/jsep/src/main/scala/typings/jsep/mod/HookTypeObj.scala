package typings.jsep.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{[ key in jsep.jsep.HookType ]: jsep.jsep.HookCallback}> */
trait HookTypeObj extends StObject {
  
  var `after-expression`: js.UndefOr[HookCallback] = js.undefined
  
  var `after-token`: js.UndefOr[HookCallback] = js.undefined
  
  var `gobble-expression`: js.UndefOr[HookCallback] = js.undefined
  
  var `gobble-spaces`: js.UndefOr[HookCallback] = js.undefined
  
  var `gobble-token`: js.UndefOr[HookCallback] = js.undefined
}
object HookTypeObj {
  
  inline def apply(): HookTypeObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HookTypeObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HookTypeObj] (val x: Self) extends AnyVal {
    
    inline def `setAfter-expression`(value: HookCallback): Self = StObject.set(x, "after-expression", value.asInstanceOf[js.Any])
    
    inline def `setAfter-expressionUndefined`: Self = StObject.set(x, "after-expression", js.undefined)
    
    inline def `setAfter-token`(value: HookCallback): Self = StObject.set(x, "after-token", value.asInstanceOf[js.Any])
    
    inline def `setAfter-tokenUndefined`: Self = StObject.set(x, "after-token", js.undefined)
    
    inline def `setGobble-expression`(value: HookCallback): Self = StObject.set(x, "gobble-expression", value.asInstanceOf[js.Any])
    
    inline def `setGobble-expressionUndefined`: Self = StObject.set(x, "gobble-expression", js.undefined)
    
    inline def `setGobble-spaces`(value: HookCallback): Self = StObject.set(x, "gobble-spaces", value.asInstanceOf[js.Any])
    
    inline def `setGobble-spacesUndefined`: Self = StObject.set(x, "gobble-spaces", js.undefined)
    
    inline def `setGobble-token`(value: HookCallback): Self = StObject.set(x, "gobble-token", value.asInstanceOf[js.Any])
    
    inline def `setGobble-tokenUndefined`: Self = StObject.set(x, "gobble-token", js.undefined)
  }
}
