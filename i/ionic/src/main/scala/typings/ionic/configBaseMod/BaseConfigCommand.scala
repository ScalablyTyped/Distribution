package typings.ionic.configBaseMod

import typings.ionic.commandMod.Command
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/commands/config/base", "BaseConfigCommand")
@js.native
abstract class BaseConfigCommand () extends Command {
  
  def generateContext(inputs: CommandLineInputs, options: CommandLineOptions): ConfigContext = js.native
  
  def interpretValue(): js.Any = js.native
  def interpretValue(v: js.UndefOr[scala.Nothing], expectJson: Boolean): js.Any = js.native
  def interpretValue(v: String): js.Any = js.native
  def interpretValue(v: String, expectJson: Boolean): js.Any = js.native
  
  def jsonStringify(v: js.Any): String = js.native
}
