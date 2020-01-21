package typings.iltorb.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iltorb", "compressSync")
@js.native
object compressSync extends js.Object {
  def apply(buffer: Buffer): Buffer = js.native
  def apply(buffer: Buffer, options: BrotliEncodeParams): Buffer = js.native
}

