package typings.jestTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hook extends StObject {
  
  var asyncError: js.Error
  
  var fn: HookFn2
  
  var parent: DescribeBlock
  
  var seenDone: Boolean
  
  var timeout: js.UndefOr[Double | Null] = js.undefined
  
  var `type`: HookType
}
object Hook {
  
  inline def apply(asyncError: js.Error, fn: HookFn2, parent: DescribeBlock, seenDone: Boolean, `type`: HookType): Hook = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], seenDone = seenDone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hook] (val x: Self) extends AnyVal {
    
    inline def setAsyncError(value: js.Error): Self = StObject.set(x, "asyncError", value.asInstanceOf[js.Any])
    
    inline def setFn(value: HookFn2): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescribeBlock): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSeenDone(value: Boolean): Self = StObject.set(x, "seenDone", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setType(value: HookType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
