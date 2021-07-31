package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfigDataAccessOptions extends StObject {
  
  var logMode: js.UndefOr[String] = js.undefined
}
object LogConfigDataAccessOptions {
  
  @scala.inline
  def apply(): LogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigDataAccessOptions]
  }
  
  @scala.inline
  implicit class LogConfigDataAccessOptionsMutableBuilder[Self <: LogConfigDataAccessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogMode(value: String): Self = StObject.set(x, "logMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogModeUndefined: Self = StObject.set(x, "logMode", js.undefined)
  }
}
