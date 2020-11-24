package typings.ionicCliFramework.mod

import typings.ionicCliFramework.colorsMod.ColorFunction
import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.loggerMod.LoggerLevelWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework", "getLoggerLevelColor")
@js.native
object getLoggerLevelColor extends js.Object {
  
  def apply(colors: Colors): js.UndefOr[ColorFunction] = js.native
  def apply(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
}
