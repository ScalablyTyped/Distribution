package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfigDataAccessOptions extends StObject {
  
  /** This is deprecated and has no effect. Do not use. */
  var logMode: js.UndefOr[String] = js.undefined
}
object LogConfigDataAccessOptions {
  
  inline def apply(): LogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigDataAccessOptions]
  }
  
  extension [Self <: LogConfigDataAccessOptions](x: Self) {
    
    inline def setLogMode(value: String): Self = StObject.set(x, "logMode", value.asInstanceOf[js.Any])
    
    inline def setLogModeUndefined: Self = StObject.set(x, "logMode", js.undefined)
  }
}
