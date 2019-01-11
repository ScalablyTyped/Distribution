package typings
package atIonicCliDashFrameworkLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/options", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val parseArgs: atIonicCliDashFrameworkLib.Anon_Args = js.native
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
  def formatOptionName[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](
    opt: O,
    hasShowAliasesShowValueSpecColors: atIonicCliDashFrameworkLib.libOptionsMod.FormatOptionNameOptions
  ): java.lang.String = js.native
  def hydrateCommandMetadataOption[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](option: O): atIonicCliDashFrameworkLib.definitionsMod.HydratedCommandMetadataOption[O] = js.native
  def hydrateOptionSpec[O /* <: atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataOption */](opt: O): atIonicCliDashFrameworkLib.libOptionsMod.HydratedOptionSpec = js.native
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
}

