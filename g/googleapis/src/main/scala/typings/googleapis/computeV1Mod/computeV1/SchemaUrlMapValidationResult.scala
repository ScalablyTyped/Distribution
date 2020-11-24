package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing the validation result for a UrlMap.
  */
@js.native
trait SchemaUrlMapValidationResult extends js.Object {
  
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
  implicit class SchemaUrlMapValidationResultOps[Self <: SchemaUrlMapValidationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoadErrorsVarargs(value: String*): Self = this.set("loadErrors", js.Array(value :_*))
    
    @scala.inline
    def setLoadErrors(value: js.Array[String]): Self = this.set("loadErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadErrors: Self = this.set("loadErrors", js.undefined)
    
    @scala.inline
    def setLoadSucceeded(value: Boolean): Self = this.set("loadSucceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadSucceeded: Self = this.set("loadSucceeded", js.undefined)
    
    @scala.inline
    def setTestFailuresVarargs(value: SchemaTestFailure*): Self = this.set("testFailures", js.Array(value :_*))
    
    @scala.inline
    def setTestFailures(value: js.Array[SchemaTestFailure]): Self = this.set("testFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestFailures: Self = this.set("testFailures", js.undefined)
    
    @scala.inline
    def setTestPassed(value: Boolean): Self = this.set("testPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestPassed: Self = this.set("testPassed", js.undefined)
  }
}
