package typings.lucasmogariReactPagination.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseNavigationPayload extends js.Object {
  
  var arrows: Boolean = js.native
  
  var fromItem: Double = js.native
  
  def getPageItem(pageIndex: Double): PageItem = js.native
  
  def goTo(page: Page): Unit = js.native
  
  var itemsPerPage: Double = js.native
  
  var maxPageItems: Double = js.native
  
  def next(): Unit = js.native
  
  var numbers: Boolean = js.native
  
  var page: Double = js.native
  
  def previous(): Unit = js.native
  
  def setMaxPageItems(maxPageItems: Double): Unit = js.native
  
  def setTotalItems(totalItem: Double): Unit = js.native
  
  var size: Double = js.native
  
  var toItem: Double = js.native
  
  var totalItems: Double = js.native
  
  var totalPages: Double = js.native
}
object UseNavigationPayload {
  
  @scala.inline
  def apply(
    arrows: Boolean,
    fromItem: Double,
    getPageItem: Double => PageItem,
    goTo: Page => Unit,
    itemsPerPage: Double,
    maxPageItems: Double,
    next: () => Unit,
    numbers: Boolean,
    page: Double,
    previous: () => Unit,
    setMaxPageItems: Double => Unit,
    setTotalItems: Double => Unit,
    size: Double,
    toItem: Double,
    totalItems: Double,
    totalPages: Double
  ): UseNavigationPayload = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], fromItem = fromItem.asInstanceOf[js.Any], getPageItem = js.Any.fromFunction1(getPageItem), goTo = js.Any.fromFunction1(goTo), itemsPerPage = itemsPerPage.asInstanceOf[js.Any], maxPageItems = maxPageItems.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), numbers = numbers.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], previous = js.Any.fromFunction0(previous), setMaxPageItems = js.Any.fromFunction1(setMaxPageItems), setTotalItems = js.Any.fromFunction1(setTotalItems), size = size.asInstanceOf[js.Any], toItem = toItem.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any], totalPages = totalPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseNavigationPayload]
  }
  
  @scala.inline
  implicit class UseNavigationPayloadOps[Self <: UseNavigationPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromItem(value: Double): Self = this.set("fromItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPageItem(value: Double => PageItem): Self = this.set("getPageItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGoTo(value: Page => Unit): Self = this.set("goTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPageItems(value: Double): Self = this.set("maxPageItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumbers(value: Boolean): Self = this.set("numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetMaxPageItems(value: Double => Unit): Self = this.set("setMaxPageItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTotalItems(value: Double => Unit): Self = this.set("setTotalItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToItem(value: Double): Self = this.set("toItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
  }
}
