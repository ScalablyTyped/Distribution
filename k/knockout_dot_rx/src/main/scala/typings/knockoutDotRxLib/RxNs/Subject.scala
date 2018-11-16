package typings
package knockoutDotRxLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subject[T] extends js.Object {
  def toKoObservable(): knockoutLib.KnockoutObservable[T] = js.native
  def toKoObservable(initialValue: T): knockoutLib.KnockoutObservable[T] = js.native
}

