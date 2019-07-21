package typings
package iconvLib.iconvMod

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
  def end(buffer: nodeLib.Buffer, cb: js.Function): scala.Unit = js.native
  def end(input: nodeLib.Buffer): scala.Unit = js.native
  def end(input: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
  def end(str: java.lang.String, cb: js.Function): scala.Unit = js.native
  def end(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Unit = js.native
  // copy from stream.Stream
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  def pipe[T /* <: nodeLib.NodeJSNs.WritableStream */](destination: T, options: iconvLib.Anon_End): T = js.native
  def write(buffer: java.lang.String, cb: js.Function): scala.Boolean = js.native
  def write(buffer: nodeLib.Buffer, cb: js.Function): scala.Boolean = js.native
  // copy from NodeJS.WritableStream for compatibility
  def write(input: nodeLib.Buffer): scala.Boolean = js.native
  def write(input: nodeLib.Buffer, encoding: java.lang.String): scala.Boolean = js.native
  def write(str: java.lang.String, encoding: java.lang.String, cb: js.Function): scala.Boolean = js.native
}

