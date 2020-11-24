package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunResult extends js.Object {
  
  var testResults: TestResults = js.native
  
  var unhandledErrors: js.Array[FormattedError] = js.native
}
object RunResult {
  
  @scala.inline
  def apply(testResults: TestResults, unhandledErrors: js.Array[FormattedError]): RunResult = {
    val __obj = js.Dynamic.literal(testResults = testResults.asInstanceOf[js.Any], unhandledErrors = unhandledErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunResult]
  }
  
  @scala.inline
  implicit class RunResultOps[Self <: RunResult] (val x: Self) extends AnyVal {
    
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
    def setTestResultsVarargs(value: TestResult*): Self = this.set("testResults", js.Array(value :_*))
    
    @scala.inline
    def setTestResults(value: TestResults): Self = this.set("testResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhandledErrorsVarargs(value: FormattedError*): Self = this.set("unhandledErrors", js.Array(value :_*))
    
    @scala.inline
    def setUnhandledErrors(value: js.Array[FormattedError]): Self = this.set("unhandledErrors", value.asInstanceOf[js.Any])
  }
}
