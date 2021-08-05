package typings.jestCucumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportingMod {
  
  @JSImport("jest-cucumber/dist/src/reporting", "Reporter")
  @js.native
  class Reporter protected () extends StObject {
    def this(globalConfig: js.Any, options: js.Any) = this()
    
    def onRunComplete(contexts: js.Any, results: js.Any): Unit = js.native
    
    def onTestResult(test: js.Any, results: js.Any): js.Promise[
        js.Tuple10[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any]
      ] = js.native
    
    /* private */ var reportEventGenerator: js.Any = js.native
  }
}
