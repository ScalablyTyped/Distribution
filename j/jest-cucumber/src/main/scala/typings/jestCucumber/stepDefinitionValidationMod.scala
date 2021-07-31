package typings.jestCucumber

import typings.jestCucumber.modelsMod.Options
import typings.jestCucumber.modelsMod.ParsedScenario
import typings.jestCucumber.modelsMod.ParsedScenarioOutline
import typings.jestCucumber.modelsMod.ScenarioFromStepDefinitions
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepDefinitionValidationMod {
  
  @JSImport("jest-cucumber/dist/src/validation/step-definition-validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps(
    options: Options,
    parsedScenario: ParsedScenarioOutline,
    scenarioFromStepDefinitions: ScenarioFromStepDefinitions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps")(options.asInstanceOf[js.Any], parsedScenario.asInstanceOf[js.Any], scenarioFromStepDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps(
    options: Options,
    parsedScenario: ParsedScenario,
    scenarioFromStepDefinitions: ScenarioFromStepDefinitions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps")(options.asInstanceOf[js.Any], parsedScenario.asInstanceOf[js.Any], scenarioFromStepDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def matchSteps(stepFromFeatureFile: String, stepMatcher: String): Boolean | RegExpMatchArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSteps")(stepFromFeatureFile.asInstanceOf[js.Any], stepMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean | RegExpMatchArray | Null]
  @scala.inline
  def matchSteps(stepFromFeatureFile: String, stepMatcher: RegExp): Boolean | RegExpMatchArray | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSteps")(stepFromFeatureFile.asInstanceOf[js.Any], stepMatcher.asInstanceOf[js.Any])).asInstanceOf[Boolean | RegExpMatchArray | Null]
}
