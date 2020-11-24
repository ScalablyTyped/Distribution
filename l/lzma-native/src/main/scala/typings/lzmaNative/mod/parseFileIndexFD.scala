package typings.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lzma-native", "parseFileIndexFD")
@js.native
object parseFileIndexFD extends js.Object {
  
  def apply(fileDescriptor: Double): Unit = js.native
  def apply(
    fileDescriptor: Double,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = js.native
}
