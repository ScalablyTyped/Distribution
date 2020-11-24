package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedScenario
import typings.jestCucumber.modelsMod.ParsedScenarioOutline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/code-generation/scenario-generation", JSImport.Namespace)
@js.native
object scenarioGenerationMod extends js.Object {
  
  def generateScenarioCode(scenario: ParsedScenario): String = js.native
  def generateScenarioCode(scenario: ParsedScenarioOutline): String = js.native
  
  def generateScenarioCodeWithSeparateStepFunctions(scenario: ParsedScenario): String = js.native
  def generateScenarioCodeWithSeparateStepFunctions(scenario: ParsedScenarioOutline): String = js.native
}
