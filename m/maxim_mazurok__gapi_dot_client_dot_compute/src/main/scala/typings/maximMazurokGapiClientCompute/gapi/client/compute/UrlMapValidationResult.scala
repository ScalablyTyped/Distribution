package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlMapValidationResult extends StObject {
  
  var loadErrors: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Whether the given UrlMap can be successfully loaded. If false, 'loadErrors' indicates the reasons. */
  var loadSucceeded: js.UndefOr[Boolean] = js.undefined
  
  var testFailures: js.UndefOr[js.Array[TestFailure]] = js.undefined
  
  /** If successfully loaded, this field indicates whether the test passed. If false, 'testFailures's indicate the reason of failure. */
  var testPassed: js.UndefOr[Boolean] = js.undefined
}
object UrlMapValidationResult {
  
  inline def apply(): UrlMapValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlMapValidationResult]
  }
  
  extension [Self <: UrlMapValidationResult](x: Self) {
    
    inline def setLoadErrors(value: js.Array[String]): Self = StObject.set(x, "loadErrors", value.asInstanceOf[js.Any])
    
    inline def setLoadErrorsUndefined: Self = StObject.set(x, "loadErrors", js.undefined)
    
    inline def setLoadErrorsVarargs(value: String*): Self = StObject.set(x, "loadErrors", js.Array(value*))
    
    inline def setLoadSucceeded(value: Boolean): Self = StObject.set(x, "loadSucceeded", value.asInstanceOf[js.Any])
    
    inline def setLoadSucceededUndefined: Self = StObject.set(x, "loadSucceeded", js.undefined)
    
    inline def setTestFailures(value: js.Array[TestFailure]): Self = StObject.set(x, "testFailures", value.asInstanceOf[js.Any])
    
    inline def setTestFailuresUndefined: Self = StObject.set(x, "testFailures", js.undefined)
    
    inline def setTestFailuresVarargs(value: TestFailure*): Self = StObject.set(x, "testFailures", js.Array(value*))
    
    inline def setTestPassed(value: Boolean): Self = StObject.set(x, "testPassed", value.asInstanceOf[js.Any])
    
    inline def setTestPassedUndefined: Self = StObject.set(x, "testPassed", js.undefined)
  }
}
