package typings.ionicCliFramework.libMod

import typings.ionicCliFramework.optionsMod.UnparseArgsOptions
import typings.minimist.mod.Opts
import typings.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib", "unparseArgs")
@js.native
object unparseArgs extends js.Object {
  def apply(parsedArgs: ParsedArgs): js.Array[String] = js.native
  def apply(parsedArgs: ParsedArgs, hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions): js.Array[String] = js.native
  def apply(
    parsedArgs: ParsedArgs,
    hasUseDoubleQuotesUseEqualsIgnoreFalseAllowCamelCase: UnparseArgsOptions,
    parseArgsOptions: Opts
  ): js.Array[String] = js.native
}

