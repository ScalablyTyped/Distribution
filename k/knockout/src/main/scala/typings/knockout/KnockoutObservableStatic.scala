package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableStatic extends js.Object {
  var fn: KnockoutObservableFunctions[_] = js.native
  def apply[T](): KnockoutObservable[T | Null] = js.native
  def apply[T](value: T): KnockoutObservable[T] = js.native
}

