package typings.ionic

import typings.atIonicCliDashFramework.atIonicCliDashFrameworkMod.BaseNamespace
import typings.atIonicCliDashFramework.definitionsMod.CommandMapGetter
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.NamespaceMapGetter
import typings.atIonicUtilsDashObject.atIonicUtilsDashObjectMod.AliasedMap
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/namespace", JSImport.Namespace)
@js.native
object libNamespaceMod extends js.Object {
  @js.native
  class CommandMap () extends AliasedMap[
          String, 
          CommandMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.atIonicCliDashFramework.definitionsMod.INamespace because Already inherited
  - typings.ionic.definitionsMod.INamespace because var conflicts: parent, root. Inlined env, project */ @js.native
  abstract class Namespace () extends BaseNamespace[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(parent: INamespace) = this()
    val env: IonicEnvironment = js.native
    val project: js.UndefOr[IProject] = js.native
  }
  
  @js.native
  class NamespaceMap () extends AliasedMap[
          String, 
          NamespaceMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
}

