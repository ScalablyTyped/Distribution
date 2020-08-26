package typings.jpegJs.mod

import typings.jpegJs.anon.ColorTransform
import typings.jpegJs.anon.FormatAsRGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-js", "decode")
@js.native
object decode extends js.Object {
  def apply(jpegData: BufferLike): BufferRet = js.native
  def apply(jpegData: BufferLike, opts: ColorTransform): UintArrRet = js.native
  def apply(jpegData: BufferLike, opts: FormatAsRGBA): BufferRet = js.native
}

