package typings.jpegDashJs.jpegDashJsMod

import typings.jpegDashJs.jpegDashJsNumbers.`false`
import typings.jpegDashJs.jpegDashJsNumbers.`true`
import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(jpegData: ArrayBuffer): RawImageData[Buffer] = js.native
  def decode(jpegData: ArrayBuffer, useTypedArray: Boolean): RawImageData[Uint8Array | Buffer] = js.native
  def decode(jpegData: ArrayLike[Double]): RawImageData[Buffer] = js.native
  def decode(jpegData: ArrayLike[Double], useTypedArray: Boolean): RawImageData[Uint8Array | Buffer] = js.native
  def decode(jpegData: Iterable[Double]): RawImageData[Buffer] = js.native
  def decode(jpegData: Iterable[Double], useTypedArray: Boolean): RawImageData[Uint8Array | Buffer] = js.native
  @JSName("decode")
  def decode_false(jpegData: ArrayBuffer, useTypedArray: `false`): RawImageData[Buffer] = js.native
  @JSName("decode")
  def decode_false(jpegData: ArrayLike[Double], useTypedArray: `false`): RawImageData[Buffer] = js.native
  @JSName("decode")
  def decode_false(jpegData: Iterable[Double], useTypedArray: `false`): RawImageData[Buffer] = js.native
  @JSName("decode")
  def decode_true(jpegData: ArrayBuffer, useTypedArray: `true`): RawImageData[Uint8Array] = js.native
  @JSName("decode")
  def decode_true(jpegData: ArrayLike[Double], useTypedArray: `true`): RawImageData[Uint8Array] = js.native
  @JSName("decode")
  def decode_true(jpegData: Iterable[Double], useTypedArray: `true`): RawImageData[Uint8Array] = js.native
  def encode(imgData: RawImageData[Uint8Array | Buffer]): RawImageData[Buffer] = js.native
  def encode(imgData: RawImageData[Uint8Array | Buffer], qu: Double): RawImageData[Buffer] = js.native
}

