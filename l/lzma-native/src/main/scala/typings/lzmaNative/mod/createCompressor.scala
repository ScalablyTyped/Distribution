package typings.lzmaNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lzma-native", "createCompressor")
@js.native
object createCompressor extends js.Object {
  def apply(): JSLzmaStream = js.native
  def apply(options: LzmaOptions): JSLzmaStream = js.native
}

