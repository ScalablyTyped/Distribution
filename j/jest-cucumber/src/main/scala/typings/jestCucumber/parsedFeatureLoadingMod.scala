package typings.jestCucumber

import typings.jestCucumber.modelsMod.Options
import typings.jestCucumber.modelsMod.ParsedFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/parsed-feature-loading", JSImport.Namespace)
@js.native
object parsedFeatureLoadingMod extends js.Object {
  
  def loadFeature(featureFilePath: String): ParsedFeature = js.native
  def loadFeature(featureFilePath: String, options: Options): ParsedFeature = js.native
  
  def loadFeatures(globPattern: String): js.Array[ParsedFeature] = js.native
  def loadFeatures(globPattern: String, options: Options): js.Array[ParsedFeature] = js.native
  
  def parseFeature(featureText: String): ParsedFeature = js.native
  def parseFeature(featureText: String, options: Options): ParsedFeature = js.native
}
