package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLoggerObject extends StObject {
  
  var debug: js.UndefOr[CustomLogger] = js.undefined
  
  var error: js.UndefOr[CustomLogger] = js.undefined
  
  var info: js.UndefOr[CustomLogger] = js.undefined
  
  var log: js.UndefOr[CustomLogger] = js.undefined
  
  var warn: js.UndefOr[CustomLogger] = js.undefined
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
    def setDebug(value: CustomLogger): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setError(value: CustomLogger): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setInfo(value: CustomLogger): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setLog(value: CustomLogger): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setWarn(value: CustomLogger): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
  }
}
