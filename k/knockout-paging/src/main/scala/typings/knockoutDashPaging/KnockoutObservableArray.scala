package typings.knockoutDashPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArray[T]
  extends KnockoutObservable[js.Array[T]]
     with KnockoutObservableArrayFunctions[T] {
  def extend(requestedExtenders: Anon_Paged): KnockoutPagedObservableArray[T] = js.native
}

