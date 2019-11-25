package typings.images.imagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.images.imagesStrings.png
  - typings.images.imagesStrings.jpg
  - typings.images.imagesStrings.gif
  - typings.images.imagesStrings.bmp
  - typings.images.imagesStrings.raw
  - typings.images.imagesStrings.webp
*/
trait SupportType extends js.Object

object SupportType {
  @scala.inline
  def bmp: typings.images.imagesStrings.bmp = this.cast("bmp")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gif: typings.images.imagesStrings.gif = this.cast("gif")
  @scala.inline
  def jpg: typings.images.imagesStrings.jpg = this.cast("jpg")
  @scala.inline
  def png: typings.images.imagesStrings.png = this.cast("png")
  @scala.inline
  def raw: typings.images.imagesStrings.raw = this.cast("raw")
  @scala.inline
  def webp: typings.images.imagesStrings.webp = this.cast("webp")
}

