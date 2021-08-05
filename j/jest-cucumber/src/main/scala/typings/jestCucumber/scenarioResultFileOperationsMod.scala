package typings.jestCucumber

import typings.jestCucumber.scenarioResultTrackerMod.IScenarioResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scenarioResultFileOperationsMod {
  
  @JSImport("jest-cucumber/dist/src/reporting/scenario-result-tracking/ScenarioResultFileOperations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadScenarioResult(featureTitle: String, scenarioTitle: String): js.Promise[IScenarioResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadScenarioResult")(featureTitle.asInstanceOf[js.Any], scenarioTitle.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IScenarioResult]]
  
  inline def saveScenarioResult(scenarioResult: IScenarioResult): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("saveScenarioResult")(scenarioResult.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
