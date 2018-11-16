package typings
package jsDashSha512Lib.jsDashSha512Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashStatic extends js.Object {
  @JSName("hmac")
  var hmac_Original: HmacStatic = js.native
  def apply(messageToHash: java.lang.String): java.lang.String = js.native
  def array(messageToHash: java.lang.String): js.Array[scala.Double] = js.native
  def arrayBuffer(messageToHash: java.lang.String): stdLib.ArrayBuffer = js.native
  def create(): Hash = js.native
  def digest(messageToHash: java.lang.String): js.Array[scala.Double] = js.native
  def hex(messageToHash: java.lang.String): java.lang.String = js.native
  def hmac(key: java.lang.String, messageToHash: java.lang.String): java.lang.String = js.native
  def update(messageToHash: java.lang.String): Hash = js.native
}

