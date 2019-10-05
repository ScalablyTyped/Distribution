package typings.iltorb.iltorbMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iltorb", "compress")
@js.native
object compress extends js.Object {
  def apply(buffer: Buffer): js.Promise[Buffer] = js.native
  def apply(buffer: Buffer, callback: IltorbCallback): Unit = js.native
  def apply(buffer: Buffer, options: BrotliEncodeParams): js.Promise[Buffer] = js.native
  def apply(buffer: Buffer, options: BrotliEncodeParams, callback: IltorbCallback): Unit = js.native
}

