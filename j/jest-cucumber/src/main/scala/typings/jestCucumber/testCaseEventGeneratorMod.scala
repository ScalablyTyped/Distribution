package typings.jestCucumber

import typings.jestCucumber.scenarioResultTrackerMod.IScenarioResult
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/reporting/report-event-generation/TestCaseEventGenerator", JSImport.Namespace)
@js.native
object testCaseEventGeneratorMod extends js.Object {
  
  @js.native
  class TestCaseEventGenerator protected () extends js.Object {
    def this(eventBroadcaster: EventEmitter, eventDataCollector: js.Any) = this()
    
    var eventBroadcaster: js.Any = js.native
    
    var eventDataCollector: js.Any = js.native
    
    def generateTestCaseFinishedEvent(scenarioResult: IScenarioResult, testResult: js.Any): Unit = js.native
    
    def generateTestCasePreparedEvent(scenarioResult: IScenarioResult): Unit = js.native
    
    def generateTestCaseStepEvents(scenarioResult: IScenarioResult): Unit = js.native
    
    var getTestCasePickle: js.Any = js.native
    
    var getTestCaseSourceLocation: js.Any = js.native
  }
}
