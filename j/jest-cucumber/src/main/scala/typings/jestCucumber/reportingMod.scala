package typings.jestCucumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/reporting", JSImport.Namespace)
@js.native
object reportingMod extends js.Object {
  
  @js.native
  class Reporter protected () extends js.Object {
    def this(globalConfig: js.Any, options: js.Any) = this()
    
    def onRunComplete(contexts: js.Any, results: js.Any): Unit = js.native
    
    def onTestResult(test: js.Any, results: js.Any): js.Promise[js.Tuple10[_, _, _, _, _, _, _, _, _, _]] = js.native
    
    var reportEventGenerator: js.Any = js.native
  }
}
