package typings.ionic

import typings.ionic.definitionsMod.CommandInstanceInfo
import typings.ionic.definitionsMod.CommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.ICommand
import typings.ionic.definitionsMod.INamespace
import typings.ionic.definitionsMod.NamespaceLocateResult
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.executorMod.BaseExecutorDeps
import typings.ionicCliFramework.mod.BaseExecutor
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorMod {
  
  @JSImport("ionic/lib/executor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ionic/lib/executor", "Executor")
  @js.native
  class Executor protected () extends BaseExecutor[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption] {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[ICommand, INamespace, CommandMetadata, CommandMetadataInput, CommandMetadataOption]) = this()
    
    def run(command: ICommand, cmdargs: js.Array[String], hasLocationEnvExecutor: CommandInstanceInfo): js.Promise[Unit] = js.native
  }
  
  @JSImport("ionic/lib/executor", "HELP_FLAGS")
  @js.native
  val HELP_FLAGS: js.Array[String] = js.native
  
  @JSImport("ionic/lib/executor", "VERSION_FLAGS")
  @js.native
  val VERSION_FLAGS: js.Array[String] = js.native
  
  @scala.inline
  def getFullCommandParts(location: NamespaceLocateResult): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullCommandParts")(location.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def metadataToCmdOptsEnv(metadata: CommandMetadata, cmdNameParts: js.Array[String]): Map[CommandMetadataOption, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("metadataToCmdOptsEnv")(metadata.asInstanceOf[js.Any], cmdNameParts.asInstanceOf[js.Any])).asInstanceOf[Map[CommandMetadataOption, String]]
  
  @scala.inline
  def runCommand(runinfo: CommandInstanceInfo, argv: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCommand")(runinfo.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait ExecutorDeps extends StObject {
    
    val namespace: INamespace
  }
  object ExecutorDeps {
    
    @scala.inline
    def apply(namespace: INamespace): ExecutorDeps = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutorDeps]
    }
    
    @scala.inline
    implicit class ExecutorDepsMutableBuilder[Self <: ExecutorDeps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: INamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
}
