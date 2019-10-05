package typings.lzmaDashNative.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lzma-native", "parseFileIndexFD")
@js.native
object parseFileIndexFD extends js.Object {
  def apply(fileDescriptor: Double): Unit = js.native
  def apply(
    fileDescriptor: Double,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = js.native
}

