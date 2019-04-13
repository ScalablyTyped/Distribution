package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jimp", JSImport.Namespace)
@js.native
class Class protected () extends Jimp {
  // For custom constructors when using Jimp.appendConstructorOption
  def this(args: js.Any*) = this()
  def this(data: Bitmap) = this()
  def this(data: nodeLib.Buffer) = this()
  def this(image: Jimp) = this()
  // Constructors
  def this(path: java.lang.String) = this()
  def this(urlOptions: jimpLib.URLOptions) = this()
  def this(data: Bitmap, cb: jimpLib.ImageCallback[_]) = this()
  def this(data: nodeLib.Buffer, cb: jimpLib.ImageCallback[_]) = this()
  def this(image: Jimp, cb: jimpLib.ImageCallback[_]) = this()
  def this(path: java.lang.String, cb: jimpLib.ImageCallback[_]) = this()
  def this(urlOptions: jimpLib.URLOptions, cb: jimpLib.ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, background: java.lang.String) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, cb: jimpLib.ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double, background: java.lang.String, cb: jimpLib.ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double, cb: jimpLib.ImageCallback[_]) = this()
}

