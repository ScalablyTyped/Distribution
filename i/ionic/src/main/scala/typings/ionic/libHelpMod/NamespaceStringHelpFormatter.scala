package typings.ionic.libHelpMod

import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/help", "NamespaceStringHelpFormatter")
@js.native
class NamespaceStringHelpFormatter protected ()
  extends typings.ionicCliFramework.helpMod.NamespaceStringHelpFormatter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
  def this(hasVersionInProjectRest: NamespaceHelpFormatterDeps) = this()
  
  def formatIonicHeader(): js.Promise[String] = js.native
  
  val inProject: Boolean = js.native
  
  val version: String = js.native
}
