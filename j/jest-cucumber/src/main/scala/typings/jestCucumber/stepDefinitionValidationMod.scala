package typings.jestCucumber

import typings.jestCucumber.modelsMod.Options
import typings.jestCucumber.modelsMod.ParsedScenario
import typings.jestCucumber.modelsMod.ParsedScenarioOutline
import typings.jestCucumber.modelsMod.ScenarioFromStepDefinitions
import typings.std.RegExp
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepDefinitionValidationMod {
  
  @JSImport("jest-cucumber/dist/src/validation/step-definition-validation", "ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps")
  @js.native
  def ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps(
    options: Options,
    parsedScenario: ParsedScenarioOutline,
    scenarioFromStepDefinitions: ScenarioFromStepDefinitions
  ): Unit = js.native
  @JSImport("jest-cucumber/dist/src/validation/step-definition-validation", "ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps")
  @js.native
  def ensureFeatureFileAndStepDefinitionScenarioHaveSameSteps(
    options: Options,
    parsedScenario: ParsedScenario,
    scenarioFromStepDefinitions: ScenarioFromStepDefinitions
  ): Unit = js.native
  
  @JSImport("jest-cucumber/dist/src/validation/step-definition-validation", "matchSteps")
  @js.native
  def matchSteps(stepFromFeatureFile: String, stepMatcher: String): Boolean | RegExpMatchArray | Null = js.native
  @JSImport("jest-cucumber/dist/src/validation/step-definition-validation", "matchSteps")
  @js.native
  def matchSteps(stepFromFeatureFile: String, stepMatcher: RegExp): Boolean | RegExpMatchArray | Null = js.native
}
