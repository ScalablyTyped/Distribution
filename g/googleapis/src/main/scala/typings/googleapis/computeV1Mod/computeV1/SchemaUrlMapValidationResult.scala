package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing the validation result for a UrlMap.
  */
@js.native
trait SchemaUrlMapValidationResult extends StObject {
  
  var loadErrors: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Whether the given UrlMap can be successfully loaded. If false,
    * &#39;loadErrors&#39; indicates the reasons.
    */
  var loadSucceeded: js.UndefOr[Boolean] = js.native
  
  var testFailures: js.UndefOr[js.Array[SchemaTestFailure]] = js.native
  
  /**
    * If successfully loaded, this field indicates whether the test passed. If
    * false, &#39;testFailures&#39;s indicate the reason of failure.
    */
  var testPassed: js.UndefOr[Boolean] = js.native
}
object SchemaUrlMapValidationResult {
  
  @scala.inline
  def apply(): SchemaUrlMapValidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlMapValidationResult]
  }
  
  @scala.inline
  implicit class SchemaUrlMapValidationResultMutableBuilder[Self <: SchemaUrlMapValidationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadErrors(value: js.Array[String]): Self = StObject.set(x, "loadErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadErrorsUndefined: Self = StObject.set(x, "loadErrors", js.undefined)
    
    @scala.inline
    def setLoadErrorsVarargs(value: String*): Self = StObject.set(x, "loadErrors", js.Array(value :_*))
    
    @scala.inline
    def setLoadSucceeded(value: Boolean): Self = StObject.set(x, "loadSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadSucceededUndefined: Self = StObject.set(x, "loadSucceeded", js.undefined)
    
    @scala.inline
    def setTestFailures(value: js.Array[SchemaTestFailure]): Self = StObject.set(x, "testFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestFailuresUndefined: Self = StObject.set(x, "testFailures", js.undefined)
    
    @scala.inline
    def setTestFailuresVarargs(value: SchemaTestFailure*): Self = StObject.set(x, "testFailures", js.Array(value :_*))
    
    @scala.inline
    def setTestPassed(value: Boolean): Self = StObject.set(x, "testPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestPassedUndefined: Self = StObject.set(x, "testPassed", js.undefined)
  }
}
