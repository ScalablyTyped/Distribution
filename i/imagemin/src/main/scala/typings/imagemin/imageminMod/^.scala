package typings.imagemin.imageminMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imagemin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: js.Array[String]): js.Promise[js.Array[Result]] = js.native
  def apply(input: js.Array[String], options: Options): js.Promise[js.Array[Result]] = js.native
  def buffer(buffer: Buffer): js.Promise[Buffer] = js.native
  def buffer(buffer: Buffer, options: BufferOptions): js.Promise[Buffer] = js.native
}

