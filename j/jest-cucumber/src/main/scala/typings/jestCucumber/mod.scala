package typings.jestCucumber

import typings.jestCucumber.featureDefinitionCreationMod.ScenariosDefinitionCallbackFunction
import typings.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction
import typings.jestCucumber.modelsMod.Options
import typings.jestCucumber.modelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-cucumber", "autoBindSteps")
  @js.native
  def autoBindSteps(features: js.Array[ParsedFeature], stepDefinitions: js.Array[StepsDefinitionCallbackFunction]): Unit = js.native
  
  @JSImport("jest-cucumber", "defineFeature")
  @js.native
  def defineFeature(featureFromFile: ParsedFeature, scenariosDefinitionCallback: ScenariosDefinitionCallbackFunction): Unit = js.native
  
  @JSImport("jest-cucumber", "generateCodeFromFeature")
  @js.native
  def generateCodeFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = js.native
  
  @JSImport("jest-cucumber", "generateCodeWithSeparateFunctionsFromFeature")
  @js.native
  def generateCodeWithSeparateFunctionsFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = js.native
  
  @JSImport("jest-cucumber", "loadFeature")
  @js.native
  def loadFeature(featureFilePath: String): ParsedFeature = js.native
  @JSImport("jest-cucumber", "loadFeature")
  @js.native
  def loadFeature(featureFilePath: String, options: Options): ParsedFeature = js.native
  
  @JSImport("jest-cucumber", "loadFeatures")
  @js.native
  def loadFeatures(globPattern: String): js.Array[ParsedFeature] = js.native
  @JSImport("jest-cucumber", "loadFeatures")
  @js.native
  def loadFeatures(globPattern: String, options: Options): js.Array[ParsedFeature] = js.native
  
  @JSImport("jest-cucumber", "parseFeature")
  @js.native
  def parseFeature(featureText: String): ParsedFeature = js.native
  @JSImport("jest-cucumber", "parseFeature")
  @js.native
  def parseFeature(featureText: String, options: Options): ParsedFeature = js.native
  
  @JSImport("jest-cucumber", "setJestCucumberConfiguration")
  @js.native
  def setJestCucumberConfiguration(options: Options): Unit = js.native
}
