package typings.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lzma-native", "parseFileIndex")
@js.native
object parseFileIndex extends js.Object {
  def apply(options: FileOptions): Unit = js.native
  def apply(
    options: FileOptions,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = js.native
}

