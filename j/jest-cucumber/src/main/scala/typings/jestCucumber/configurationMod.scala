package typings.jestCucumber

import typings.jestCucumber.anon.Errors
import typings.jestCucumber.modelsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-cucumber/dist/src/configuration", JSImport.Namespace)
@js.native
object configurationMod extends js.Object {
  
  def getJestCucumberConfiguration(): Errors = js.native
  def getJestCucumberConfiguration(options: Options): Errors = js.native
  
  def setJestCucumberConfiguration(options: Options): Unit = js.native
}
