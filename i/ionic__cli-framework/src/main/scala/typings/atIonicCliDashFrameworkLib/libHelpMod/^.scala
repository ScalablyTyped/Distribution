package typings
package atIonicCliDashFrameworkLib.libHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/help", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createCommandMetadataFromSchema(schema: CommandHelpSchema): stdLib.Required[
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption
    ]
  ] = js.native
  def isCommandVisible[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](cmd: atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadata[C, N, M, I, O]): js.Promise[scala.Boolean] = js.native
  def isOptionVisible[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](opt: O): js.Promise[scala.Boolean] = js.native
}

