package typings.jestCucumber

import typings.jestCucumber.scenarioResultTrackerMod.IScenarioResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scenarioResultFileOperationsMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/scenario-result-tracking/ScenarioResultFileOperations", "loadScenarioResult")
  @js.native
  def loadScenarioResult(featureTitle: String, scenarioTitle: String): js.Promise[IScenarioResult] = js.native
  
  @JSImport("jest-cucumber/dist/src/reporting/scenario-result-tracking/ScenarioResultFileOperations", "saveScenarioResult")
  @js.native
  def saveScenarioResult(scenarioResult: IScenarioResult): js.Promise[_] = js.native
}
