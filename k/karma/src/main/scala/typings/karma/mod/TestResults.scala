package typings.karma.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResults extends StObject {
  
  var disconnected: Boolean
  
  var error: Boolean
  
  var exitCode: Double
  
  var failed: Double
  
  var success: Double
}
object TestResults {
  
  inline def apply(disconnected: Boolean, error: Boolean, exitCode: Double, failed: Double, success: Double): TestResults = {
    val __obj = js.Dynamic.literal(disconnected = disconnected.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResults]
  }
  
  extension [Self <: TestResults](x: Self) {
    
    inline def setDisconnected(value: Boolean): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
