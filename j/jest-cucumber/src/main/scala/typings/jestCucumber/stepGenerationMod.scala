package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedStep
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/code-generation/step-generation", JSImport.Namespace)
@js.native
object stepGenerationMod extends js.Object {
  
  def generateStepCode(steps: js.Array[ParsedStep], stepPosition: Double): String = js.native
  def generateStepCode(steps: js.Array[ParsedStep], stepPosition: Double, generateWrapperFunction: Boolean): String = js.native
  
  def generateStepFunctionCall(steps: js.Array[ParsedStep], stepPosition: Double): String = js.native
  
  def getStepKeyword(steps: js.Array[ParsedStep], stepPosition: Double): String = js.native
}
