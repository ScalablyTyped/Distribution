package typings.jestCucumber.scenarioResultTrackerMod

import typings.jestCucumber.modelsMod.ParsedFeature
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/reporting/scenario-result-tracking/ScenarioResultTracker", "ScenarioResultTracker")
@js.native
class ScenarioResultTracker protected () extends js.Object {
  def this(feature: ParsedFeature, scenarioTitle: String, lineNumber: Double) = this()
  
  def endScenario(): js.Promise[_] = js.native
  
  def endStep(): Unit = js.native
  
  var scenarioResult: js.Any = js.native
  
  def startStep(stepText: String, stepArguments: js.Array[String], lineNumber: Double): Unit = js.native
  
  def stepError(error: Error): Unit = js.native
}
