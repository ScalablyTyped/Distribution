package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArray[T]
  extends KnockoutObservable[js.Array[T]]
     with KnockoutObservableArrayFunctions[T] {
  @JSName("subscribe")
  def subscribe_arrayChange(
    callback: js.Function1[/* newValue */ js.Array[KnockoutArrayChange[T]], scala.Unit],
    target: js.Any,
    event: knockoutLib.knockoutLibStrings.arrayChange
  ): KnockoutSubscription = js.native
}

