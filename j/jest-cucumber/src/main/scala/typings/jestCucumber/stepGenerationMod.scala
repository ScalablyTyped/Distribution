package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepGenerationMod {
  
  @JSImport("jest-cucumber/dist/src/code-generation/step-generation", "generateStepCode")
  @js.native
  def generateStepCode(steps: js.Array[ParsedStep], stepPosition: Double): String = js.native
  @JSImport("jest-cucumber/dist/src/code-generation/step-generation", "generateStepCode")
  @js.native
  def generateStepCode(steps: js.Array[ParsedStep], stepPosition: Double, generateWrapperFunction: Boolean): String = js.native
  
  @JSImport("jest-cucumber/dist/src/code-generation/step-generation", "generateStepFunctionCall")
  @js.native
  def generateStepFunctionCall(steps: js.Array[ParsedStep], stepPosition: Double): String = js.native
  
  @JSImport("jest-cucumber/dist/src/code-generation/step-generation", "getStepKeyword")
  @js.native
  def getStepKeyword(steps: js.Array[ParsedStep], stepPosition: Double): String = js.native
}
