package typings.ionic

import typings.ionic.anon.PartialCommandMetadata
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.DevAppDetails
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.IonicEnvironmentFlags
import typings.ionic.definitionsMod.LabServeDetails
import typings.ionic.definitionsMod.NpmClient
import typings.ionic.definitionsMod.Runner
import typings.ionic.definitionsMod.ServeDetails
import typings.ionic.definitionsMod.ServeOptions
import typings.ionic.ionicStrings.compile
import typings.ionic.ionicStrings.ready
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptValueOther
import typings.ionicUtilsNetwork.mod.NetworkInterface
import typings.node.NodeJS.WritableStream
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.streamMod.Transform
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libServeMod {
  
  @JSImport("ionic/lib/serve", "BIND_ALL_ADDRESS")
  @js.native
  val BIND_ALL_ADDRESS: /* "0.0.0.0" */ String = js.native
  
  @JSImport("ionic/lib/serve", "BROWSERS")
  @js.native
  val BROWSERS: js.Array[String] = js.native
  
  @JSImport("ionic/lib/serve", "COMMON_SERVE_COMMAND_OPTIONS")
  @js.native
  val COMMON_SERVE_COMMAND_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  @JSImport("ionic/lib/serve", "DEFAULT_ADDRESS")
  @js.native
  val DEFAULT_ADDRESS: /* "localhost" */ String = js.native
  
  @JSImport("ionic/lib/serve", "DEFAULT_DEVAPP_COMM_PORT")
  @js.native
  val DEFAULT_DEVAPP_COMM_PORT: /* 53233 */ Double = js.native
  
  @JSImport("ionic/lib/serve", "DEFAULT_DEV_LOGGER_PORT")
  @js.native
  val DEFAULT_DEV_LOGGER_PORT: /* 53703 */ Double = js.native
  
  @JSImport("ionic/lib/serve", "DEFAULT_LAB_PORT")
  @js.native
  val DEFAULT_LAB_PORT: /* 8200 */ Double = js.native
  
  @JSImport("ionic/lib/serve", "DEFAULT_LIVERELOAD_PORT")
  @js.native
  val DEFAULT_LIVERELOAD_PORT: /* 35729 */ Double = js.native
  
  @JSImport("ionic/lib/serve", "DEFAULT_SERVER_PORT")
  @js.native
  val DEFAULT_SERVER_PORT: /* 8100 */ Double = js.native
  
  @JSImport("ionic/lib/serve", "LOCAL_ADDRESSES")
  @js.native
  val LOCAL_ADDRESSES: js.Array[String] = js.native
  
  @JSImport("ionic/lib/serve", "NpmServeCLI")
  @js.native
  class NpmServeCLI () extends PkgManagerServeCLI
  
  @JSImport("ionic/lib/serve", "SERVE_SCRIPT")
  @js.native
  val SERVE_SCRIPT: /* "ionic:serve" */ String = js.native
  
  @JSImport("ionic/lib/serve", "ServeCLI")
  @js.native
  abstract class ServeCLI[T /* <: ServeCLIOptions */] protected () extends EventEmitter {
    def this(e: ServeRunnerDeps) = this()
    
    var _resolvedProgram: js.Any = js.native
    
    /**
      * Build the arguments for starting this Serve CLI. Called by `this.start()`.
      */
    /* protected */ def buildArgs(options: T): js.Promise[js.Array[String]] = js.native
    
    /**
      * Build the environment variables to be passed to the Serve CLI. Called by `this.start()`;
      */
    /* protected */ def buildEnvVars(options: T): js.Promise[ProcessEnv] = js.native
    
    /* protected */ def createLoggerStream(): WritableStream = js.native
    
    /* protected */ def createStreamFilter(filter: js.Function1[/* line */ String, Boolean]): Transform = js.native
    
    val e: ServeRunnerDeps = js.native
    
    @JSName("emit")
    def emit_compile(event: compile, chunks: Double): Boolean = js.native
    @JSName("emit")
    def emit_ready(event: ready): Boolean = js.native
    
    /**
      * If true, the Serve CLI will not prompt to be installed.
      */
    val global: Boolean = js.native
    
    /**
      * The pretty name of this Serve CLI.
      */
    val name: String = js.native
    
    @JSName("on")
    def on_compile(event: compile, handler: js.Function1[/* chunks */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_ready(event: ready, handler: js.Function0[Unit]): this.type = js.native
    
    @JSName("once")
    def once_compile(event: compile, handler: js.Function1[/* chunks */ Double, Unit]): this.type = js.native
    @JSName("once")
    def once_ready(event: ready, handler: js.Function0[Unit]): this.type = js.native
    
    /**
      * The npm package of this Serve CLI.
      */
    val pkg: String = js.native
    
    /**
      * The prefix to use for log statements.
      */
    val prefix: String = js.native
    
    /**
      * The bin program to use for this Serve CLI.
      */
    val program: String = js.native
    
    /* protected */ def promptToInstall(): js.Promise[Boolean] = js.native
    
    /* protected */ def resolveProgram(): js.Promise[String] = js.native
    
    def resolveScript(): js.Promise[js.UndefOr[String]] = js.native
    
    def resolvedProgram: String = js.native
    
    /**
      * If specified, `package.json` is inspected for this script to use instead
      * of `program`.
      */
    val script: js.UndefOr[String] = js.native
    
    def serve(options: T): js.Promise[Unit] = js.native
    
    /* protected */ def spawn(options: T): js.Promise[Unit] = js.native
    
    /* protected */ def spawnWrapper(options: T): js.Promise[Unit] = js.native
    
    /**
      * Called whenever a line of stderr is received.
      *
      * If `false` is returned, the line is not emitted to the log.
      */
    /* protected */ def stderrFilter(line: String): Boolean = js.native
    
    /**
      * Called whenever a line of stdout is received.
      *
      * If `false` is returned, the line is not emitted to the log.
      *
      * By default, the CLI is considered ready whenever stdout is emitted. This
      * method should be overridden to more accurately portray readiness.
      *
      * @param line A line of stdout.
      */
    /* protected */ def stdoutFilter(line: String): Boolean = js.native
  }
  
  @JSImport("ionic/lib/serve", "ServeRunner")
  @js.native
  abstract class ServeRunner[T /* <: ServeOptions */] () extends Runner[T, ServeDetails] {
    
    def afterServe(options: T, details: ServeDetails): js.Promise[Unit] = js.native
    
    def beforeServe(options: T): js.Promise[Unit] = js.native
    
    def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): ServeOptions = js.native
    
    def determineEngineFromCommandLine(options: CommandLineOptions): String = js.native
    
    var devAppConnectionMade: Boolean = js.native
    
    def displayDevAppMessage(options: T): js.Promise[Unit] = js.native
    
    val e: ServeRunnerDeps = js.native
    
    def gatherDevAppDetails(options: T, details: ServeDetails): js.Promise[js.UndefOr[DevAppDetails]] = js.native
    
    def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
    
    def getPkgManagerServeCLI(): PkgManagerServeCLI = js.native
    
    def getSupportedDevAppPlugins(): js.Promise[Set[String]] = js.native
    
    def getUsedPorts(options: T, details: ServeDetails): js.Array[Double] = js.native
    
    def modifyOpenUrl(url: String, options: T): String = js.native
    
    def publishDevApp(options: T, details: DevAppDetails): js.Promise[js.UndefOr[String]] = js.native
    
    def runLab(options: T, serveDetails: ServeDetails): js.Promise[LabServeDetails] = js.native
    
    def scheduleAfterServe(options: T, details: ServeDetails): Unit = js.native
    
    def selectExternalIP(options: T): js.Promise[js.Tuple2[String, js.Array[NetworkInterface]]] = js.native
    
    def serveProject(options: T): js.Promise[ServeDetails] = js.native
  }
  
  @JSImport("ionic/lib/serve", "YarnServeCLI")
  @js.native
  class YarnServeCLI () extends PkgManagerServeCLI
  
  @js.native
  trait PkgManagerServeCLI extends ServeCLI[ServeOptions] {
    
    @JSName("program")
    val program_PkgManagerServeCLI: NpmClient = js.native
    
    @JSName("script")
    val script_PkgManagerServeCLI: /* "ionic:serve" */ String = js.native
  }
  
  @js.native
  trait ServeCLIOptions extends StObject {
    
    val address: String = js.native
    
    val port: Double = js.native
  }
  object ServeCLIOptions {
    
    @scala.inline
    def apply(address: String, port: Double): ServeCLIOptions = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServeCLIOptions]
    }
    
    @scala.inline
    implicit class ServeCLIOptionsMutableBuilder[Self <: ServeCLIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServeRunnerDeps extends StObject {
    
    val config: IConfig = js.native
    
    val flags: IonicEnvironmentFlags = js.native
    
    val log: ILogger = js.native
    
    val project: IProject = js.native
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    
    val shell: IShell = js.native
  }
}
