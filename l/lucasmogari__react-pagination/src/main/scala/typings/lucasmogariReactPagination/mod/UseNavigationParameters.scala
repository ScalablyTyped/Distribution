package typings.lucasmogariReactPagination.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseNavigationParameters extends js.Object {
  
  var arrows: js.UndefOr[Boolean] = js.native
  
  def getPageItemProps(parameters: js.Any*): Unit = js.native
  
  var itemsPerPage: Double = js.native
  
  var maxPageItems: js.UndefOr[Double] = js.native
  
  var numbers: js.UndefOr[Boolean] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var totalItems: Double = js.native
}
object UseNavigationParameters {
  
  @scala.inline
  def apply(getPageItemProps: /* repeated */ js.Any => Unit, itemsPerPage: Double, totalItems: Double): UseNavigationParameters = {
    val __obj = js.Dynamic.literal(getPageItemProps = js.Any.fromFunction1(getPageItemProps), itemsPerPage = itemsPerPage.asInstanceOf[js.Any], totalItems = totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseNavigationParameters]
  }
  
  @scala.inline
  implicit class UseNavigationParametersOps[Self <: UseNavigationParameters] (val x: Self) extends AnyVal {
    
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
    def setGetPageItemProps(value: /* repeated */ js.Any => Unit): Self = this.set("getPageItemProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemsPerPage(value: Double): Self = this.set("itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrows: Self = this.set("arrows", js.undefined)
    
    @scala.inline
    def setMaxPageItems(value: Double): Self = this.set("maxPageItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPageItems: Self = this.set("maxPageItems", js.undefined)
    
    @scala.inline
    def setNumbers(value: Boolean): Self = this.set("numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumbers: Self = this.set("numbers", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
}
