package typings.grammarkdown.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/options", "usage")
@js.native
object usage extends js.Object {
  def apply(options: KnownOptions): Unit = js.native
  def apply(
    options: KnownOptions,
    margin: js.UndefOr[scala.Nothing],
    printHeader: js.Function1[/* writer */ UsageWriter, Unit]
  ): Unit = js.native
  def apply(options: KnownOptions, margin: Double): Unit = js.native
  def apply(options: KnownOptions, margin: Double, printHeader: js.Function1[/* writer */ UsageWriter, Unit]): Unit = js.native
}

