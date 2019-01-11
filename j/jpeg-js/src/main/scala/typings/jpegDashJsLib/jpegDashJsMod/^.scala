package typings
package jpegDashJsLib.jpegDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jpeg-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(jpegData: nodeLib.Iterable[scala.Double]): jpegDashJsLib.jpegDashJsMod.RawImageData[nodeLib.Buffer] = js.native
  def decode(
    jpegData: nodeLib.Iterable[scala.Double],
    useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`false`
  ): jpegDashJsLib.jpegDashJsMod.RawImageData[nodeLib.Buffer] = js.native
  def decode(jpegData: nodeLib.Iterable[scala.Double], useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`true`): jpegDashJsLib.jpegDashJsMod.RawImageData[stdLib.Uint8Array] = js.native
  def decode(jpegData: nodeLib.Iterable[scala.Double], useTypedArray: scala.Boolean): jpegDashJsLib.jpegDashJsMod.RawImageData[stdLib.Uint8Array | nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.ArrayBuffer): jpegDashJsLib.jpegDashJsMod.RawImageData[nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.ArrayBuffer, useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`false`): jpegDashJsLib.jpegDashJsMod.RawImageData[nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.ArrayBuffer, useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`true`): jpegDashJsLib.jpegDashJsMod.RawImageData[stdLib.Uint8Array] = js.native
  def decode(jpegData: stdLib.ArrayBuffer, useTypedArray: scala.Boolean): jpegDashJsLib.jpegDashJsMod.RawImageData[stdLib.Uint8Array | nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.ArrayLike[scala.Double]): jpegDashJsLib.jpegDashJsMod.RawImageData[nodeLib.Buffer] = js.native
  def decode(
    jpegData: stdLib.ArrayLike[scala.Double],
    useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`false`
  ): jpegDashJsLib.jpegDashJsMod.RawImageData[nodeLib.Buffer] = js.native
  def decode(jpegData: stdLib.ArrayLike[scala.Double], useTypedArray: jpegDashJsLib.jpegDashJsLibNumbers.`true`): jpegDashJsLib.jpegDashJsMod.RawImageData[stdLib.Uint8Array] = js.native
  def decode(jpegData: stdLib.ArrayLike[scala.Double], useTypedArray: scala.Boolean): jpegDashJsLib.jpegDashJsMod.RawImageData[stdLib.Uint8Array | nodeLib.Buffer] = js.native
  def encode(imgData: jpegDashJsLib.jpegDashJsMod.RawImageData[stdLib.Uint8Array | nodeLib.Buffer]): jpegDashJsLib.jpegDashJsMod.RawImageData[nodeLib.Buffer] = js.native
  def encode(
    imgData: jpegDashJsLib.jpegDashJsMod.RawImageData[stdLib.Uint8Array | nodeLib.Buffer],
    qu: scala.Double
  ): jpegDashJsLib.jpegDashJsMod.RawImageData[nodeLib.Buffer] = js.native
}

