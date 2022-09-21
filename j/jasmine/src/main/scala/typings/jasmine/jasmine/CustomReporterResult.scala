package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated use SuiteResult or SpecResult instead */
trait CustomReporterResult
  extends StObject
     with SpecResult
object CustomReporterResult {
  
  inline def apply(
    deprecationWarnings: js.Array[DeprecatedExpectation],
    description: String,
    failedExpectations: js.Array[FailedExpectation],
    fullName: String,
    id: String,
    passedExpectations: js.Array[PassedExpectation],
    pendingReason: String,
    status: String
  ): CustomReporterResult = {
    val __obj = js.Dynamic.literal(deprecationWarnings = deprecationWarnings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], passedExpectations = passedExpectations.asInstanceOf[js.Any], pendingReason = pendingReason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], debugLogs = null, duration = null, properties = null)
    __obj.asInstanceOf[CustomReporterResult]
  }
}
