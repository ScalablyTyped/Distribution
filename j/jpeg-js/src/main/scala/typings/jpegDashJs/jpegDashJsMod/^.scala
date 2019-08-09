package typings.jpegDashJs.jpegDashJsMod

import typings.jpegDashJs.Anon_ColorTransform
import typings.jpegDashJs.Anon_ColorTransformFalse
import typings.jpegDashJs.jpegDashJsNumbers.`false`
import typings.jpegDashJs.jpegDashJsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(jpegData: BufferLike): BufferRet = js.native
  def decode(jpegData: BufferLike, opts: Anon_ColorTransform): UintArrRet = js.native
  def decode(jpegData: BufferLike, opts: Anon_ColorTransformFalse): BufferRet = js.native
  @JSName("decode")
  def decode_false(jpegData: BufferLike, opts: `false`): BufferRet = js.native
  @JSName("decode")
  def decode_true(jpegData: BufferLike, opts: `true`): UintArrRet = js.native
  def encode(imgData: RawImageData[BufferLike]): BufferRet = js.native
  def encode(imgData: RawImageData[BufferLike], quality: Double): BufferRet = js.native
}

