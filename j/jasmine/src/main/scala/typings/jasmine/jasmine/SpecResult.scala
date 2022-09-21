package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecResult
  extends StObject
     with SuiteResult {
  
  var debugLogs: js.Array[DebugLogEntry] | Null
  
  /**
    * The list of expectations that passed during execution of this spec.
    */
  var passedExpectations: js.Array[PassedExpectation]
  
  /**
    * If the spec is pending, this will be the reason.
    */
  var pendingReason: String
}
object SpecResult {
  
  inline def apply(
    deprecationWarnings: js.Array[DeprecatedExpectation],
    description: String,
    failedExpectations: js.Array[FailedExpectation],
    fullName: String,
    id: String,
    passedExpectations: js.Array[PassedExpectation],
    pendingReason: String,
    status: String
  ): SpecResult = {
    val __obj = js.Dynamic.literal(deprecationWarnings = deprecationWarnings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], passedExpectations = passedExpectations.asInstanceOf[js.Any], pendingReason = pendingReason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], debugLogs = null, duration = null, properties = null)
    __obj.asInstanceOf[SpecResult]
  }
  
  extension [Self <: SpecResult](x: Self) {
    
    inline def setDebugLogs(value: js.Array[DebugLogEntry]): Self = StObject.set(x, "debugLogs", value.asInstanceOf[js.Any])
    
    inline def setDebugLogsNull: Self = StObject.set(x, "debugLogs", null)
    
    inline def setDebugLogsVarargs(value: DebugLogEntry*): Self = StObject.set(x, "debugLogs", js.Array(value*))
    
    inline def setPassedExpectations(value: js.Array[PassedExpectation]): Self = StObject.set(x, "passedExpectations", value.asInstanceOf[js.Any])
    
    inline def setPassedExpectationsVarargs(value: PassedExpectation*): Self = StObject.set(x, "passedExpectations", js.Array(value*))
    
    inline def setPendingReason(value: String): Self = StObject.set(x, "pendingReason", value.asInstanceOf[js.Any])
  }
}
