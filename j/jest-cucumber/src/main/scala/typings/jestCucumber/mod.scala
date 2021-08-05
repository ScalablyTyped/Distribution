package typings.jestCucumber

import typings.jestCucumber.featureDefinitionCreationMod.ScenariosDefinitionCallbackFunction
import typings.jestCucumber.featureDefinitionCreationMod.StepsDefinitionCallbackFunction
import typings.jestCucumber.modelsMod.Options
import typings.jestCucumber.modelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-cucumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoBindSteps(features: js.Array[ParsedFeature], stepDefinitions: js.Array[StepsDefinitionCallbackFunction]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoBindSteps")(features.asInstanceOf[js.Any], stepDefinitions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def defineFeature(featureFromFile: ParsedFeature, scenariosDefinitionCallback: ScenariosDefinitionCallbackFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineFeature")(featureFromFile.asInstanceOf[js.Any], scenariosDefinitionCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generateCodeFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFromFeature")(feature.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def generateCodeWithSeparateFunctionsFromFeature(feature: ParsedFeature, lineNumber: Double): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeWithSeparateFunctionsFromFeature")(feature.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def loadFeature(featureFilePath: String): ParsedFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFeature")(featureFilePath.asInstanceOf[js.Any]).asInstanceOf[ParsedFeature]
  inline def loadFeature(featureFilePath: String, options: Options): ParsedFeature = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFeature")(featureFilePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedFeature]
  
  inline def loadFeatures(globPattern: String): js.Array[ParsedFeature] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadFeatures")(globPattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedFeature]]
  inline def loadFeatures(globPattern: String, options: Options): js.Array[ParsedFeature] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadFeatures")(globPattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[ParsedFeature]]
  
  inline def parseFeature(featureText: String): ParsedFeature = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFeature")(featureText.asInstanceOf[js.Any]).asInstanceOf[ParsedFeature]
  inline def parseFeature(featureText: String, options: Options): ParsedFeature = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFeature")(featureText.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ParsedFeature]
  
  inline def setJestCucumberConfiguration(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setJestCucumberConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
