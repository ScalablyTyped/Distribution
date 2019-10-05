package typings.iltorb.iltorbMod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iltorb", "compressStream")
@js.native
object compressStream extends js.Object {
  def apply(): Transform with BrotliFlushable = js.native
  def apply(options: BrotliEncodeParams): Transform with BrotliFlushable = js.native
}

