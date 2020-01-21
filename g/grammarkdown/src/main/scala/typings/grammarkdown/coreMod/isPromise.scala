package typings.grammarkdown.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/core", "isPromise")
@js.native
object isPromise extends js.Object {
  def apply[T](): /* is std.Promise<T> */ Boolean = js.native
  def apply[T](value: T): /* is std.Promise<T> */ Boolean = js.native
  def apply[T](value: js.Promise[T]): /* is std.Promise<T> */ Boolean = js.native
}

