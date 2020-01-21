package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback[U, T] extends js.Object {
  def _write(chunk: T, encoding: String, callback: js.Function): Unit = js.native
  def end(): Unit = js.native
  def end(chunk: T): Unit = js.native
  def end(chunk: T, cb: js.Function): Unit = js.native
  def end(chunk: T, encoding: js.Any): Unit = js.native
  def end(chunk: T, encoding: js.Any, cb: js.Function): Unit = js.native
  def read(): U = js.native
  def read(size: Double): U = js.native
  def write(chunk: T): Boolean = js.native
  def write(chunk: T, cb: js.Function): Boolean = js.native
  def write(chunk: T, encoding: js.Any): Boolean = js.native
  def write(chunk: T, encoding: js.Any, cb: js.Function): Boolean = js.native
}

