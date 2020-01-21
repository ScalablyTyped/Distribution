package typings.images.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("images", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(buffer: Buffer): ImagesStatic = js.native
  def apply(buffer: Buffer, start: Double): ImagesStatic = js.native
  def apply(buffer: Buffer, start: Double, end: Double): ImagesStatic = js.native
  def apply(file: String): ImagesStatic = js.native
  def apply(image: ImagesStatic): ImagesStatic = js.native
  def apply(image: ImagesStatic, x: Double, y: Double, width: Double, height: Double): ImagesStatic = js.native
  def apply(width: Double, height: Double): ImagesStatic = js.native
}

