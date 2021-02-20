package typings.jestCucumber

import typings.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction
import typings.jestCucumber.modelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automaticStepBindingMod {
  
  @JSImport("jest-cucumber/dist/src/automatic-step-binding", "autoBindSteps")
  @js.native
  def autoBindSteps(features: js.Array[ParsedFeature], stepDefinitions: js.Array[StepsDefinitionCallbackFunction]): Unit = js.native
}
