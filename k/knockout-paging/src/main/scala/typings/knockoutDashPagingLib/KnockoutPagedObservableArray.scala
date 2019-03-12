package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutPagedObservableArray[T] extends KnockoutObservableArray[T] {
  @JSName("firstItemOnPage")
  var firstItemOnPage_Original: KnockoutComputed[scala.Double] = js.native
  @JSName("hasNextPage")
  var hasNextPage_Original: KnockoutComputed[scala.Boolean] = js.native
  @JSName("hasPreviousPage")
  var hasPreviousPage_Original: KnockoutComputed[scala.Boolean] = js.native
  @JSName("isFirstPage")
  var isFirstPage_Original: KnockoutComputed[scala.Boolean] = js.native
  @JSName("isLastPage")
  var isLastPage_Original: KnockoutComputed[scala.Boolean] = js.native
  @JSName("itemCount")
  var itemCount_Original: KnockoutComputed[scala.Double] = js.native
  @JSName("lastItemOnPage")
  var lastItemOnPage_Original: KnockoutComputed[scala.Double] = js.native
  @JSName("pageCount")
  var pageCount_Original: KnockoutComputed[scala.Double] = js.native
  @JSName("pageItems")
  var pageItems_Original: KnockoutComputed[js.Array[T]] = js.native
  @JSName("pageNumber")
  var pageNumber_Original: KnockoutObservable[scala.Double] = js.native
  @JSName("pageSize")
  var pageSize_Original: KnockoutObservable[scala.Double] = js.native
  @JSName("pages")
  var pages_Original: KnockoutComputed[js.Array[scala.Double]] = js.native
  def firstItemOnPage(): scala.Double = js.native
  def firstItemOnPage(value: scala.Double): scala.Unit = js.native
  def hasNextPage(): scala.Boolean = js.native
  def hasNextPage(value: scala.Boolean): scala.Unit = js.native
  def hasPreviousPage(): scala.Boolean = js.native
  def hasPreviousPage(value: scala.Boolean): scala.Unit = js.native
  def isFirstPage(): scala.Boolean = js.native
  def isFirstPage(value: scala.Boolean): scala.Unit = js.native
  def isLastPage(): scala.Boolean = js.native
  def isLastPage(value: scala.Boolean): scala.Unit = js.native
  def itemCount(): scala.Double = js.native
  def itemCount(value: scala.Double): scala.Unit = js.native
  def lastItemOnPage(): scala.Double = js.native
  def lastItemOnPage(value: scala.Double): scala.Unit = js.native
  def pageCount(): scala.Double = js.native
  def pageCount(value: scala.Double): scala.Unit = js.native
  def pageItems(): js.Array[js.Array[js.Array[js.Array[T]]]] = js.native
  def pageItems(value: js.Array[js.Array[js.Array[js.Array[T]]]]): scala.Unit = js.native
  def pageNumber(): scala.Double = js.native
  def pageNumber(value: scala.Double): scala.Unit = js.native
  def pageSize(): scala.Double = js.native
  def pageSize(value: scala.Double): scala.Unit = js.native
  def pages(): js.Array[scala.Double] = js.native
  def pages(value: js.Array[scala.Double]): scala.Unit = js.native
  def toFirstPage(): scala.Unit = js.native
  def toLastPage(): scala.Unit = js.native
  def toNextPage(): scala.Unit = js.native
  def toPreviousPage(): scala.Unit = js.native
}

