package typings.knockoutDotRx.RxNs

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subject[T] extends js.Object {
  def toKoObservable(): KnockoutObservable[T] = js.native
  def toKoObservable(initialValue: T): KnockoutObservable[T] = js.native
}

