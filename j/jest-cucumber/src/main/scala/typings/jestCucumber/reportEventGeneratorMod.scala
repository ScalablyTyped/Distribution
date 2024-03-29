package typings.jestCucumber

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reportEventGeneratorMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/report-event-generation/ReportEventGenerator", "ReportEventGenerator")
  @js.native
  class ReportEventGenerator () extends StObject {
    
    /* private */ var calculateTotalDuration: js.Any = js.native
    
    var eventBroadcaster: EventEmitter = js.native
    
    var eventDataCollector: js.Any = js.native
    
    /* private */ var featureFileEventGenerator: js.Any = js.native
    
    def onScenarioComplete(jestTestResult: js.Any): js.Promise[
        js.Tuple10[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any]
      ] = js.native
    
    def onTestRunComplete(jestTestResult: js.Any): Unit = js.native
    
    /* private */ var testCaseEventGenerator: js.Any = js.native
  }
}
