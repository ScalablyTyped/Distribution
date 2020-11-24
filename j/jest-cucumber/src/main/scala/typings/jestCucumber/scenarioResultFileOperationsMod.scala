package typings.jestCucumber

import typings.jestCucumber.scenarioResultTrackerMod.IScenarioResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/reporting/scenario-result-tracking/ScenarioResultFileOperations", JSImport.Namespace)
@js.native
object scenarioResultFileOperationsMod extends js.Object {
  
  def loadScenarioResult(featureTitle: String, scenarioTitle: String): js.Promise[IScenarioResult] = js.native
  
  def saveScenarioResult(scenarioResult: IScenarioResult): js.Promise[_] = js.native
}
