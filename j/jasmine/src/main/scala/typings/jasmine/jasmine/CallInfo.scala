package typings.jasmine.jasmine

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallInfo[Fn /* <: Func */] extends StObject {
  
  /** All arguments passed to the call */
  var args: Parameters[Fn]
  
  /** The context (the this) for the call */
  var `object`: js.Any
  
  /** The return value of the call */
  var returnValue: ReturnType[Fn]
}
object CallInfo {
  
  @scala.inline
  def apply[Fn /* <: Func */](args: Parameters[Fn], `object`: js.Any, returnValue: ReturnType[Fn]): CallInfo[Fn] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInfo[Fn]]
  }
  
  @scala.inline
  implicit class CallInfoMutableBuilder[Self <: CallInfo[?], Fn /* <: Func */] (val x: Self & CallInfo[Fn]) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Parameters[Fn]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: ReturnType[Fn]): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
