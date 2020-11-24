package typings.iconvLite

import typings.node.Buffer
import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("iconv-lite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(buffer: Buffer, encoding: String): String = js.native
  def decode(buffer: Buffer, encoding: String, options: Options): String = js.native
  
  def decodeStream(encoding: String): ReadWriteStream = js.native
  def decodeStream(encoding: String, options: Options): ReadWriteStream = js.native
  
  def encode(content: String, encoding: String): Buffer = js.native
  def encode(content: String, encoding: String, options: Options): Buffer = js.native
  
  def encodeStream(encoding: String): ReadWriteStream = js.native
  def encodeStream(encoding: String, options: Options): ReadWriteStream = js.native
  
  def encodingExists(encoding: String): Boolean = js.native
  
  def getDecoder(encoding: String): DecoderStream = js.native
  def getDecoder(encoding: String, options: Options): DecoderStream = js.native
  
  def getEncoder(encoding: String): EncoderStream = js.native
  def getEncoder(encoding: String, options: Options): EncoderStream = js.native
}
