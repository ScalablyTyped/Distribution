package typings.imageDashSize.imageDashSizeMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("image-size", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(pathOrBuffer: String): ImageInfo = js.native
  def apply(pathOrBuffer: Buffer): ImageInfo = js.native
  def apply(path: String, callback: js.Function2[/* err */ Error, /* dimensions */ ImageInfo, Unit]): Unit = js.native
}

