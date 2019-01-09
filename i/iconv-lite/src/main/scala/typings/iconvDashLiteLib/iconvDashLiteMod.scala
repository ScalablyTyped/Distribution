package typings
package iconvDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iconv-lite", JSImport.Namespace)
@js.native
object iconvDashLiteMod extends js.Object {
  def decode(buffer: nodeLib.Buffer, encoding: java.lang.String): java.lang.String = js.native
  def decode(buffer: nodeLib.Buffer, encoding: java.lang.String, options: iconvDashLiteLib.Options): java.lang.String = js.native
  def decodeStream(encoding: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def decodeStream(encoding: java.lang.String, options: iconvDashLiteLib.Options): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def encode(content: java.lang.String, encoding: java.lang.String): nodeLib.Buffer = js.native
  def encode(content: java.lang.String, encoding: java.lang.String, options: iconvDashLiteLib.Options): nodeLib.Buffer = js.native
  def encodeStream(encoding: java.lang.String): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def encodeStream(encoding: java.lang.String, options: iconvDashLiteLib.Options): nodeLib.NodeJSNs.ReadWriteStream = js.native
  def encodingExists(encoding: java.lang.String): scala.Boolean = js.native
}

