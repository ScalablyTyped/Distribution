package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservable[T] extends KnockoutReadonlyObservable[T] {
  def apply(value: T): scala.Unit = js.native
}

