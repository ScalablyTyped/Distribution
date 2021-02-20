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
import typings.ionicCliFramework.definitionsMod.ValidationError
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ionic/cli-framework", "AbstractExecutor")
  @js.native
  abstract class AbstractExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.libMod.AbstractExecutor[C, N, M, I, O] {
    def this(options: EventEmitterOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework", "BaseCommand")
  @js.native
  abstract class BaseCommand[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.BaseCommand[C, N, M, I, O] {
    def this(namespace: N) = this()
  }
  
  @JSImport("@ionic/cli-framework", "BaseCommandMap")
  @js.native
  class BaseCommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.libMod.BaseCommandMap[C, N, M, I, O]
  
  @JSImport("@ionic/cli-framework", "BaseConfig")
  @js.native
  abstract class BaseConfig[T /* <: js.Object */] protected ()
    extends typings.ionicCliFramework.libMod.BaseConfig[T] {
    def this(p: String) = this()
    def this(p: String, hasPathPrefix: BaseConfigOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework", "BaseError")
  @js.native
  abstract class BaseError protected ()
    extends typings.ionicCliFramework.errorsMod.BaseError {
    def this(message: String) = this()
  }
  
  @JSImport("@ionic/cli-framework", "BaseExecutor")
  @js.native
  class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.BaseExecutor[C, N, M, I, O] {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "BaseNamespace")
  @js.native
  abstract class BaseNamespace[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.libMod.BaseNamespace[C, N, M, I, O] {
    def this(parent: N) = this()
  }
  
  @JSImport("@ionic/cli-framework", "BaseNamespaceMap")
  @js.native
  class BaseNamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.libMod.BaseNamespaceMap[C, N, M, I, O]
  
  @JSImport("@ionic/cli-framework", "Command")
  @js.native
  abstract class Command protected ()
    extends typings.ionicCliFramework.libMod.Command {
    def this(namespace: typings.ionicCliFramework.commandMod.Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework", "CommandHelpFormatter")
  @js.native
  abstract class CommandHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.CommandHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "CommandMap")
  @js.native
  class CommandMap ()
    extends typings.ionicCliFramework.libMod.CommandMap
  
  @JSImport("@ionic/cli-framework", "CommandMapDefault")
  @js.native
  val CommandMapDefault: js.Symbol = js.native
  
  @JSImport("@ionic/cli-framework", "CommandNotFoundError")
  @js.native
  class CommandNotFoundError protected ()
    extends typings.ionicCliFramework.errorsMod.CommandNotFoundError {
    def this(message: String, args: js.Array[String]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "CommandSchemaHelpFormatter")
  @js.native
  class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.CommandSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "CommandStringHelpFormatter")
  @js.native
  class CommandStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.CommandStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "CompletionFormatter")
  @js.native
  abstract class CompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.CompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "DEFAULT_COLORS")
  @js.native
  val DEFAULT_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework", "DEFAULT_LOGGER_HANDLERS")
  @js.native
  val DEFAULT_LOGGER_HANDLERS: ReadonlySet[typings.ionicCliFramework.loggerMod.StreamHandler] = js.native
  
  @JSImport("@ionic/cli-framework", "ERROR_COMMAND_NOT_FOUND")
  @js.native
  val ERROR_COMMAND_NOT_FOUND: /* "ERR_ICF_COMMAND_NOT_FOUND" */ String = js.native
  
  @JSImport("@ionic/cli-framework", "ERROR_INPUT_VALIDATION")
  @js.native
  val ERROR_INPUT_VALIDATION: /* "ERR_ICF_INPUT_VALIDATION" */ String = js.native
  
  @JSImport("@ionic/cli-framework", "ERROR_IPC_MODULE_INACCESSIBLE")
  @js.native
  val ERROR_IPC_MODULE_INACCESSIBLE: /* "ERR_ICF_IPC_MODULE_INACCESSIBLE" */ String = js.native
  
  @JSImport("@ionic/cli-framework", "ERROR_IPC_UNKNOWN_PROCEDURE")
  @js.native
  val ERROR_IPC_UNKNOWN_PROCEDURE: /* "ERR_ICF_IPC_UNKNOWN_PROCEDURE" */ String = js.native
  
  @JSImport("@ionic/cli-framework", "EXECUTOR_OPS")
  @js.native
  val EXECUTOR_OPS: ExecutorOperations = js.native
  
  @JSImport("@ionic/cli-framework", "Executor")
  @js.native
  class Executor protected ()
    extends typings.ionicCliFramework.libMod.Executor {
    def this(hasNamespaceStdoutStderrColors: BaseExecutorDeps[
            typings.ionicCliFramework.commandMod.Command, 
            typings.ionicCliFramework.commandMod.Namespace, 
            CommandMetadata[CommandMetadataInput, CommandMetadataOption], 
            CommandMetadataInput, 
            CommandMetadataOption
          ]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "HELP_FLAGS")
  @js.native
  val HELP_FLAGS: js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework", "HelpFormatter")
  @js.native
  abstract class HelpFormatter protected ()
    extends typings.ionicCliFramework.libMod.HelpFormatter {
    def this(hasColors: typings.ionicCliFramework.anon.Colors) = this()
  }
  
  @JSImport("@ionic/cli-framework", "ICON_FAILURE")
  @js.native
  val ICON_FAILURE: String = js.native
  
  @JSImport("@ionic/cli-framework", "ICON_SUCCESS")
  @js.native
  val ICON_SUCCESS: String = js.native
  
  @JSImport("@ionic/cli-framework", "IPCError")
  @js.native
  class IPCError protected ()
    extends typings.ionicCliFramework.errorsMod.IPCError {
    def this(message: String) = this()
  }
  
  @JSImport("@ionic/cli-framework", "InputValidationError")
  @js.native
  class InputValidationError protected ()
    extends typings.ionicCliFramework.errorsMod.InputValidationError {
    def this(message: String, errors: js.Array[ValidationError]) = this()
  }
  
  /* Inlined {readonly [ L in @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevel ]: @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevelWeight} */
  object LOGGER_LEVELS {
    
    @JSImport("@ionic/cli-framework", "LOGGER_LEVELS.DEBUG")
    @js.native
    val DEBUG: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework", "LOGGER_LEVELS.ERROR")
    @js.native
    val ERROR: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework", "LOGGER_LEVELS.INFO")
    @js.native
    val INFO: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework", "LOGGER_LEVELS.WARN")
    @js.native
    val WARN: LoggerLevelWeight = js.native
  }
  
  @JSImport("@ionic/cli-framework", "LOGGER_LEVEL_NAMES")
  @js.native
  val LOGGER_LEVEL_NAMES: ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  
  @JSImport("@ionic/cli-framework", "LogUpdateOutputStrategy")
  @js.native
  class LogUpdateOutputStrategy ()
    extends typings.ionicCliFramework.libMod.LogUpdateOutputStrategy {
    def this(hasStreamColors: LogUpdateOutputStrategyOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework", "Logger")
  @js.native
  class Logger_ ()
    extends typings.ionicCliFramework.libMod.Logger_ {
    def this(hasLevelHandlers: LoggerOptions) = this()
  }
  /* static members */
  object Logger_ {
    
    @JSImport("@ionic/cli-framework", "Logger.cloneHandlers")
    @js.native
    def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = js.native
  }
  
  @JSImport("@ionic/cli-framework", "NO_COLORS")
  @js.native
  val NO_COLORS: Colors = js.native
  
  @JSImport("@ionic/cli-framework", "Namespace")
  @js.native
  abstract class Namespace ()
    extends typings.ionicCliFramework.libMod.Namespace {
    def this(parent: typings.ionicCliFramework.commandMod.Namespace) = this()
  }
  
  @JSImport("@ionic/cli-framework", "NamespaceHelpFormatter")
  @js.native
  abstract class NamespaceHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.NamespaceHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "NamespaceMap")
  @js.native
  class NamespaceMap ()
    extends typings.ionicCliFramework.libMod.NamespaceMap
  
  @JSImport("@ionic/cli-framework", "NamespaceSchemaHelpFormatter")
  @js.native
  class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.NamespaceSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "NamespaceStringHelpFormatter")
  @js.native
  class NamespaceStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.NamespaceStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  object OptionFilters {
    
    @JSImport("@ionic/cli-framework", "OptionFilters.excludesGroups")
    @js.native
    def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
    @JSImport("@ionic/cli-framework", "OptionFilters.excludesGroups")
    @js.native
    def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
    
    @JSImport("@ionic/cli-framework", "OptionFilters.includesGroups")
    @js.native
    def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = js.native
    @JSImport("@ionic/cli-framework", "OptionFilters.includesGroups")
    @js.native
    def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = js.native
  }
  
  @JSImport("@ionic/cli-framework", "Spinner")
  @js.native
  class Spinner ()
    extends typings.ionicCliFramework.libMod.Spinner {
    def this(frames: js.Array[String]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "StreamHandler")
  @js.native
  class StreamHandler protected ()
    extends typings.ionicCliFramework.libMod.StreamHandler {
    def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework", "StreamOutputStrategy")
  @js.native
  class StreamOutputStrategy protected ()
    extends typings.ionicCliFramework.libMod.StreamOutputStrategy {
    def this(hasStreamColors: StreamOutputStrategyOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework", "Task")
  @js.native
  class Task ()
    extends typings.ionicCliFramework.libMod.Task {
    def this(hasMsgTickInterval: TaskOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework", "TaskChain")
  @js.native
  class TaskChain ()
    extends typings.ionicCliFramework.libMod.TaskChain {
    def this(hasTaskOptions: TaskChainOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework", "ZshCompletionFormatter")
  @js.native
  class ZshCompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.libMod.ZshCompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework", "combine")
  @js.native
  def combine(validators: Validator*): Validator = js.native
  
  @JSImport("@ionic/cli-framework", "contains")
  @js.native
  def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: CaseSensitive): Validator = js.native
  
  @JSImport("@ionic/cli-framework", "createCommandMetadataFromSchema")
  @js.native
  def createCommandMetadataFromSchema(schema: CommandHelpSchema): RequiredCommandMetadataCo = js.native
  
  @JSImport("@ionic/cli-framework", "createPrefixedFormatter")
  @js.native
  def createPrefixedFormatter(prefix: String): LoggerFormatter = js.native
  @JSImport("@ionic/cli-framework", "createPrefixedFormatter")
  @js.native
  def createPrefixedFormatter(prefix: js.Function0[String]): LoggerFormatter = js.native
  
  @JSImport("@ionic/cli-framework", "createTaggedFormatter")
  @js.native
  def createTaggedFormatter(): LoggerFormatter = js.native
  @JSImport("@ionic/cli-framework", "createTaggedFormatter")
  @js.native
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  
  @JSImport("@ionic/cli-framework", "execute")
  @js.native
  def execute[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](hasNamespaceArgvEnvRest: (Argv[N, C, M, I, O]) with (Partial[BaseExecutorDeps[C, N, M, I, O]])): js.Promise[Unit] = js.native
  
  @JSImport("@ionic/cli-framework", "filterCommandLineOptions")
  @js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = js.native
  @JSImport("@ionic/cli-framework", "filterCommandLineOptions")
  @js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = js.native
  
  @JSImport("@ionic/cli-framework", "filterCommandLineOptionsByGroup")
  @js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = js.native
  @JSImport("@ionic/cli-framework", "filterCommandLineOptionsByGroup")
  @js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = js.native
  
  @JSImport("@ionic/cli-framework", "formatOptionName")
  @js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = js.native
  @JSImport("@ionic/cli-framework", "formatOptionName")
  @js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = js.native
  
  @JSImport("@ionic/cli-framework", "generateCommandPath")
  @js.native
  def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = js.native
  
  @JSImport("@ionic/cli-framework", "getCompletionWords")
  @js.native
  def getCompletionWords[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](ns: N, argv: js.Array[String]): js.Promise[js.Array[String]] = js.native
  
  @JSImport("@ionic/cli-framework", "getLoggerLevelColor")
  @js.native
  def getLoggerLevelColor(colors: Colors): js.UndefOr[ColorFunction] = js.native
  @JSImport("@ionic/cli-framework", "getLoggerLevelColor")
  @js.native
  def getLoggerLevelColor(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
  
  @JSImport("@ionic/cli-framework", "getLoggerLevelName")
  @js.native
  def getLoggerLevelName(): js.UndefOr[LoggerLevel] = js.native
  @JSImport("@ionic/cli-framework", "getLoggerLevelName")
  @js.native
  def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = js.native
  
  @JSImport("@ionic/cli-framework", "hydrateCommandMetadataOption")
  @js.native
  def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): HydratedCommandMetadataOption[O] = js.native
  
  @JSImport("@ionic/cli-framework", "hydrateOptionSpec")
  @js.native
  def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = js.native
  
  @JSImport("@ionic/cli-framework", "isCommandVisible")
  @js.native
  def isCommandVisible[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/cli-framework", "isOptionVisible")
  @js.native
  def isOptionVisible[O /* <: CommandMetadataOption */](opt: O): js.Promise[Boolean] = js.native
  
  @JSImport("@ionic/cli-framework", "logger")
  @js.native
  val logger: Logger = js.native
  
  @JSImport("@ionic/cli-framework", "metadataOptionsToParseArgsOptions")
  @js.native
  def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = js.native
  
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs(): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs(args: js.UndefOr[scala.Nothing], opts: Opts): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs(args: js.Array[String]): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs(args: js.Array[String], opts: Opts): ParsedArgs = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.UndefOr[scala.Nothing], opts: Opts): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.Array[String]): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs_T_Intersection[T](args: js.Array[String], opts: Opts): T with ParsedArgs = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](): T = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.UndefOr[scala.Nothing], opts: Opts): T = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String]): T = js.native
  @JSImport("@ionic/cli-framework", "parseArgs")
  @js.native
  def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String], opts: Opts): T = js.native
  
  @JSImport("@ionic/cli-framework", "separateArgv")
  @js.native
  def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = js.native
  
  @JSImport("@ionic/cli-framework", "stripOptions")
  @js.native
  def stripOptions(pargv: js.Array[String], hasIncludeSeparated: IncludeSeparated): js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework", "unparseArgs")
  @js.native
  def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework", "unparseArgs")
  @js.native
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: js.UndefOr[scala.Nothing],
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework", "unparseArgs")
  @js.native
  def unparseArgs(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = js.native
  @JSImport("@ionic/cli-framework", "unparseArgs")
  @js.native
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
  
  @JSImport("@ionic/cli-framework", "validate")
  @js.native
  def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = js.native
  
  @JSImport("@ionic/cli-framework", "validators")
  @js.native
  val validators: Validators = js.native
}
