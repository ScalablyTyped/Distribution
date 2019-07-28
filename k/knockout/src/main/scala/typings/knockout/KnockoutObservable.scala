package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservable[T] extends KnockoutReadonlyObservable[T] {
  def apply(value: T): Unit = js.native
}

