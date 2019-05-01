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
  def this(urlOptions: URLOptions) = this()
  def this(data: Bitmap, cb: ImageCallback[_]) = this()
  def this(data: nodeLib.Buffer, cb: ImageCallback[_]) = this()
  def this(image: Jimp, cb: ImageCallback[_]) = this()
  def this(path: java.lang.String, cb: ImageCallback[_]) = this()
  def this(urlOptions: URLOptions, cb: ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, background: java.lang.String) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double) = this()
  def this(w: scala.Double, h: scala.Double, cb: ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double, background: java.lang.String, cb: ImageCallback[_]) = this()
  def this(w: scala.Double, h: scala.Double, background: scala.Double, cb: ImageCallback[_]) = this()
}

