package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPagedObservableArray[T] extends KnockoutObservableArray[T] {
  var firstItemOnPage: KnockoutComputed[scala.Double] = js.native
  var hasNextPage: KnockoutComputed[scala.Boolean] = js.native
  var hasPreviousPage: KnockoutComputed[scala.Boolean] = js.native
  var isFirstPage: KnockoutComputed[scala.Boolean] = js.native
  var isLastPage: KnockoutComputed[scala.Boolean] = js.native
  var itemCount: KnockoutComputed[scala.Double] = js.native
  var lastItemOnPage: KnockoutComputed[scala.Double] = js.native
  var pageCount: KnockoutComputed[scala.Double] = js.native
  var pageItems: KnockoutComputed[js.Array[T]] = js.native
  @JSName("pageNumber")
  var pageNumber_Original: KnockoutObservable[scala.Double] = js.native
  @JSName("pageSize")
  var pageSize_Original: KnockoutObservable[scala.Double] = js.native
  var pages: KnockoutComputed[js.Array[scala.Double]] = js.native
  def pageNumber(): scala.Double = js.native
  def pageNumber(value: scala.Double): scala.Unit = js.native
  def pageSize(): scala.Double = js.native
  def pageSize(value: scala.Double): scala.Unit = js.native
  def toFirstPage(): scala.Unit = js.native
  def toLastPage(): scala.Unit = js.native
  def toNextPage(): scala.Unit = js.native
  def toPreviousPage(): scala.Unit = js.native
}

