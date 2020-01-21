package typings.ionicCliFramework.executorMod

import typings.ionicCliFramework.commandMod.Command
import typings.ionicCliFramework.commandMod.Namespace
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/executor", "Executor")
@js.native
class Executor () extends BaseExecutor[
      Command, 
      Namespace, 
      CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
      CommandMetadataInput, 
      CommandMetadataOption
    ]

