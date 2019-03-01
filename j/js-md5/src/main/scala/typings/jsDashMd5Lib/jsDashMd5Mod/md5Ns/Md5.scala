package typings
package jsDashMd5Lib.jsDashMd5Mod.md5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Md5 extends js.Object {
  def array(): js.Array[scala.Double]
  def arrayBuffer(): stdLib.ArrayBuffer
  def base64(): java.lang.String
  def buffer(): stdLib.ArrayBuffer
  def digest(): js.Array[scala.Double]
  def hex(): java.lang.String
  def update(message: message): Md5
}

@js.native
trait md5 extends js.Object {
  def apply(message: message): java.lang.String = js.native
  def array(message: message): js.Array[scala.Double] = js.native
  def arrayBuffer(message: message): stdLib.ArrayBuffer = js.native
  def base64(message: message): java.lang.String = js.native
  def buffer(message: message): stdLib.ArrayBuffer = js.native
  def create(): Md5 = js.native
  def digest(message: message): js.Array[scala.Double] = js.native
  def hex(message: message): java.lang.String = js.native
  def update(message: message): Md5 = js.native
}

object Md5 {
  @scala.inline
  def apply(
    array: js.Function0[js.Array[scala.Double]],
    arrayBuffer: js.Function0[stdLib.ArrayBuffer],
    base64: js.Function0[java.lang.String],
    buffer: js.Function0[stdLib.ArrayBuffer],
    digest: js.Function0[js.Array[scala.Double]],
    hex: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String],
    update: js.Function1[message, Md5]
  ): Md5 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array)
    __obj.updateDynamic("arrayBuffer")(arrayBuffer)
    __obj.updateDynamic("base64")(base64)
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("digest")(digest)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("toString")(toString)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Md5]
  }
}

