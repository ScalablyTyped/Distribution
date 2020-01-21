package typings.jpegJs.mod

import typings.jpegJs.AnonColorTransform
import typings.jpegJs.AnonColorTransformFalse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-js", "decode")
@js.native
object decode extends js.Object {
  def apply(jpegData: BufferLike): BufferRet = js.native
  def apply(jpegData: BufferLike, opts: AnonColorTransform): UintArrRet = js.native
  def apply(jpegData: BufferLike, opts: AnonColorTransformFalse): BufferRet = js.native
}

