package typings.jestCucumber

import typings.jestCucumber.modelsMod.Options
import typings.jestCucumber.modelsMod.ParsedFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsedFeatureLoadingMod {
  
  @JSImport("jest-cucumber/dist/src/parsed-feature-loading", "loadFeature")
  @js.native
  def loadFeature(featureFilePath: String): ParsedFeature = js.native
  @JSImport("jest-cucumber/dist/src/parsed-feature-loading", "loadFeature")
  @js.native
  def loadFeature(featureFilePath: String, options: Options): ParsedFeature = js.native
  
  @JSImport("jest-cucumber/dist/src/parsed-feature-loading", "loadFeatures")
  @js.native
  def loadFeatures(globPattern: String): js.Array[ParsedFeature] = js.native
  @JSImport("jest-cucumber/dist/src/parsed-feature-loading", "loadFeatures")
  @js.native
  def loadFeatures(globPattern: String, options: Options): js.Array[ParsedFeature] = js.native
  
  @JSImport("jest-cucumber/dist/src/parsed-feature-loading", "parseFeature")
  @js.native
  def parseFeature(featureText: String): ParsedFeature = js.native
  @JSImport("jest-cucumber/dist/src/parsed-feature-loading", "parseFeature")
  @js.native
  def parseFeature(featureText: String, options: Options): ParsedFeature = js.native
}
