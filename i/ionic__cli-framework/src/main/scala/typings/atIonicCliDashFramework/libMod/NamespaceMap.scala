package typings.atIonicCliDashFramework.libMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.NamespaceMapGetter
import typings.atIonicUtilsDashObject.atIonicUtilsDashObjectMod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "NamespaceMap")
@js.native
class NamespaceMap ()
  extends AliasedMap[
      String, 
      NamespaceMapGetter[
        typings.atIonicCliDashFramework.libCommandMod.Command, 
        typings.atIonicCliDashFramework.libCommandMod.Namespace, 
        CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
        CommandMetadataInput, 
        CommandMetadataOption
      ]
    ]

