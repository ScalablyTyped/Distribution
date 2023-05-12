package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IErrorAction extends StObject {
  
  var action: NetworkErrorAction
  
  var flags: ErrorActionFlags
  
  var hdcpLevel: js.UndefOr[HdcpLevel] = js.undefined
  
  var nextAutoLevel: js.UndefOr[Double] = js.undefined
  
  var resolved: js.UndefOr[Boolean] = js.undefined
  
  var retryConfig: js.UndefOr[RetryConfig] = js.undefined
  
  var retryCount: js.UndefOr[Double] = js.undefined
}
object IErrorAction {
  
  inline def apply(action: NetworkErrorAction, flags: ErrorActionFlags): IErrorAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IErrorAction] (val x: Self) extends AnyVal {
    
    inline def setAction(value: NetworkErrorAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: ErrorActionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setHdcpLevel(value: HdcpLevel): Self = StObject.set(x, "hdcpLevel", value.asInstanceOf[js.Any])
    
    inline def setHdcpLevelNull: Self = StObject.set(x, "hdcpLevel", null)
    
    inline def setHdcpLevelUndefined: Self = StObject.set(x, "hdcpLevel", js.undefined)
    
    inline def setNextAutoLevel(value: Double): Self = StObject.set(x, "nextAutoLevel", value.asInstanceOf[js.Any])
    
    inline def setNextAutoLevelUndefined: Self = StObject.set(x, "nextAutoLevel", js.undefined)
    
    inline def setResolved(value: Boolean): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedUndefined: Self = StObject.set(x, "resolved", js.undefined)
    
    inline def setRetryConfig(value: RetryConfig): Self = StObject.set(x, "retryConfig", value.asInstanceOf[js.Any])
    
    inline def setRetryConfigUndefined: Self = StObject.set(x, "retryConfig", js.undefined)
    
    inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
    
    inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
  }
}
