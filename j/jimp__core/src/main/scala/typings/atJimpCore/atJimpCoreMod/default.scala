package typings.atJimpCore.atJimpCoreMod

import typings.atJimpCore.typesEtcMod.Bitmap
import typings.atJimpCore.typesEtcMod.ImageCallback
import typings.atJimpCore.typesEtcMod.URLOptions
import typings.atJimpCore.typesJimpMod.Jimp
import typings.atJimpCore.typesJimpMod.JimpConstructors
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/core", JSImport.Default)
@js.native
class default protected () extends JimpConstructors {
  // For custom constructors when using Jimp.appendConstructorOption
  def this(args: js.Any*) = this()
  def this(data: Bitmap) = this()
  def this(data: Buffer) = this()
  def this(image: Jimp) = this()
  def this(path: String) = this()
  def this(urlOptions: URLOptions) = this()
  def this(data: Bitmap, cb: ImageCallback[JimpConstructors]) = this()
  def this(data: Buffer, cb: ImageCallback[JimpConstructors]) = this()
  def this(image: Jimp, cb: ImageCallback[JimpConstructors]) = this()
  def this(path: String, cb: ImageCallback[JimpConstructors]) = this()
  def this(urlOptions: URLOptions, cb: ImageCallback[JimpConstructors]) = this()
  def this(w: Double, h: Double) = this()
  def this(w: Double, h: Double, background: String) = this()
  def this(w: Double, h: Double, background: Double) = this()
  def this(w: Double, h: Double, cb: ImageCallback[JimpConstructors]) = this()
  def this(w: Double, h: Double, background: String, cb: ImageCallback[JimpConstructors]) = this()
  def this(w: Double, h: Double, background: Double, cb: ImageCallback[JimpConstructors]) = this()
}

