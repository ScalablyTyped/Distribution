package typings.ionic

import typings.ionic.anon.PartialCommandMetadata
import typings.ionic.definitionsMod.BaseBuildOptions
import typings.ionic.definitionsMod.BuildOptions
import typings.ionic.definitionsMod.CommandMetadataOption
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import typings.ionic.definitionsMod.NpmClient
import typings.ionic.definitionsMod.Runner
import typings.ionicCliFramework.definitionsMod.CommandLineInputs
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFrameworkPrompts.mod.PromptModule
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptQuestionOther
import typings.ionicCliFrameworkPrompts.mod.PromptValueCheckbox
import typings.ionicCliFrameworkPrompts.mod.PromptValueConfirm
import typings.ionicCliFrameworkPrompts.mod.PromptValueOther
import typings.node.processMod.global.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ionic/lib/build", JSImport.Namespace)
@js.native
object libBuildMod extends js.Object {
  
  val BUILD_SCRIPT: /* "ionic:build" */ String = js.native
  
  val COMMON_BUILD_COMMAND_OPTIONS: js.Array[CommandMetadataOption] = js.native
  
  @js.native
  abstract class BuildCLI[T /* <: js.Object */] protected () extends js.Object {
    def this(e: BuildRunnerDeps) = this()
    
    var _resolvedProgram: js.Any = js.native
    
    def build(options: T): js.Promise[Unit] = js.native
    
    /**
      * Build the arguments for starting this Build CLI. Called by `this.run()`.
      */
    /* protected */ def buildArgs(options: T): js.Promise[js.Array[String]] = js.native
    
    /**
      * Build the environment variables for this Build CLI. Called by `this.run()`.
      */
    /* protected */ def buildEnvVars(options: T): js.Promise[ProcessEnv] = js.native
    
    val e: BuildRunnerDeps = js.native
    
    /**
      * If true, the Build CLI will not prompt to be installed.
      */
    val global: Boolean = js.native
    
    /**
      * The pretty name of this Build CLI.
      */
    val name: String = js.native
    
    /**
      * The npm package of this Build CLI.
      */
    val pkg: String = js.native
    
    /**
      * The bin program to use for this Build CLI.
      */
    val program: String = js.native
    
    /* protected */ def promptToInstall(): js.Promise[Boolean] = js.native
    
    /* protected */ def resolveProgram(): js.Promise[String] = js.native
    
    def resolveScript(): js.Promise[js.UndefOr[String]] = js.native
    
    def resolvedProgram: String = js.native
    
    /* protected */ def run(options: T): js.Promise[Unit] = js.native
    
    /* protected */ def runWrapper(options: T): js.Promise[Unit] = js.native
    
    /**
      * If specified, `package.json` is inspected for this script to use instead
      * of `program`.
      */
    val script: js.UndefOr[String] = js.native
  }
  
  @js.native
  abstract class BuildRunner[T /* <: BuildOptions[_] */] () extends Runner[T, Unit] {
    
    def afterBuild(options: T): js.Promise[Unit] = js.native
    
    def beforeBuild(options: T): js.Promise[Unit] = js.native
    
    def buildProject(options: T): js.Promise[Unit] = js.native
    
    def createBaseOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): BaseBuildOptions = js.native
    
    def createOptionsFromCommandLine(inputs: CommandLineInputs, options: CommandLineOptions): T = js.native
    
    def determineEngineFromCommandLine(options: CommandLineOptions): String = js.native
    
    val e: BuildRunnerDeps = js.native
    
    def getCommandMetadata(): js.Promise[PartialCommandMetadata] = js.native
    
    def getPkgManagerBuildCLI(): PkgManagerBuildCLI = js.native
  }
  
  @js.native
  trait BuildRunnerDeps extends js.Object {
    
    val config: IConfig = js.native
    
    val log: ILogger = js.native
    
    val project: IProject = js.native
    
    def prompt(question: PromptQuestionCheckbox): js.Promise[PromptValueCheckbox] = js.native
    def prompt(question: PromptQuestionConfirm): js.Promise[PromptValueConfirm] = js.native
    def prompt(question: PromptQuestionOther): js.Promise[PromptValueOther] = js.native
    @JSName("prompt")
    val prompt_Original: PromptModule = js.native
    
    val shell: IShell = js.native
  }
  
  @js.native
  class NpmBuildCLI () extends PkgManagerBuildCLI
  
  @js.native
  trait PkgManagerBuildCLI extends BuildCLI[BaseBuildOptions] {
    
    @JSName("program")
    val program_PkgManagerBuildCLI: NpmClient = js.native
    
    @JSName("script")
    val script_PkgManagerBuildCLI: /* "ionic:build" */ String = js.native
  }
  
  @js.native
  class YarnBuildCLI () extends PkgManagerBuildCLI
}
