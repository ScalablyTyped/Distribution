package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseParams extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
}
object BaseParams {
  
  @scala.inline
  def apply(): BaseParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseParams]
  }
  
  @scala.inline
  implicit class BaseParamsMutableBuilder[Self <: BaseParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
