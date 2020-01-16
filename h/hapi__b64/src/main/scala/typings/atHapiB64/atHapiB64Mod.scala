package typings.atHapiB64

import typings.atHapiB64.atHapiB64Strings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/b64", JSImport.Namespace)
@js.native
object atHapiB64Mod extends js.Object {
  @js.native
  class Decoder () extends Transform
  
  @js.native
  class Encoder () extends Transform
  
  def base64urlDecode(value: String): String = js.native
  def base64urlDecode(value: String, encoding: BufferEncoding): String = js.native
  @JSName("base64urlDecode")
  def base64urlDecode_buffer(value: String, encoding: buffer): Buffer = js.native
  def base64urlEncode(value: String): String = js.native
  def base64urlEncode(value: String, encoding: BufferEncoding): String = js.native
  def base64urlEncode(value: Buffer): String = js.native
  def base64urlEncode(value: Buffer, encoding: BufferEncoding): String = js.native
  def decode(buffer: Buffer): Buffer = js.native
  def encode(buffer: Buffer): Buffer = js.native
}

