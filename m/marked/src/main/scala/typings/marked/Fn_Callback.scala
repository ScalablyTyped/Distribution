package typings.marked

import typings.marked.markedMod.MarkedOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply(src: String): String = js.native
  def apply(
    src: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
  def apply(src: String, options: MarkedOptions): String = js.native
  def apply(
    src: String,
    options: MarkedOptions,
    callback: js.Function2[/* error */ js.UndefOr[js.Any], /* parseResult */ String, Unit]
  ): String = js.native
}

