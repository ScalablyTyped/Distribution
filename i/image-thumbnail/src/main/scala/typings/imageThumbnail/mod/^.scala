package typings.imageThumbnail.mod

import typings.imageThumbnail.AnonBase64
import typings.imageThumbnail.AnonBuffer
import typings.imageThumbnail.AnonUri
import typings.node.Buffer
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-thumbnail", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(src: String): js.Promise[Buffer] = js.native
  def apply(src: String, options: AnonBase64 with Options): js.Promise[String] = js.native
  def apply(src: String, options: AnonBuffer with Options): js.Promise[Buffer] = js.native
  def apply(src: AnonUri): js.Promise[Buffer] = js.native
  def apply(src: AnonUri, options: AnonBase64 with Options): js.Promise[String] = js.native
  def apply(src: AnonUri, options: AnonBuffer with Options): js.Promise[Buffer] = js.native
  def apply(src: Buffer): js.Promise[Buffer] = js.native
  def apply(src: Buffer, options: AnonBase64 with Options): js.Promise[String] = js.native
  def apply(src: Buffer, options: AnonBuffer with Options): js.Promise[Buffer] = js.native
  def apply(src: ReadStream): js.Promise[Buffer] = js.native
  def apply(src: ReadStream, options: AnonBuffer with Options): js.Promise[Buffer] = js.native
  def apply(src: ReadStream, options: AnonBase64 with Options): js.Promise[String] = js.native
}

