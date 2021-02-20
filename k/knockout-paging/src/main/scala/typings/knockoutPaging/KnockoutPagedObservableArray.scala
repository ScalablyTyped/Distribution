package typings.knockoutPaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPagedObservableArray[T] extends KnockoutObservableArray[T] {
  
  def firstItemOnPage(): Double = js.native
  def firstItemOnPage(value: Double): Unit = js.native
  @JSName("firstItemOnPage")
  var firstItemOnPage_Original: KnockoutComputed[Double] = js.native
  
  def hasNextPage(): Boolean = js.native
  def hasNextPage(value: Boolean): Unit = js.native
  @JSName("hasNextPage")
  var hasNextPage_Original: KnockoutComputed[Boolean] = js.native
  
  def hasPreviousPage(): Boolean = js.native
  def hasPreviousPage(value: Boolean): Unit = js.native
  @JSName("hasPreviousPage")
  var hasPreviousPage_Original: KnockoutComputed[Boolean] = js.native
  
  def isFirstPage(): Boolean = js.native
  def isFirstPage(value: Boolean): Unit = js.native
  @JSName("isFirstPage")
  var isFirstPage_Original: KnockoutComputed[Boolean] = js.native
  
  def isLastPage(): Boolean = js.native
  def isLastPage(value: Boolean): Unit = js.native
  @JSName("isLastPage")
  var isLastPage_Original: KnockoutComputed[Boolean] = js.native
  
  def itemCount(): Double = js.native
  def itemCount(value: Double): Unit = js.native
  @JSName("itemCount")
  var itemCount_Original: KnockoutComputed[Double] = js.native
  
  def lastItemOnPage(): Double = js.native
  def lastItemOnPage(value: Double): Unit = js.native
  @JSName("lastItemOnPage")
  var lastItemOnPage_Original: KnockoutComputed[Double] = js.native
  
  def pageCount(): Double = js.native
  def pageCount(value: Double): Unit = js.native
  @JSName("pageCount")
  var pageCount_Original: KnockoutComputed[Double] = js.native
  
  def pageItems(): js.Array[T] = js.native
  def pageItems(value: js.Array[T]): Unit = js.native
  @JSName("pageItems")
  var pageItems_Original: KnockoutComputed[js.Array[T]] = js.native
  
  def pageNumber(): Double = js.native
  def pageNumber(value: Double): Unit = js.native
  @JSName("pageNumber")
  var pageNumber_Original: KnockoutObservable[Double] = js.native
  
  def pageSize(): Double = js.native
  def pageSize(value: Double): Unit = js.native
  @JSName("pageSize")
  var pageSize_Original: KnockoutObservable[Double] = js.native
  
  def pages(): js.Array[Double] = js.native
  def pages(value: js.Array[Double]): Unit = js.native
  @JSName("pages")
  var pages_Original: KnockoutComputed[js.Array[Double]] = js.native
  
  def toFirstPage(): Unit = js.native
  
  def toLastPage(): Unit = js.native
  
  def toNextPage(): Unit = js.native
  
  def toPreviousPage(): Unit = js.native
}
