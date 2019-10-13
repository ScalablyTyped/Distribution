package typings.atIonicCliDashFramework.libMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "Namespace")
@js.native
abstract class Namespace ()
  extends typings.atIonicCliDashFramework.libCommandMod.BaseNamespace[
      typings.atIonicCliDashFramework.libCommandMod.Command, 
      typings.atIonicCliDashFramework.libCommandMod.Namespace, 
      CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
      CommandMetadataInput, 
      CommandMetadataOption
    ]

