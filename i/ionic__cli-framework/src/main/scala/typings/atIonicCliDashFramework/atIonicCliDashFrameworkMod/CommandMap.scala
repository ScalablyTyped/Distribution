package typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMapGetter
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicUtilsDashObject.atIonicUtilsDashObjectMod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Map because Already inherited
- typings.atIonicCliDashFramework.definitionsMod.ICommandMap because Already inherited */ @JSImport("@ionic/cli-framework", "CommandMap")
@js.native
class CommandMap ()
  extends AliasedMap[
      String, 
      CommandMapGetter[
        typings.atIonicCliDashFramework.libCommandMod.Command, 
        typings.atIonicCliDashFramework.libCommandMod.Namespace, 
        CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
        CommandMetadataInput, 
        CommandMetadataOption
      ]
    ]

