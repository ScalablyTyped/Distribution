package typings.hapiB64

import typings.hapiB64.hapiB64Strings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/b64", "Decoder")
  @js.native
  class Decoder () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("@hapi/b64", "Encoder")
  @js.native
  class Encoder () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("@hapi/b64", "base64urlDecode")
  @js.native
  def base64urlDecode(value: String): String = js.native
  @JSImport("@hapi/b64", "base64urlDecode")
  @js.native
  def base64urlDecode(value: String, encoding: BufferEncoding): String = js.native
  @JSImport("@hapi/b64", "base64urlDecode")
  @js.native
  def base64urlDecode_buffer(value: String, encoding: buffer): Buffer = js.native
  
  @JSImport("@hapi/b64", "base64urlEncode")
  @js.native
  def base64urlEncode(value: String): String = js.native
  @JSImport("@hapi/b64", "base64urlEncode")
  @js.native
  def base64urlEncode(value: String, encoding: BufferEncoding): String = js.native
  @JSImport("@hapi/b64", "base64urlEncode")
  @js.native
  def base64urlEncode(value: Buffer): String = js.native
  @JSImport("@hapi/b64", "base64urlEncode")
  @js.native
  def base64urlEncode(value: Buffer, encoding: BufferEncoding): String = js.native
  
  @JSImport("@hapi/b64", "decode")
  @js.native
  def decode(buffer: Buffer): Buffer = js.native
  
  @JSImport("@hapi/b64", "encode")
  @js.native
  def encode(buffer: Buffer): Buffer = js.native
}
