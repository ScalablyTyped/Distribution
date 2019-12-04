package typings.ionic.libHelpMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.NamespaceLocateResult
import typings.atIonicCliDashFramework.libColorsMod.Colors
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamespaceHelpFormatterDeps
  extends typings.atIonicCliDashFramework.libHelpMod.NamespaceHelpFormatterDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  val inProject: Boolean
  val version: String
}

object NamespaceHelpFormatterDeps {
  @scala.inline
  def apply(
    inProject: Boolean,
    location: NamespaceLocateResult[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption],
    namespace: INamespace,
    version: String,
    colors: Colors = null
  ): NamespaceHelpFormatterDeps = {
    val __obj = js.Dynamic.literal(inProject = inProject.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceHelpFormatterDeps]
  }
}

