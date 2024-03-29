package typings.ionicCliFramework

import typings.ionicCliFramework.anon.Argv
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.IExecutor
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.NamespaceLocateResult
import typings.ionicCliFramework.ionicCliFrameworkStrings.`operation-rpc`
import typings.ionicCliFramework.ionicCliFrameworkStrings.help
import typings.ionicCliFramework.ionicCliFrameworkStrings.json
import typings.ionicCliFramework.ionicCliFrameworkStrings.terminal
import typings.ionicCliFramework.libColorsMod.Colors
import typings.ionicCliFramework.libCommandMod.Command
import typings.ionicCliFramework.libCommandMod.Namespace
import typings.ionicCliFramework.libHelpMod.CommandHelpSchema
import typings.ionicCliFramework.libHelpMod.NamespaceHelpSchema
import typings.ionicCliFramework.utilsIpcMod.RPC
import typings.ionicCliFramework.utilsIpcMod.RPCProcess
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libExecutorMod {
  
  @JSImport("@ionic/cli-framework/lib/executor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@ionic/cli-framework/lib/executor", "AbstractExecutor")
  @js.native
  open class AbstractExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends EventEmitter
       with IExecutor[C, N, M, I, O] {
    def this(options: EventEmitterOptions) = this()
    
    def resolveExecuteInput(argvOrLocation: js.Array[String]): js.Promise[js.Tuple2[NamespaceLocateResult[C, N, M, I, O], js.Array[String]]] = js.native
    def resolveExecuteInput(argvOrLocation: NamespaceLocateResult[C, N, M, I, O]): js.Promise[js.Tuple2[NamespaceLocateResult[C, N, M, I, O], js.Array[String]]] = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/executor", "BaseExecutor")
  @js.native
  open class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected () extends AbstractExecutor[C, N, M, I, O] {
    def this(param0: BaseExecutorDeps[C, N, M, I, O]) = this()
    
    val colors: Colors = js.native
    
    @JSName("emit")
    def emit_operationrpc(event: `operation-rpc`, rpc: RPCProcess): Boolean = js.native
    
    /**
      * Locate and execute a command given an array of positional command
      * arguments (argv) and a set of environment variables.
      *
      * If a command is not found, formatted help is automatically output for the
      * right-most namespace found.
      *
      * @param argv Command arguments sliced to the root for the namespace of this
      *             executor. Usually, this means `process.argv.slice(2)`.
      * @param env Environment variables for this execution.
      */
    def execute(argvOrLocation: js.Array[String]): js.Promise[Unit] = js.native
    def execute(argvOrLocation: NamespaceLocateResult[C, N, M, I, O], env: ProcessEnv): js.Promise[Unit] = js.native
    
    def formatHelp(location: NamespaceLocateResult[C, N, M, I, O]): js.Promise[String] = js.native
    def formatHelp(location: NamespaceLocateResult[C, N, M, I, O], param1: BaseExecutorFormatHelpOptions): js.Promise[String] = js.native
    
    @JSName("on")
    def on_operationrpc(event: `operation-rpc`, callback: js.Function1[/* rpc */ RPCProcess, Unit]): this.type = js.native
    
    /**
      * Initiate RPC operation.
      *
      * This means the CLI has been executed by a parent Node process with an IPC
      * channel, allowing request/response communication via RPC.
      */
    def rpc(): js.Promise[Unit] = js.native
    
    val stderr: WriteStream = js.native
    
    val stdout: WriteStream = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/executor", "EXECUTOR_OPS")
  @js.native
  val EXECUTOR_OPS: ExecutorOperations = js.native
  
  @JSImport("@ionic/cli-framework/lib/executor", "Executor")
  @js.native
  open class Executor protected () extends BaseExecutor[
          Command, 
          Namespace, 
          CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
          CommandMetadataInput, 
          CommandMetadataOption
        ] {
    def this(param0: BaseExecutorDeps[
            Command, 
            Namespace, 
            CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
            CommandMetadataInput, 
            CommandMetadataOption
          ]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib/executor", "HELP_FLAGS")
  @js.native
  val HELP_FLAGS: js.Array[String] = js.native
  
  inline def execute[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](param0: (Argv[N, C, M, I, O]) & (Partial[BaseExecutorDeps[C, N, M, I, O]])): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait BaseExecutorDeps[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] extends StObject {
    
    val colors: js.UndefOr[Colors] = js.undefined
    
    val namespace: N
    
    val stderr: js.UndefOr[WriteStream] = js.undefined
    
    val stdout: js.UndefOr[WriteStream] = js.undefined
  }
  object BaseExecutorDeps {
    
    inline def apply[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](namespace: N): BaseExecutorDeps[C, N, M, I, O] = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseExecutorDeps[C, N, M, I, O]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseExecutorDeps[?, ?, ?, ?, ?], C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] (val x: Self & (BaseExecutorDeps[C, N, M, I, O])) extends AnyVal {
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setNamespace(value: N): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
  
  trait BaseExecutorFormatHelpOptions extends StObject {
    
    var format: js.UndefOr[terminal | json] = js.undefined
  }
  object BaseExecutorFormatHelpOptions {
    
    inline def apply(): BaseExecutorFormatHelpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseExecutorFormatHelpOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseExecutorFormatHelpOptions] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: terminal | json): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait ExecutorOperations extends StObject {
    
    val RPC: String
  }
  object ExecutorOperations {
    
    inline def apply(RPC: String): ExecutorOperations = {
      val __obj = js.Dynamic.literal(RPC = RPC.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutorOperations]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecutorOperations] (val x: Self) extends AnyVal {
      
      inline def setRPC(value: String): Self = StObject.set(x, "RPC", value.asInstanceOf[js.Any])
    }
  }
  
  type HelpRPC[S /* <: CommandHelpSchema | NamespaceHelpSchema */] = RPC[help, js.Array[js.Array[String]], S]
}
