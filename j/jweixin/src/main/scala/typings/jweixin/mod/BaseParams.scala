package typings.jweixin.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseParams extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
}
object BaseParams {
  
  inline def apply(): BaseParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseParams] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* repeated */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* repeated */ Any => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: /* repeated */ Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
