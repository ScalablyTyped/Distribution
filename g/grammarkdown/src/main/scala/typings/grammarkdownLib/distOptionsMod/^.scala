package typings
package grammarkdownLib.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/options", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDefaultOptions(): CompilerOptions = js.native
  def parse[T /* <: ParsedArguments */](options: KnownOptions): js.UndefOr[T] = js.native
  def parse[T /* <: ParsedArguments */](options: KnownOptions, args: js.Array[java.lang.String]): js.UndefOr[T] = js.native
  def usage(options: KnownOptions): scala.Unit = js.native
  def usage(options: KnownOptions, margin: scala.Double): scala.Unit = js.native
  def usage(
    options: KnownOptions,
    margin: scala.Double,
    printHeader: js.Function1[/* writer */ UsageWriter, scala.Unit]
  ): scala.Unit = js.native
}

