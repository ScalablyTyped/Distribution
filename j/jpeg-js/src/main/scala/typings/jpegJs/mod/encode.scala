package typings.jpegJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-js", "encode")
@js.native
object encode extends js.Object {
  def apply(imgData: RawImageData[BufferLike]): BufferRet = js.native
  def apply(imgData: RawImageData[BufferLike], quality: Double): BufferRet = js.native
}

