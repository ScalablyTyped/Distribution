package typings.atIonicCliDashFramework.libMod

import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.libOptionsMod.OptionPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "filterCommandLineOptions")
@js.native
object filterCommandLineOptions extends js.Object {
  def apply[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = js.native
  def apply[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = js.native
}

