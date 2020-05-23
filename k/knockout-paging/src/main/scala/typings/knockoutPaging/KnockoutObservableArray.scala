package typings.knockoutPaging

import typings.knockoutPaging.anon.Paged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutObservableArray[T]
  extends KnockoutObservable[js.Array[T]]
     with KnockoutObservableArrayFunctions[T] {
  def extend(requestedExtenders: Paged): KnockoutPagedObservableArray[T] = js.native
}

