package typings.hapiB64

import typings.hapiB64.hapiB64Strings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@hapi/b64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
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
  
  @js.native
  class Decoder () extends Transform
  
  @js.native
  class Encoder () extends Transform
}
