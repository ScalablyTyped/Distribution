package typings
package atIonicCliDashFrameworkLib.cliDashFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", JSImport.Namespace)
@js.native
object cliDashFrameworkModMembers extends js.Object {
  val CommandMapDefault: js.Symbol = js.native
  val DEFAULT_LOGGER_HANDLERS: nodeLib.ReadonlySet[atIonicCliDashFrameworkLib.libLoggerMod.StreamHandler] = js.native
  val ERROR_COMMAND_NOT_FOUND: /* ERR_ICF_COMMAND_NOT_FOUND */ java.lang.String = js.native
  val ERROR_INPUT_VALIDATION: /* ERR_ICF_INPUT_VALIDATION */ java.lang.String = js.native
  val ERROR_IPC_MODULE_INACCESSIBLE: /* ERR_ICF_IPC_MODULE_INACCESSIBLE */ java.lang.String = js.native
  val ERROR_IPC_UNKNOWN_PROCEDURE: /* ERR_ICF_IPC_UNKNOWN_PROCEDURE */ java.lang.String = js.native
  val ERROR_SHELL_COMMAND_NOT_FOUND: /* ERR_ICF_SHELL_COMMAND_NOT_FOUND */ java.lang.String = js.native
  val ERROR_SHELL_NON_ZERO_EXIT: /* ERR_ICF_SHELL_NON_ZERO_EXIT */ java.lang.String = js.native
  val EXECUTOR_OPS: atIonicCliDashFrameworkLib.libExecutorMod.ExecutorOperations = js.native
  val ICON_FAILURE: java.lang.String = js.native
  val ICON_SUCCESS: java.lang.String = js.native
  val LOGGER_LEVEL_NAMES: stdLib.ReadonlyMap[
    atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevelWeight, 
    atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevel
  ] = js.native
  val logger: atIonicCliDashFrameworkLib.libLoggerMod.Logger = js.native
  val parseArgs: js.Any = js.native
  val validators: atIonicCliDashFrameworkLib.definitionsMod.Validators = js.native
  def contains(
    values: js.Array[js.UndefOr[java.lang.String]],
    hasCaseSensitive: atIonicCliDashFrameworkLib.Anon_CaseSensitive
  ): atIonicCliDashFrameworkLib.definitionsMod.Validator = js.native
  def createCommandMetadataFromSchema(schema: atIonicCliDashFrameworkLib.libHelpMod.CommandHelpSchema): stdLib.Required[
    atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption
    ]
  ] = js.native
  def createPrefixedFormatter(prefix: java.lang.String): atIonicCliDashFrameworkLib.libLoggerMod.LoggerFormatter = js.native
  def createPrefixedFormatter(prefix: js.Function0[java.lang.String]): atIonicCliDashFrameworkLib.libLoggerMod.LoggerFormatter = js.native
  def createPromptChoiceSeparator(): inquirerLib.inquirerMod.inquirerNs.objectsNs.Separator = js.native
  def createPromptModule(): stdLib.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptModule] = js.native
  def createPromptModule(hasInteractiveOnFallback: atIonicCliDashFrameworkLib.libPromptsMod.CreatePromptModuleOptions): stdLib.Promise[atIonicCliDashFrameworkLib.libPromptsMod.PromptModule] = js.native
  def createTaggedFormatter(): atIonicCliDashFrameworkLib.libLoggerMod.LoggerFormatter = js.native
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: atIonicCliDashFrameworkLib.libLoggerMod.CreateTaggedFormatterOptions): atIonicCliDashFrameworkLib.libLoggerMod.LoggerFormatter = js.native
  def execute[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    hasNamespaceArgvEnvRest: atIonicCliDashFrameworkLib.Anon_Namespace[N] with (stdLib.Partial[atIonicCliDashFrameworkLib.libExecutorMod.BaseExecutorDeps[C, N, M, I, O]])
  ): stdLib.Promise[scala.Unit] = js.native
  def filterCommandLineOptions[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](options: js.Array[O], parsedArgs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions): atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions = js.native
  def filterCommandLineOptions[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    options: js.Array[O],
    parsedArgs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions,
    predicate: atIonicCliDashFrameworkLib.libOptionsMod.OptionPredicate[O]
  ): atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions = js.native
  def filterCommandLineOptionsByGroup[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    options: js.Array[O],
    parsedArgs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions,
    groups: java.lang.String
  ): atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions = js.native
  def filterCommandLineOptionsByGroup[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    options: js.Array[O],
    parsedArgs: atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions,
    groups: js.Array[java.lang.String]
  ): atIonicCliDashFrameworkLib.definitionsMod.CommandLineOptions = js.native
  def formatOptionName[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](opt: O): java.lang.String = js.native
  def formatOptionName[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](opt: O, hasShowAliasesColors: atIonicCliDashFrameworkLib.Anon_ColorsShowAliases): java.lang.String = js.native
  def generateCommandPath[C /* <: atIonicCliDashFrameworkLib.definitionsMod.ICommand[C, N, M, I, O] */, N /* <: atIonicCliDashFrameworkLib.definitionsMod.INamespace[C, N, M, I, O] */, M /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadata[I, O] */, I /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput */, O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](cmd: C): stdLib.Promise[
    js.Array[atIonicCliDashFrameworkLib.definitionsMod.CommandPathItem[C, N, M, I, O]]
  ] = js.native
  def getLoggerLevelColor(colors: atIonicCliDashFrameworkLib.libColorsMod.Colors): js.UndefOr[chalkLib.chalkMod.Chalk] = js.native
  def getLoggerLevelColor(
    colors: atIonicCliDashFrameworkLib.libColorsMod.Colors,
    level: atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevelWeight
  ): js.UndefOr[chalkLib.chalkMod.Chalk] = js.native
  def getLoggerLevelName(): js.UndefOr[atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevel] = js.native
  def getLoggerLevelName(level: atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevelWeight): js.UndefOr[atIonicCliDashFrameworkLib.libLoggerMod.LoggerLevel] = js.native
  def hydrateCommandMetadataOption[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](option: O): atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadataOption[O] = js.native
  def metadataOptionsToParseArgsOptions(commandOptions: js.Array[atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption]): atIonicCliDashFrameworkLib.definitionsMod.HydratedParseArgsOptions = js.native
  def separateArgv(pargv: js.Array[java.lang.String]): js.Tuple2[js.Array[java.lang.String], js.Array[java.lang.String]] = js.native
  def stripOptions(
    pargv: js.Array[java.lang.String],
    hasIncludeSeparated: atIonicCliDashFrameworkLib.Anon_IncludeSeparated
  ): js.Array[java.lang.String] = js.native
  def unparseArgs(parsedArgs: minimistLib.minimistMod.minimistNs.ParsedArgs): js.Array[java.lang.String] = js.native
  def unparseArgs(
    parsedArgs: minimistLib.minimistMod.minimistNs.ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: atIonicCliDashFrameworkLib.libOptionsMod.UnparseArgsOptions
  ): js.Array[java.lang.String] = js.native
  def unparseArgs(
    parsedArgs: minimistLib.minimistMod.minimistNs.ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: atIonicCliDashFrameworkLib.libOptionsMod.UnparseArgsOptions,
    parseArgsOptions: minimistLib.minimistMod.minimistNs.Opts
  ): js.Array[java.lang.String] = js.native
  def validate(
    input: java.lang.String,
    key: java.lang.String,
    validatorsToUse: js.Array[atIonicCliDashFrameworkLib.definitionsMod.Validator]
  ): scala.Unit = js.native
}

