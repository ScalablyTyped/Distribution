package typings.ionicCliFramework

import typings.ionicCliFramework.anon.Argv
import typings.ionicCliFramework.anon.CaseSensitive
import typings.ionicCliFramework.anon.IncludeSeparated
import typings.ionicCliFramework.anon.RequiredCommandMetadataCo
import typings.ionicCliFramework.colorsMod.ColorFunction
import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.completionMod.CompletionFormatterDeps
import typings.ionicCliFramework.configMod.BaseConfigOptions
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.CommandPathItem
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadataOption
import typings.ionicCliFramework.definitionsMod.HydratedParseArgsOptions
import typings.ionicCliFramework.definitionsMod.ICommand
import typings.ionicCliFramework.definitionsMod.INamespace
import typings.ionicCliFramework.definitionsMod.Validator
import typings.ionicCliFramework.definitionsMod.Validators
import typings.ionicCliFramework.executorMod.BaseExecutorDeps
import typings.ionicCliFramework.executorMod.ExecutorOperations
import typings.ionicCliFramework.helpMod.CommandHelpFormatterDeps
import typings.ionicCliFramework.helpMod.CommandHelpSchema
import typings.ionicCliFramework.helpMod.NamespaceHelpFormatterDeps
import typings.ionicCliFramework.loggerMod.CreateTaggedFormatterOptions
import typings.ionicCliFramework.loggerMod.Logger
import typings.ionicCliFramework.loggerMod.LoggerFormatter
import typings.ionicCliFramework.loggerMod.LoggerHandler
import typings.ionicCliFramework.loggerMod.LoggerLevel
import typings.ionicCliFramework.loggerMod.LoggerLevelWeight
import typings.ionicCliFramework.loggerMod.LoggerOptions
import typings.ionicCliFramework.loggerMod.StreamHandlerOptions
import typings.ionicCliFramework.optionsMod.FormatOptionNameOptions
import typings.ionicCliFramework.optionsMod.HydratedOptionSpec
import typings.ionicCliFramework.optionsMod.OptionPredicate
import typings.ionicCliFramework.optionsMod.UnparseArgsOptions
import typings.ionicCliFramework.outputMod.LogUpdateOutputStrategyOptions
import typings.ionicCliFramework.outputMod.StreamOutputStrategyOptions
import typings.ionicCliFramework.tasksMod.TaskChainOptions
import typings.ionicCliFramework.tasksMod.TaskOptions
import typings.minimist.mod.Opts
import typings.minimist.mod.ParsedArgs
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Partial
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@ionic/cli-framework/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/cli-framework/lib", "AbstractExecutor")
  @js.native
  abstract class AbstractExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.executorMod.AbstractExecutor[C, N, M, I, O] {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseCommand")
  @js.native
  abstract class BaseCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.commandMod.BaseCommand[C, N, M, I, O] {
    def this(namespace: N) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseCommandMap")
  @js.native
  class BaseCommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.commandMod.BaseCommandMap[C, N, M, I, O]
  
  @JSImport("@ionic/cli-framework/lib", "BaseConfig")
  @js.native
  abstract class BaseConfig[T /* <: js.Object */] protected ()
    extends typings.ionicCliFramework.configMod.BaseConfig[T] {
    def this(p: String) = this()
    def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseExecutor")
  @js.native
  class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.executorMod.BaseExecutor[C, N, M, I, O] {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseNamespace")
  @js.native
  abstract class BaseNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.commandMod.BaseNamespace[C, N, M, I, O] {
    def this(parent: N) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseNamespaceMap")
  @js.native
  class BaseNamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.commandMod.BaseNamespaceMap[C, N, M, I, O]
  
  @JSImport("@ionic/cli-framework/lib", "Command")
  @js.native
  abstract class Command protected ()
    extends typings.ionicCliFramework.commandMod.Command {
    def this(namespace: typings.ionicCliFramework.commandMod.Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandHelpFormatter")
  @js.native
  abstract class CommandHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.CommandHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandMap")
  @js.native
  class CommandMap ()
    extends typings.ionicCliFramework.commandMod.CommandMap
  
  @JSImport("@ionic/cli-framework/lib", "CommandMapDefault")
  @js.native
  val CommandMapDefault: js.Symbol = js.native
  
  @JSImport("@ionic/cli-framework/lib", "CommandSchemaHelpFormatter")
  @js.native
  class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.CommandSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandStringHelpFormatter")
  @js.native
  class CommandStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.CommandStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CompletionFormatter")
  @js.native
  abstract class CompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.completionMod.CompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "DEFAULT_COLORS")
  @js.native
  val DEFAULT_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework/lib", "DEFAULT_LOGGER_HANDLERS")
  @js.native
  val DEFAULT_LOGGER_HANDLERS: ReadonlySet[typings.ionicCliFramework.loggerMod.StreamHandler] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "EXECUTOR_OPS")
  @js.native
  val EXECUTOR_OPS: ExecutorOperations = js.native
  
  @JSImport("@ionic/cli-framework/lib", "Executor")
  @js.native
  class Executor protected ()
    extends typings.ionicCliFramework.executorMod.Executor {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[
            typings.ionicCliFramework.commandMod.Command, 
            typings.ionicCliFramework.commandMod.Namespace, 
            CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
            CommandMetadataInput, 
            CommandMetadataOption
          ]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "HELP_FLAGS")
  @js.native
  val HELP_FLAGS: js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "HelpFormatter")
  @js.native
  abstract class HelpFormatter protected ()
    extends typings.ionicCliFramework.helpMod.HelpFormatter {
    def this(hasColors: typings.ionicCliFramework.anon.Colors) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "ICON_FAILURE")
  @js.native
  val ICON_FAILURE: String = js.native
  
  @JSImport("@ionic/cli-framework/lib", "ICON_SUCCESS")
  @js.native
  val ICON_SUCCESS: String = js.native
  
  /* Inlined {readonly [ L in @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevel ]: @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevelWeight} */
  object LOGGER_LEVELS {
    
    @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVELS.DEBUG")
    @js.native
    val DEBUG: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVELS.ERROR")
    @js.native
    val ERROR: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVELS.INFO")
    @js.native
    val INFO: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVELS.WARN")
    @js.native
    val WARN: LoggerLevelWeight = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib", "LOGGER_LEVEL_NAMES")
  @js.native
  val LOGGER_LEVEL_NAMES: ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  
  @JSImport("@ionic/cli-framework/lib", "LogUpdateOutputStrategy")
  @js.native
  class LogUpdateOutputStrategy ()
    extends typings.ionicCliFramework.outputMod.LogUpdateOutputStrategy {
    def this(hasStreamColors: LogUpdateOutputStrategyOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "Logger")
  @js.native
  class Logger_ () extends Logger {
    def this(hasLevelHandlers: LoggerOptions) = this()
  }
  /* static members */
  object Logger_ {
    
    @JSImport("@ionic/cli-framework/lib", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneHandlers")(handlers.asInstanceOf[js.Any]).asInstanceOf[Set[LoggerHandler]]
  }
  
  @JSImport("@ionic/cli-framework/lib", "NO_COLORS")
  @js.native
  val NO_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework/lib", "Namespace")
  @js.native
  abstract class Namespace ()
    extends typings.ionicCliFramework.commandMod.Namespace {
    def this(parent: typings.ionicCliFramework.commandMod.Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceHelpFormatter")
  @js.native
  abstract class NamespaceHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.NamespaceHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceMap")
  @js.native
  class NamespaceMap ()
    extends typings.ionicCliFramework.commandMod.NamespaceMap
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceSchemaHelpFormatter")
  @js.native
  class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.NamespaceSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceStringHelpFormatter")
  @js.native
  class NamespaceStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.NamespaceStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  object OptionFilters {
    
    @JSImport("@ionic/cli-framework/lib", "OptionFilters")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    @scala.inline
    def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    
    @scala.inline
    def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    @scala.inline
    def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
  }
  
  @JSImport("@ionic/cli-framework/lib", "Spinner")
  @js.native
  class Spinner ()
    extends typings.ionicCliFramework.tasksMod.Spinner {
    def this(frames: js.Array[String]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "StreamHandler")
  @js.native
  class StreamHandler protected ()
    extends typings.ionicCliFramework.loggerMod.StreamHandler {
    def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "StreamOutputStrategy")
  @js.native
  class StreamOutputStrategy protected ()
    extends typings.ionicCliFramework.outputMod.StreamOutputStrategy {
    def this(hasStreamColors: StreamOutputStrategyOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "Task")
  @js.native
  class Task ()
    extends typings.ionicCliFramework.tasksMod.Task {
    def this(hasMsgTickInterval: TaskOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "TaskChain")
  @js.native
  class TaskChain ()
    extends typings.ionicCliFramework.tasksMod.TaskChain {
    def this(hasTaskOptions: TaskChainOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "ZshCompletionFormatter")
  @js.native
  class ZshCompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.completionMod.ZshCompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @scala.inline
  def combine(validators: Validator*): Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(validators.asInstanceOf[js.Any]).asInstanceOf[Validator]
  
  @scala.inline
  def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: CaseSensitive): Validator = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(values.asInstanceOf[js.Any], hasCaseSensitive.asInstanceOf[js.Any])).asInstanceOf[Validator]
  
  @scala.inline
  def createCommandMetadataFromSchema(schema: CommandHelpSchema): RequiredCommandMetadataCo = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommandMetadataFromSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[RequiredCommandMetadataCo]
  
  @scala.inline
  def createPrefixedFormatter(prefix: String): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedFormatter")(prefix.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  @scala.inline
  def createPrefixedFormatter(prefix: js.Function0[String]): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedFormatter")(prefix.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  @scala.inline
  def createTaggedFormatter(): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedFormatter")().asInstanceOf[LoggerFormatter]
  @scala.inline
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedFormatter")(hasColorsPrefixTitleizeWrap.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  @scala.inline
  def execute[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](hasNamespaceArgvEnvRest: (Argv[N, C, M, I, O]) & (Partial[BaseExecutorDeps[C, N, M, I, O]])): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(hasNamespaceArgvEnvRest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  @scala.inline
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  @scala.inline
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  @scala.inline
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  @scala.inline
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any], hasShowAliasesShowValueSpecColors.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCommandPath")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]]]
  
  @scala.inline
  def getCompletionWords[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](ns: N, argv: js.Array[String]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompletionWords")(ns.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  @scala.inline
  def getLoggerLevelColor(colors: Colors): js.UndefOr[ColorFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelColor")(colors.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ColorFunction]]
  @scala.inline
  def getLoggerLevelColor(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelColor")(colors.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ColorFunction]]
  
  @scala.inline
  def getLoggerLevelName(): js.UndefOr[LoggerLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelName")().asInstanceOf[js.UndefOr[LoggerLevel]]
  @scala.inline
  def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelName")(level.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[LoggerLevel]]
  
  @scala.inline
  def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): HydratedCommandMetadataOption[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateCommandMetadataOption")(option.asInstanceOf[js.Any]).asInstanceOf[HydratedCommandMetadataOption[O]]
  
  @scala.inline
  def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateOptionSpec")(opt.asInstanceOf[js.Any]).asInstanceOf[HydratedOptionSpec]
  
  @scala.inline
  def isCommandVisible[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandVisible")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def isOptionVisible[O /* <: CommandMetadataOption */](opt: O): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionVisible")(opt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSImport("@ionic/cli-framework/lib", "logger")
  @js.native
  val logger: Logger = js.native
  
  @scala.inline
  def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("metadataOptionsToParseArgsOptions")(commandOptions.asInstanceOf[js.Any]).asInstanceOf[HydratedParseArgsOptions]
  
  @scala.inline
  def parseArgs(): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[ParsedArgs]
  @scala.inline
  def parseArgs(args: js.Array[String]): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[ParsedArgs]
  @scala.inline
  def parseArgs(args: js.Array[String], opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  @scala.inline
  def parseArgs(args: Unit, opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  
  @scala.inline
  def parseArgs_T_Intersection[T](): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T & ParsedArgs]
  @scala.inline
  def parseArgs_T_Intersection[T](args: js.Array[String]): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T & ParsedArgs]
  @scala.inline
  def parseArgs_T_Intersection[T](args: js.Array[String], opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  @scala.inline
  def parseArgs_T_Intersection[T](args: Unit, opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  
  @scala.inline
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T]
  @scala.inline
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String], opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  @scala.inline
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: Unit, opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @scala.inline
  def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateArgv")(pargv.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[String], js.Array[String]]]
  
  @scala.inline
  def stripOptions(pargv: js.Array[String], hasIncludeSeparated: IncludeSeparated): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stripOptions")(pargv.asInstanceOf[js.Any], hasIncludeSeparated.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  @scala.inline
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: Unit,
    parseArgsOptions: Opts
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def unparseArgs(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], validatorsToUse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/cli-framework/lib", "validators")
  @js.native
  val validators: Validators = js.native
}
