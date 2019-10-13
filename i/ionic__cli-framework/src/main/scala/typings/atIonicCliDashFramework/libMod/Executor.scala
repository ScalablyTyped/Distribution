package typings.atIonicCliDashFramework.libMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "Executor")
@js.native
class Executor ()
  extends typings.atIonicCliDashFramework.libExecutorMod.BaseExecutor[
      typings.atIonicCliDashFramework.libCommandMod.Command, 
      typings.atIonicCliDashFramework.libCommandMod.Namespace, 
      CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
      CommandMetadataInput, 
      CommandMetadataOption
    ]

