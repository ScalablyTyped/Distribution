package typings.ionicCliFramework

import typings.ionicCliFramework.anon.Argv
import typings.ionicCliFramework.anon.CaseSensitive
import typings.ionicCliFramework.anon.IncludeSeparated
import typings.ionicCliFramework.anon.RequiredCommandMetadataCo
import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.completionMod.CompletionFormatterDeps
import typings.ionicCliFramework.configMod.BaseConfigOptions
import typings.ionicCliFramework.definitionsMod.CommandLineOptions
import typings.ionicCliFramework.definitionsMod.CommandMetadata
import typings.ionicCliFramework.definitionsMod.CommandMetadataInput
import typings.ionicCliFramework.definitionsMod.CommandMetadataOption
import typings.ionicCliFramework.definitionsMod.CommandPathItem
import typings.ionicCliFramework.definitionsMod.HydratedCommandMetadata
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
import typings.ionicCliFramework.optionsMod.FormatOptionNameOptions
import typings.ionicCliFramework.optionsMod.HydratedOptionSpec
import typings.ionicCliFramework.optionsMod.OptionPredicate
import typings.ionicCliFramework.optionsMod.UnparseArgsOptions
import typings.minimist.mod.Opts
import typings.minimist.mod.ParsedArgs
import typings.node.eventsMod.EventEmitterOptions
import typings.std.Partial
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
  open class BaseCommandMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
    extends typings.ionicCliFramework.commandMod.BaseCommandMap[C, N, M, I, O]
  
  @JSImport("@ionic/cli-framework/lib", "BaseConfig")
  @js.native
  abstract class BaseConfig[T /* <: js.Object */] protected ()
    extends typings.ionicCliFramework.configMod.BaseConfig[T] {
    def this(p: String) = this()
    def this(p: String, hasSpacesPathPrefix: BaseConfigOptions) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "BaseExecutor")
  @js.native
  open class BaseExecutor[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
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
  open class BaseNamespaceMap[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] ()
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
  open class CommandMap ()
    extends typings.ionicCliFramework.commandMod.CommandMap
  
  @JSImport("@ionic/cli-framework/lib", "CommandMapDefault")
  @js.native
  val CommandMapDefault: js.Symbol = js.native
  
  @JSImport("@ionic/cli-framework/lib", "CommandSchemaHelpFormatter")
  @js.native
  open class CommandSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.CommandSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationCommandMetadataColors: CommandHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "CommandStringHelpFormatter")
  @js.native
  open class CommandStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
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
  
  @JSImport("@ionic/cli-framework/lib", "EXECUTOR_OPS")
  @js.native
  val EXECUTOR_OPS: ExecutorOperations = js.native
  
  @JSImport("@ionic/cli-framework/lib", "Executor")
  @js.native
  open class Executor protected ()
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
  open class NamespaceMap ()
    extends typings.ionicCliFramework.commandMod.NamespaceMap
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceSchemaHelpFormatter")
  @js.native
  open class NamespaceSchemaHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.NamespaceSchemaHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  @JSImport("@ionic/cli-framework/lib", "NamespaceStringHelpFormatter")
  @js.native
  open class NamespaceStringHelpFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.helpMod.NamespaceStringHelpFormatter[C, N, M, I, O] {
    def this(hasLocationNamespaceColors: NamespaceHelpFormatterDeps[C, N, M, I, O]) = this()
  }
  
  object OptionFilters {
    
    @JSImport("@ionic/cli-framework/lib", "OptionFilters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def excludesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    inline def excludesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("excludesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    
    inline def includesGroups[O /* <: CommandMetadataOption */](groups: String): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
    inline def includesGroups[O /* <: CommandMetadataOption */](groups: js.Array[String]): OptionPredicate[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("includesGroups")(groups.asInstanceOf[js.Any]).asInstanceOf[OptionPredicate[O]]
  }
  
  @JSImport("@ionic/cli-framework/lib", "ZshCompletionFormatter")
  @js.native
  open class ZshCompletionFormatter[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */] protected ()
    extends typings.ionicCliFramework.completionMod.ZshCompletionFormatter[C, N, M, I, O] {
    def this(hasNamespace: CompletionFormatterDeps[C, N, M, I, O]) = this()
  }
  
  inline def combine(validators: Validator*): Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(validators.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Validator]
  
  inline def contains(values: js.Array[js.UndefOr[String]], hasCaseSensitive: CaseSensitive): Validator = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(values.asInstanceOf[js.Any], hasCaseSensitive.asInstanceOf[js.Any])).asInstanceOf[Validator]
  
  inline def createCommandMetadataFromSchema(schema: CommandHelpSchema): RequiredCommandMetadataCo = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommandMetadataFromSchema")(schema.asInstanceOf[js.Any]).asInstanceOf[RequiredCommandMetadataCo]
  
  inline def execute[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](hasNamespaceArgvEnvRest: (Argv[N, C, M, I, O]) & (Partial[BaseExecutorDeps[C, N, M, I, O]])): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("execute")(hasNamespaceArgvEnvRest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  inline def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptions")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  inline def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  inline def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("filterCommandLineOptionsByGroup")(options.asInstanceOf[js.Any], parsedArgs.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[CommandLineOptions]
  
  inline def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatOptionName")(opt.asInstanceOf[js.Any], hasShowAliasesShowValueSpecColors.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateCommandPath[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: C): js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCommandPath")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[CommandPathItem[C, N, M, I, O]]]]
  
  inline def getCompletionWords[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](ns: N, argv: js.Array[String]): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCompletionWords")(ns.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): O = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateCommandMetadataOption")(option.asInstanceOf[js.Any]).asInstanceOf[O]
  
  inline def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = ^.asInstanceOf[js.Dynamic].applyDynamic("hydrateOptionSpec")(opt.asInstanceOf[js.Any]).asInstanceOf[HydratedOptionSpec]
  
  inline def isCommandVisible[C /* <: ICommand[C, N, M, I, O] */, N /* <: INamespace[C, N, M, I, O] */, M /* <: CommandMetadata[I, O] */, I /* <: CommandMetadataInput */, O /* <: CommandMetadataOption */](cmd: HydratedCommandMetadata[C, N, M, I, O]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isCommandVisible")(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def isOptionVisible[O /* <: CommandMetadataOption */](opt: O): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isOptionVisible")(opt.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def metadataOptionsToParseArgsOptions(commandOptions: js.Array[CommandMetadataOption]): HydratedParseArgsOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("metadataOptionsToParseArgsOptions")(commandOptions.asInstanceOf[js.Any]).asInstanceOf[HydratedParseArgsOptions]
  
  inline def parseArgs(): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[ParsedArgs]
  inline def parseArgs(args: js.Array[String]): ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[ParsedArgs]
  inline def parseArgs(args: js.Array[String], opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  inline def parseArgs(args: Unit, opts: Opts): ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParsedArgs]
  
  inline def parseArgs_T_Intersection[T](): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: js.Array[String]): T & ParsedArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: js.Array[String], opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  inline def parseArgs_T_Intersection[T](args: Unit, opts: Opts): T & ParsedArgs = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T & ParsedArgs]
  
  inline def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")().asInstanceOf[T]
  inline def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: js.Array[String], opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def parseArgs_T_ParsedArgs_T[T /* <: ParsedArgs */](args: Unit, opts: Opts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parseArgs")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def separateArgv(pargv: js.Array[String]): js.Tuple2[js.Array[String], js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateArgv")(pargv.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Array[String], js.Array[String]]]
  
  inline def stripOptions(pargv: js.Array[String], hasIncludeSeparated: IncludeSeparated): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stripOptions")(pargv.asInstanceOf[js.Any], hasIncludeSeparated.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def unparseArgs(parsedArgs: ParsedArgs): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: Unit,
    parseArgsOptions: Opts
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def unparseArgs(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def unparseArgs(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseArgs")(parsedArgs.asInstanceOf[js.Any], hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase.asInstanceOf[js.Any], parseArgsOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def validate(input: String, key: String, validatorsToUse: js.Array[Validator]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(input.asInstanceOf[js.Any], key.asInstanceOf[js.Any], validatorsToUse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@ionic/cli-framework/lib", "validators")
  @js.native
  val validators: Validators = js.native
}
