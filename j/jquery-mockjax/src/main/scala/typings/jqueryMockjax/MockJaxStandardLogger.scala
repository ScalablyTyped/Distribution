package typings.jqueryMockjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockJaxStandardLogger extends StObject {
  
  var debug: js.UndefOr[MockJaxLoggingFunction] = js.native
  
  var error: js.UndefOr[MockJaxLoggingFunction] = js.native
  
  var info: js.UndefOr[MockJaxLoggingFunction] = js.native
  
  var log: js.UndefOr[MockJaxLoggingFunction] = js.native
  
  var warn: js.UndefOr[MockJaxLoggingFunction] = js.native
}
object MockJaxStandardLogger {
  
  @scala.inline
  def apply(): MockJaxStandardLogger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockJaxStandardLogger]
  }
  
  @scala.inline
  implicit class MockJaxStandardLoggerMutableBuilder[Self <: MockJaxStandardLogger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setError(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInfo(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setLog(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setWarn(value: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
