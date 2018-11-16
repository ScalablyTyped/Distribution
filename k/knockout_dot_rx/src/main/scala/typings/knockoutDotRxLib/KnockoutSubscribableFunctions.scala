package typings
package knockoutDotRxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSubscribableFunctions[T] extends js.Object {
  def toObservable(): knockoutDotRxLib.RxNs.Observable[T] = js.native
  def toObservable(event: java.lang.String): knockoutDotRxLib.RxNs.Observable[T] = js.native
  @JSName("toObservable")
  def toObservable_TEvent[TEvent](event: java.lang.String): knockoutDotRxLib.RxNs.Observable[TEvent] = js.native
}

