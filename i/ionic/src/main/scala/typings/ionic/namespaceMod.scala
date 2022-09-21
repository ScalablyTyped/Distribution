package typings.ionic

import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.mod.BaseCommandMap
import typings.ionicCliFramework.mod.BaseNamespace
import typings.ionicCliFramework.mod.BaseNamespaceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespaceMod {
  
  @JSImport("ionic/lib/namespace", "CommandMap")
  @js.native
  open class CommandMap () extends BaseCommandMap[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ionicCliFramework.definitionsMod.INamespace because Already inherited
  - typings.ionic.definitionsMod.INamespace because var conflicts: parent, root. Inlined env, project */ @JSImport("ionic/lib/namespace", "Namespace")
  @js.native
  abstract class Namespace () extends BaseNamespace[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(parent: INamespace) = this()
    
    def env: IonicEnvironment = js.native
    @JSName("env")
    var env_FNamespace: IonicEnvironment = js.native
    
    def project: js.UndefOr[IProject] = js.native
    @JSName("project")
    var project_FNamespace: js.UndefOr[IProject] = js.native
  }
  
  @JSImport("ionic/lib/namespace", "NamespaceMap")
  @js.native
  open class NamespaceMap () extends BaseNamespaceMap[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]
}
