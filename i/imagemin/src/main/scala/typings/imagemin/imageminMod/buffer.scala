package typings.imagemin.imageminMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemin", "buffer")
@js.native
object buffer extends js.Object {
  def apply(buffer: Buffer): js.Promise[Buffer] = js.native
  def apply(buffer: Buffer, options: BufferOptions): js.Promise[Buffer] = js.native
}

