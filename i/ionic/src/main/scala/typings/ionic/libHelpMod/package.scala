package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libHelpMod {
  import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
  import typings.ionic.definitionsMod.CommandMetadata
  import typings.ionic.definitionsMod.CommandMetadataOption
  import typings.ionic.definitionsMod.ICommand
  import typings.ionic.definitionsMod.INamespace

  type CommandHelpFormatterDeps = typings.atIonicCliDashFramework.libHelpMod.CommandHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
}
