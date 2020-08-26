package typings.iconv.mod

import typings.iconv.anon.End
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iconv extends WritableStream {
  def convert(input: String): Buffer = js.native
  def convert(input: String, encoding: String): Buffer = js.native
  def convert(input: Buffer): Buffer = js.native
  def convert(input: Buffer, encoding: String): Buffer = js.native
  def end(buffer: Buffer, cb: js.Function): Unit = js.native
  def end(input: js.UndefOr[scala.Nothing], encoding: String): Unit = js.native
  def end(input: String, encoding: String): Unit = js.native
  def end(input: Buffer): Unit = js.native
  def end(input: Buffer, encoding: String): Unit = js.native
  def end(str: String, cb: js.Function): Unit = js.native
  def end(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Unit = js.native
  def end(str: String, encoding: String, cb: js.Function): Unit = js.native
  // copy from stream.Stream
  def pipe[T /* <: WritableStream */](destination: T): T = js.native
  def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  def write(buffer: String, cb: js.Function): Boolean = js.native
  def write(buffer: Buffer, cb: js.Function): Boolean = js.native
  def write(input: String, encoding: String): Boolean = js.native
  // copy from NodeJS.WritableStream for compatibility
  def write(input: Buffer): Boolean = js.native
  def write(input: Buffer, encoding: String): Boolean = js.native
  def write(str: String, encoding: js.UndefOr[scala.Nothing], cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
}

