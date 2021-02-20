package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomLoggerObject extends StObject {
  
  var debug: js.UndefOr[CustomLogger] = js.native
  
  var error: js.UndefOr[CustomLogger] = js.native
  
  var info: js.UndefOr[CustomLogger] = js.native
  
  var log: js.UndefOr[CustomLogger] = js.native
  
  var warn: js.UndefOr[CustomLogger] = js.native
}
object CustomLoggerObject {
  
  @scala.inline
  def apply(): CustomLoggerObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLoggerObject]
  }
  
  @scala.inline
  implicit class CustomLoggerObjectMutableBuilder[Self <: CustomLoggerObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebug(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInfo(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setWarn(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
