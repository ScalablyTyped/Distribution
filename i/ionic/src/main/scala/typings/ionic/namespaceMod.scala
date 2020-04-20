package typings.ionic

import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionicCliFramework.definitionsMod.CommandMapGetter
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.NamespaceMapGetter
import typings.ionicCliFramework.mod.BaseNamespace
import typings.ionicUtilsObject.mod.AliasedMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/namespace", JSImport.Namespace)
@js.native
object namespaceMod extends js.Object {
  @js.native
  class CommandMap () extends AliasedMap[
          String, 
          CommandMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.ionicCliFramework.definitionsMod.INamespace because Already inherited
  - typings.ionic.definitionsMod.INamespace because var conflicts: parent, root. Inlined env, project */ @js.native
  abstract class Namespace () extends BaseNamespace[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(parent: INamespace) = this()
    @JSName("env")
    var env_FNamespace: IonicEnvironment = js.native
    @JSName("project")
    var project_FNamespace: js.UndefOr[IProject] = js.native
    def env: IonicEnvironment = js.native
    def project: js.UndefOr[IProject] = js.native
  }
  
  @js.native
  class NamespaceMap () extends AliasedMap[
          String, 
          NamespaceMapGetter[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
        ]
  
}

