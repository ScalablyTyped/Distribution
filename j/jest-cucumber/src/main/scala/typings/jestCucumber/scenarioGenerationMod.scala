package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedScenario
import typings.jestCucumber.modelsMod.ParsedScenarioOutline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scenarioGenerationMod {
  
  @JSImport("jest-cucumber/dist/src/code-generation/scenario-generation", "generateScenarioCode")
  @js.native
  def generateScenarioCode(scenario: ParsedScenario): String = js.native
  @JSImport("jest-cucumber/dist/src/code-generation/scenario-generation", "generateScenarioCode")
  @js.native
  def generateScenarioCode(scenario: ParsedScenarioOutline): String = js.native
  
  @JSImport("jest-cucumber/dist/src/code-generation/scenario-generation", "generateScenarioCodeWithSeparateStepFunctions")
  @js.native
  def generateScenarioCodeWithSeparateStepFunctions(scenario: ParsedScenario): String = js.native
  @JSImport("jest-cucumber/dist/src/code-generation/scenario-generation", "generateScenarioCodeWithSeparateStepFunctions")
  @js.native
  def generateScenarioCodeWithSeparateStepFunctions(scenario: ParsedScenarioOutline): String = js.native
}
