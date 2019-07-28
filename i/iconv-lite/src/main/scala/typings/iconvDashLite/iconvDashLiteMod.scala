package typings.iconvDashLite

import typings.node.Buffer
import typings.node.NodeJSNs.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iconv-lite", JSImport.Namespace)
@js.native
object iconvDashLiteMod extends js.Object {
  def decode(buffer: Buffer, encoding: String): String = js.native
  def decode(buffer: Buffer, encoding: String, options: Options): String = js.native
  def decodeStream(encoding: String): ReadWriteStream = js.native
  def decodeStream(encoding: String, options: Options): ReadWriteStream = js.native
  def encode(content: String, encoding: String): Buffer = js.native
  def encode(content: String, encoding: String, options: Options): Buffer = js.native
  def encodeStream(encoding: String): ReadWriteStream = js.native
  def encodeStream(encoding: String, options: Options): ReadWriteStream = js.native
  def encodingExists(encoding: String): Boolean = js.native
}

