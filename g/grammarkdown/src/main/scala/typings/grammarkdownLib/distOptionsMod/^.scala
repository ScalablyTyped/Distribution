package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/options", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDefaultOptions(): grammarkdownLib.distOptionsMod.CompilerOptions = js.native
  def parse[T /* <: grammarkdownLib.distOptionsMod.ParsedArguments */](options: grammarkdownLib.distOptionsMod.KnownOptions): js.UndefOr[T] = js.native
  def parse[T /* <: grammarkdownLib.distOptionsMod.ParsedArguments */](options: grammarkdownLib.distOptionsMod.KnownOptions, args: js.Array[java.lang.String]): js.UndefOr[T] = js.native
  def usage(options: grammarkdownLib.distOptionsMod.KnownOptions): scala.Unit = js.native
  def usage(options: grammarkdownLib.distOptionsMod.KnownOptions, margin: scala.Double): scala.Unit = js.native
  def usage(
    options: grammarkdownLib.distOptionsMod.KnownOptions,
    margin: scala.Double,
    printHeader: js.Function1[/* writer */ grammarkdownLib.distOptionsMod.UsageWriter, scala.Unit]
  ): scala.Unit = js.native
}

