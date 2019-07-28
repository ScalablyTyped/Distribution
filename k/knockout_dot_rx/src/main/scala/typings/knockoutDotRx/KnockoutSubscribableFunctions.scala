package typings.knockoutDotRx

import typings.knockoutDotRx.RxNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  def toObservable(): Observable[T] = js.native
  def toObservable(event: String): Observable[T] = js.native
  @JSName("toObservable")
  def toObservable_TEvent[TEvent](event: String): Observable[TEvent] = js.native
}

