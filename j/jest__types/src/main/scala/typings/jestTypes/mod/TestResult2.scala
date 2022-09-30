package typings.jestTypes.mod

import typings.jestTypes.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestResult2 extends StObject {
  
  var duration: js.UndefOr[Double | Null] = js.undefined
  
  var errors: js.Array[FormattedError]
  
  var errorsDetailed: js.Array[MatcherResults | Any]
  
  var invocations: Double
  
  var location: js.UndefOr[Column | Null] = js.undefined
  
  var retryReasons: js.Array[FormattedError]
  
  var status: TestStatus
  
  var testPath: js.Array[TestName2 | BlockName2]
}
object TestResult2 {
  
  inline def apply(
    errors: js.Array[FormattedError],
    errorsDetailed: js.Array[MatcherResults | Any],
    invocations: Double,
    retryReasons: js.Array[FormattedError],
    status: TestStatus,
    testPath: js.Array[TestName2 | BlockName2]
  ): TestResult2 = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], errorsDetailed = errorsDetailed.asInstanceOf[js.Any], invocations = invocations.asInstanceOf[js.Any], retryReasons = retryReasons.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult2]
  }
  
  extension [Self <: TestResult2](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setErrors(value: js.Array[FormattedError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsDetailed(value: js.Array[MatcherResults | Any]): Self = StObject.set(x, "errorsDetailed", value.asInstanceOf[js.Any])
    
    inline def setErrorsDetailedVarargs(value: (MatcherResults | Any)*): Self = StObject.set(x, "errorsDetailed", js.Array(value*))
    
    inline def setErrorsVarargs(value: FormattedError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setInvocations(value: Double): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Column): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRetryReasons(value: js.Array[FormattedError]): Self = StObject.set(x, "retryReasons", value.asInstanceOf[js.Any])
    
    inline def setRetryReasonsVarargs(value: FormattedError*): Self = StObject.set(x, "retryReasons", js.Array(value*))
    
    inline def setStatus(value: TestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTestPath(value: js.Array[TestName2 | BlockName2]): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
    
    inline def setTestPathVarargs(value: (TestName2 | BlockName2)*): Self = StObject.set(x, "testPath", js.Array(value*))
  }
}
