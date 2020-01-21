package typings.imageminWebp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.imageminWebp.imageminWebpStrings.all
  - typings.imageminWebp.imageminWebpStrings.none
  - typings.imageminWebp.imageminWebpStrings.exif
  - typings.imageminWebp.imageminWebpStrings.icc
  - typings.imageminWebp.imageminWebpStrings.xmp
*/
trait Metadata extends js.Object

object Metadata {
  @scala.inline
  def all: typings.imageminWebp.imageminWebpStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exif: typings.imageminWebp.imageminWebpStrings.exif = this.cast("exif")
  @scala.inline
  def icc: typings.imageminWebp.imageminWebpStrings.icc = this.cast("icc")
  @scala.inline
  def none: typings.imageminWebp.imageminWebpStrings.none = this.cast("none")
  @scala.inline
  def xmp: typings.imageminWebp.imageminWebpStrings.xmp = this.cast("xmp")
}

