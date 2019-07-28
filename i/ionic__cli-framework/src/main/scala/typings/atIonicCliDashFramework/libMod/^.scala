package typings.atIonicCliDashFramework.libMod

import typings.atIonicCliDashFramework.Anon_Argv
import typings.atIonicCliDashFramework.Anon_CaseSensitive
import typings.atIonicCliDashFramework.Anon_IncludeSeparated
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataInput
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.CommandPathItem
import typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadata
import typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.HydratedParseArgsOptions
import typings.atIonicCliDashFramework.definitionsMod.ICommand
import typings.atIonicCliDashFramework.definitionsMod.INamespace
import typings.atIonicCliDashFramework.definitionsMod.Validator
import typings.atIonicCliDashFramework.definitionsMod.Validators
import typings.atIonicCliDashFramework.libColorsMod.ColorFunction
import typings.atIonicCliDashFramework.libColorsMod.Colors
import typings.atIonicCliDashFramework.libExecutorMod.BaseExecutorDeps
import typings.atIonicCliDashFramework.libExecutorMod.ExecutorOperations
import typings.atIonicCliDashFramework.libHelpMod.CommandHelpSchema
import typings.atIonicCliDashFramework.libLoggerMod.CreateTaggedFormatterOptions
import typings.atIonicCliDashFramework.libLoggerMod.LoggerFormatter
import typings.atIonicCliDashFramework.libLoggerMod.LoggerLevel
import typings.atIonicCliDashFramework.libLoggerMod.LoggerLevelWeight
import typings.atIonicCliDashFramework.libOptionsMod.FormatOptionNameOptions
import typings.atIonicCliDashFramework.libOptionsMod.HydratedOptionSpec
import typings.atIonicCliDashFramework.libOptionsMod.OptionPredicate
import typings.atIonicCliDashFramework.libOptionsMod.UnparseArgsOptions
import typings.atIonicCliDashFramework.libPromptsMod.CreatePromptModuleOptions
import typings.atIonicCliDashFramework.libPromptsMod.PromptModule
import typings.atIonicCliDashFramework.libPromptsMod.Separator
import typings.minimist.minimistMod.Opts
import typings.minimist.minimistMod.ParsedArgs
import typings.std.Partial
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CommandMapDefault: js.Symbol = js.native
  val DEFAULT_COLORS: Colors = js.native
  val DEFAULT_LOGGER_HANDLERS: ReadonlySet[typings.atIonicCliDashFramework.libLoggerMod.StreamHandler] = js.native
  val EXECUTOR_OPS: ExecutorOperations = js.native
  val ICON_FAILURE: String = js.native
  val ICON_SUCCESS: String = js.native
  val LOGGER_LEVEL_NAMES: ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  val NO_COLORS: Colors = js.native
  val logger: typings.atIonicCliDashFramework.libLoggerMod.Logger = js.native
  val validators: Validators = js.native
  def combine(validators: Validator*): Validator = js.native
  def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: Anon_CaseSensitive): Validator = js.native
  def createCommandMetadataFromSchema(schema: CommandHelpSchema): Required[CommandMetadata[CommandMetadataInput, CommandMetadataOption]] = js.native
  def createPrefixedFormatter(prefix: String): LoggerFormatter = js.native
  def createPrefixedFormatter(prefix: js.Function0[String]): LoggerFormatter = js.native
  def createPromptChoiceSeparator(): Separator = js.native
  def createPromptModule(): js.Promise[PromptModule] = js.native
  def createPromptModule(hasInteractiveOnFallback: CreatePromptModuleOptions): js.Promise[PromptModule] = js.native
  def createTaggedFormatter(): LoggerFormatter = js.native
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = js.native
  def execute[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](hasNamespaceArgvEnvRest: Anon_Argv[N] with (Partial[BaseExecutorDeps[C, N, M, I, O]])): js.Promise[Unit] = js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = js.native
  def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = js.native
  def getCompletionWords[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](ns: N, argv: js.Array[String]): js.Promise[js.Array[String]] = js.native
  def getLoggerLevelColor(colors: Colors): js.UndefOr[ColorFunction] = js.native
  def getLoggerLevelColor(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = js.native
  def getLoggerLevelName(): js.UndefOr[LoggerLevel] = js.native
  def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = js.native
  def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): HydratedCommandMetadataOption[O] = js.native
  def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = js.native
  def isCommandVisible[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = js.native
  def isOptionVisible[O /* <: CommandMetadataOption */](opt: O): js.Promise[Boolean] = js.native
  def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = js.native
  def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = js.native
  def stripOptions(pargv: js.Array[String], hasIncludeSeparated: Anon_IncludeSeparated): js.Array[String] = js.native
  def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = js.native
  def unparseArgs(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = js.native
  def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
  def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = js.native
}

