package typings.jestCucumber

import typings.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction
import typings.jestCucumber.modelsMod.ParsedFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/automatic-step-binding", JSImport.Namespace)
@js.native
object automaticStepBindingMod extends js.Object {
  
  def autoBindSteps(features: js.Array[ParsedFeature], stepDefinitions: js.Array[StepsDefinitionCallbackFunction]): Unit = js.native
}
