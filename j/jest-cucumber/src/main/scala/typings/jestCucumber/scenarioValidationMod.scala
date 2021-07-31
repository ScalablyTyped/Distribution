package typings.jestCucumber

import typings.jestCucumber.modelsMod.FeatureFromStepDefinitions
import typings.jestCucumber.modelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scenarioValidationMod {
  
  @JSImport("jest-cucumber/dist/src/validation/scenario-validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkThatFeatureFileAndStepDefinitionsHaveSameScenarios(parsedFeature: ParsedFeature, featureFromStepDefinitions: FeatureFromStepDefinitions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkThatFeatureFileAndStepDefinitionsHaveSameScenarios")(parsedFeature.asInstanceOf[js.Any], featureFromStepDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
