package typings.lzmaDashNative.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lzma-native", "createDecompressor")
@js.native
object createDecompressor extends js.Object {
  def apply(): JSLzmaStream = js.native
  def apply(options: LzmaOptions): JSLzmaStream = js.native
}

