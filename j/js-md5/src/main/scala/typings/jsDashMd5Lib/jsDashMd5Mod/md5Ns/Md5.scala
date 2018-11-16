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

