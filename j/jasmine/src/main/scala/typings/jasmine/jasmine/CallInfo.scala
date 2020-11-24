package typings.jasmine.jasmine

import typings.std.Parameters
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallInfo[Fn /* <: Func */] extends js.Object {
  
  /** All arguments passed to the call */
  var args: Parameters[Fn] = js.native
  
  /** The context (the this) for the call */
  var `object`: js.Any = js.native
  
  /** The return value of the call */
  var returnValue: ReturnType[Fn] = js.native
}
object CallInfo {
  
  @scala.inline
  def apply[Fn /* <: Func */](args: Parameters[Fn], `object`: js.Any, returnValue: ReturnType[Fn]): CallInfo[Fn] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallInfo[Fn]]
  }
  
  @scala.inline
  implicit class CallInfoOps[Self <: CallInfo[_], Fn /* <: Func */] (val x: Self with CallInfo[Fn]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgs(value: Parameters[Fn]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: ReturnType[Fn]): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
}
