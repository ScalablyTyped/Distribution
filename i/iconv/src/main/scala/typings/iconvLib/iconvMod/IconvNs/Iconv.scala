package typings
package iconvLib.iconvMod.IconvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iconv
  extends nodeLib.NodeJSNs.WritableStream {
  def convert(input: java.lang.String): nodeLib.Buffer = js.native
  def convert(input: java.lang.String, encoding: java.lang.String): nodeLib.Buffer = js.native
  def convert(input: nodeLib.Buffer): nodeLib.Buffer = js.native
  def convert(input: nodeLib.Buffer, encoding: java.lang.String): nodeLib.Buffer = js.native
  def end(input: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
  // copy from stream.Stream
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  // copy from stream.Stream
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: iconvLib.Anon_End): T = js.native
  def write(input: nodeLib.Buffer, encoding: java.lang.String): scala.Boolean = js.native
}

