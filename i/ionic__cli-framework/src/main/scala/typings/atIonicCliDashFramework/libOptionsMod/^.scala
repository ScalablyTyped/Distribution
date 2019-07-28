package typings.atIonicCliDashFramework.libOptionsMod

import typings.atIonicCliDashFramework.Anon_IncludeSeparated
import typings.atIonicCliDashFramework.definitionsMod.CommandLineOptions
import typings.atIonicCliDashFramework.definitionsMod.CommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.HydratedCommandMetadataOption
import typings.atIonicCliDashFramework.definitionsMod.HydratedParseArgsOptions
import typings.minimist.minimistMod.Opts
import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/options", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions): CommandLineOptions = js.native
  def filterCommandLineOptions[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, predicate: OptionPredicate[O]): CommandLineOptions = js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: String): CommandLineOptions = js.native
  def filterCommandLineOptionsByGroup[O /* <: CommandMetadataOption */](options: js.Array[O], parsedArgs: CommandLineOptions, groups: js.Array[String]): CommandLineOptions = js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O): String = js.native
  def formatOptionName[O /* <: CommandMetadataOption */](opt: O, hasShowAliasesShowValueSpecColors: FormatOptionNameOptions): String = js.native
  def hydrateCommandMetadataOption[O /* <: CommandMetadataOption */](option: O): HydratedCommandMetadataOption[O] = js.native
  def hydrateOptionSpec[O /* <: CommandMetadataOption */](opt: O): HydratedOptionSpec = js.native
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
}

