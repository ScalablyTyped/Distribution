package typings.iconvLite

import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iconv-lite", "decode")
  @js.native
  def decode(buffer: Buffer, encoding: String): String = js.native
  @JSImport("iconv-lite", "decode")
  @js.native
  def decode(buffer: Buffer, encoding: String, options: Options): String = js.native
  
  @JSImport("iconv-lite", "decodeStream")
  @js.native
  def decodeStream(encoding: String): ReadWriteStream = js.native
  @JSImport("iconv-lite", "decodeStream")
  @js.native
  def decodeStream(encoding: String, options: Options): ReadWriteStream = js.native
  
  @JSImport("iconv-lite", "encode")
  @js.native
  def encode(content: String, encoding: String): Buffer = js.native
  @JSImport("iconv-lite", "encode")
  @js.native
  def encode(content: String, encoding: String, options: Options): Buffer = js.native
  
  @JSImport("iconv-lite", "encodeStream")
  @js.native
  def encodeStream(encoding: String): ReadWriteStream = js.native
  @JSImport("iconv-lite", "encodeStream")
  @js.native
  def encodeStream(encoding: String, options: Options): ReadWriteStream = js.native
  
  @JSImport("iconv-lite", "encodingExists")
  @js.native
  def encodingExists(encoding: String): Boolean = js.native
  
  @JSImport("iconv-lite", "getDecoder")
  @js.native
  def getDecoder(encoding: String): DecoderStream = js.native
  @JSImport("iconv-lite", "getDecoder")
  @js.native
  def getDecoder(encoding: String, options: Options): DecoderStream = js.native
  
  @JSImport("iconv-lite", "getEncoder")
  @js.native
  def getEncoder(encoding: String): EncoderStream = js.native
  @JSImport("iconv-lite", "getEncoder")
  @js.native
  def getEncoder(encoding: String, options: Options): EncoderStream = js.native
}
