package typings.ionic.libHelpMod

import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/help", "NamespaceStringHelpFormatter")
@js.native
class NamespaceStringHelpFormatter protected ()
  extends typings.atIonicCliDashFramework.libHelpMod.NamespaceStringHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  def this(hasVersionInProjectRest: NamespaceHelpFormatterDeps) = this()
  val inProject: Boolean = js.native
  val version: String = js.native
  def formatIonicHeader(): js.Promise[String] = js.native
}

