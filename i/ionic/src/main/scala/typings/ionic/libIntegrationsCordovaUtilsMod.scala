package typings.ionic

import typings.atIonicCliDashFramework.definitionsMod.CommandLineInputs
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.ionic.definitionsMod.CommandMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/utils", JSImport.Namespace)
@js.native
object libIntegrationsCordovaUtilsMod extends js.Object {
  def filterArgumentsForCordova(metadata: CommandMetadata, options: CommandLineOptions): js.Array[String] = js.native
  def generateOptionsForCordovaBuild(metadata: CommandMetadata, inputs: CommandLineInputs, options: CommandLineOptions): CommandLineOptions = js.native
}

