package typings.lzmaDashNative.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lzma-native", "createStream")
@js.native
object createStream extends js.Object {
  def apply(coder: Coders): JSLzmaStream = js.native
  def apply(coder: Coders, options: LzmaOptions): JSLzmaStream = js.native
}

