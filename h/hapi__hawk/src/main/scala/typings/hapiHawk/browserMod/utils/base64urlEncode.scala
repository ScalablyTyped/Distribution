package typings.hapiHawk.browserMod.utils

import typings.node.Buffer
import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/hawk/lib/browser", "utils.base64urlEncode")
@js.native
object base64urlEncode extends js.Object {
  def apply(value: String): String = js.native
  def apply(value: String, encoding: BufferEncoding): String = js.native
  def apply(value: Buffer): String = js.native
  def apply(value: Buffer, encoding: BufferEncoding): String = js.native
}

