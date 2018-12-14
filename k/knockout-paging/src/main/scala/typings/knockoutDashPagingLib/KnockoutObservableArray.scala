package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(knockoutDashPagingLib.KnockoutObservableArrayFunctions because Already inherited // Ko specific
/ * key * / org.scalablytyped.runtime.StringDictionary[knockoutDashPagingLib.KnockoutBindingHandler])*/
@js.native
trait KnockoutObservableArray[T]
  extends KnockoutObservable[js.Array[T]] {
  def extend(requestedExtenders: Anon_Paged): KnockoutPagedObservableArray[T] = js.native
}

