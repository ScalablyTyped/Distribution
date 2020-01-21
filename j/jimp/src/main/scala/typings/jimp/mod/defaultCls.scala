package typings.jimp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jimp", JSImport.Default)
@js.native
class defaultCls protected () extends DepreciatedJimp {
  // For custom constructors when using Jimp.appendConstructorOption
  def this(args: js.Any*) = this()
  def this(data: Bitmap) = this()
  def this(data: Buffer) = this()
  def this(image: DepreciatedJimp) = this()
  // Constructors
  def this(path: String) = this()
  def this(urlOptions: URLOptions) = this()
  def this(data: Bitmap, cb: ImageCallback[_]) = this()
  def this(data: Buffer, cb: ImageCallback[_]) = this()
  def this(image: DepreciatedJimp, cb: ImageCallback[_]) = this()
  def this(path: String, cb: ImageCallback[_]) = this()
  def this(urlOptions: URLOptions, cb: ImageCallback[_]) = this()
  def this(w: Double, h: Double) = this()
  def this(w: Double, h: Double, background: String) = this()
  def this(w: Double, h: Double, background: Double) = this()
  def this(w: Double, h: Double, cb: ImageCallback[_]) = this()
  def this(w: Double, h: Double, background: String, cb: ImageCallback[_]) = this()
  def this(w: Double, h: Double, background: Double, cb: ImageCallback[_]) = this()
}

