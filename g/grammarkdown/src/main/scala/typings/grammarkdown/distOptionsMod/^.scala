package typings.grammarkdown.distOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/options", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDefaultOptions(): CompilerOptions = js.native
  def parse[T /* <: ParsedArguments */](options: KnownOptions): js.UndefOr[T] = js.native
  def parse[T /* <: ParsedArguments */](options: KnownOptions, args: js.Array[String]): js.UndefOr[T] = js.native
  def usage(options: KnownOptions): Unit = js.native
  def usage(options: KnownOptions, margin: Double): Unit = js.native
  def usage(options: KnownOptions, margin: Double, printHeader: js.Function1[/* writer */ UsageWriter, Unit]): Unit = js.native
}

