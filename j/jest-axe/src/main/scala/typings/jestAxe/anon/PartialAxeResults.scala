package typings.jestAxe.anon

import typings.axeCore.mod.Result
import typings.axeCore.mod.RunOptions
import typings.axeCore.mod.TestEngine
import typings.axeCore.mod.TestEnvironment
import typings.axeCore.mod.TestRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<axe-core.axe-core.AxeResults> */
@js.native
trait PartialAxeResults extends js.Object {
  
  var inapplicable: js.UndefOr[js.Array[Result]] = js.native
  
  var incomplete: js.UndefOr[js.Array[Result]] = js.native
  
  var passes: js.UndefOr[js.Array[Result]] = js.native
  
  var testEngine: js.UndefOr[TestEngine] = js.native
  
  var testEnvironment: js.UndefOr[TestEnvironment] = js.native
  
  var testRunner: js.UndefOr[TestRunner] = js.native
  
  var timestamp: js.UndefOr[String] = js.native
  
  var toolOptions: js.UndefOr[RunOptions] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  var violations: js.UndefOr[js.Array[Result]] = js.native
}
object PartialAxeResults {
  
  @scala.inline
  def apply(): PartialAxeResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAxeResults]
  }
  
  @scala.inline
  implicit class PartialAxeResultsOps[Self <: PartialAxeResults] (val x: Self) extends AnyVal {
    
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
    def setInapplicableVarargs(value: Result*): Self = this.set("inapplicable", js.Array(value :_*))
    
    @scala.inline
    def setInapplicable(value: js.Array[Result]): Self = this.set("inapplicable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInapplicable: Self = this.set("inapplicable", js.undefined)
    
    @scala.inline
    def setIncompleteVarargs(value: Result*): Self = this.set("incomplete", js.Array(value :_*))
    
    @scala.inline
    def setIncomplete(value: js.Array[Result]): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncomplete: Self = this.set("incomplete", js.undefined)
    
    @scala.inline
    def setPassesVarargs(value: Result*): Self = this.set("passes", js.Array(value :_*))
    
    @scala.inline
    def setPasses(value: js.Array[Result]): Self = this.set("passes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasses: Self = this.set("passes", js.undefined)
    
    @scala.inline
    def setTestEngine(value: TestEngine): Self = this.set("testEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestEngine: Self = this.set("testEngine", js.undefined)
    
    @scala.inline
    def setTestEnvironment(value: TestEnvironment): Self = this.set("testEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestEnvironment: Self = this.set("testEnvironment", js.undefined)
    
    @scala.inline
    def setTestRunner(value: TestRunner): Self = this.set("testRunner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestRunner: Self = this.set("testRunner", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setToolOptions(value: RunOptions): Self = this.set("toolOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolOptions: Self = this.set("toolOptions", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setViolationsVarargs(value: Result*): Self = this.set("violations", js.Array(value :_*))
    
    @scala.inline
    def setViolations(value: js.Array[Result]): Self = this.set("violations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViolations: Self = this.set("violations", js.undefined)
  }
}
