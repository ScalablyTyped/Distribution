package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sdk/base64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def decode(data: String): String = js.native
  def decode(data: String, charset: String): String = js.native
  def encode(data: String): String = js.native
  def encode(data: String, charset: String): String = js.native
}

