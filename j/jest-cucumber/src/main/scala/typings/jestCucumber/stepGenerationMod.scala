package typings.jestCucumber

import typings.jestCucumber.modelsMod.ParsedStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepGenerationMod {
  
  @JSImport("jest-cucumber/dist/src/code-generation/step-generation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateStepCode(steps: js.Array[ParsedStep], stepPosition: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateStepCode")(steps.asInstanceOf[js.Any], stepPosition.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateStepCode(steps: js.Array[ParsedStep], stepPosition: Double, generateWrapperFunction: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateStepCode")(steps.asInstanceOf[js.Any], stepPosition.asInstanceOf[js.Any], generateWrapperFunction.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateStepFunctionCall(steps: js.Array[ParsedStep], stepPosition: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateStepFunctionCall")(steps.asInstanceOf[js.Any], stepPosition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getStepKeyword(steps: js.Array[ParsedStep], stepPosition: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getStepKeyword")(steps.asInstanceOf[js.Any], stepPosition.asInstanceOf[js.Any])).asInstanceOf[String]
}
