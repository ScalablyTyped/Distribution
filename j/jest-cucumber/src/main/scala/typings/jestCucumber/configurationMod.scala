package typings.jestCucumber

import typings.jestCucumber.anon.Errors
import typings.jestCucumber.modelsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("jest-cucumber/dist/src/configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getJestCucumberConfiguration(): Errors = ^.asInstanceOf[js.Dynamic].applyDynamic("getJestCucumberConfiguration")().asInstanceOf[Errors]
  @scala.inline
  def getJestCucumberConfiguration(options: Options): Errors = ^.asInstanceOf[js.Dynamic].applyDynamic("getJestCucumberConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[Errors]
  
  @scala.inline
  def setJestCucumberConfiguration(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setJestCucumberConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
