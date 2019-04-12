package typings
package atHapiCodeLib.atHapiCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/code", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val settings: Settings = js.native
  def count(): scala.Double = js.native
  def expect[T](value: T): AssertionChain[T] = js.native
  def expect[T](value: T, prefix: java.lang.String): AssertionChain[T] = js.native
  def expect[T](value: js.Array[T]): AssertionChain[T] = js.native
  def expect[T](value: js.Array[T], prefix: java.lang.String): AssertionChain[T] = js.native
  def fail(message: java.lang.String): scala.Unit = js.native
  def incomplete(): js.Array[java.lang.String] | scala.Null = js.native
  def thrownAt(): CodeError = js.native
  def thrownAt(error: stdLib.Error): CodeError = js.native
}

