package typings.imageThumbnail.mod

import typings.imageThumbnail.anon.Uri
import typings.imageThumbnail.anon.responseTypebase64Options
import typings.imageThumbnail.anon.responseTypebufferOptions
import typings.node.Buffer
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("image-thumbnail", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(src: String): js.Promise[Buffer] = js.native
  def apply(src: String, options: responseTypebase64Options): js.Promise[String] = js.native
  def apply(src: String, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  def apply(src: Uri): js.Promise[Buffer] = js.native
  def apply(src: Uri, options: responseTypebase64Options): js.Promise[String] = js.native
  def apply(src: Uri, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  def apply(src: Buffer): js.Promise[Buffer] = js.native
  def apply(src: Buffer, options: responseTypebase64Options): js.Promise[String] = js.native
  def apply(src: Buffer, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
  def apply(src: ReadStream): js.Promise[Buffer] = js.native
  def apply(src: ReadStream, options: responseTypebase64Options): js.Promise[String] = js.native
  def apply(src: ReadStream, options: responseTypebufferOptions): js.Promise[Buffer] = js.native
}
