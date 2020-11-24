package typings.listJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOptions extends js.Object {
  
  var fuzzySearch: js.UndefOr[FuzzySearchOptions] = js.native
  
  var i: js.UndefOr[Double] = js.native
  
  var indexAsync: js.UndefOr[Boolean] = js.native
  
  var item: js.UndefOr[String] = js.native
  
  var listClass: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var pagination: js.UndefOr[Boolean] = js.native
  
  var searchClass: js.UndefOr[String] = js.native
  
  var sortClass: js.UndefOr[String] = js.native
  
  var valueNames: js.UndefOr[js.Array[String]] = js.native
}
object ListOptions {
  
  @scala.inline
  def apply(): ListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions]
  }
  
  @scala.inline
  implicit class ListOptionsOps[Self <: ListOptions] (val x: Self) extends AnyVal {
    
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
    def setFuzzySearch(value: FuzzySearchOptions): Self = this.set("fuzzySearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFuzzySearch: Self = this.set("fuzzySearch", js.undefined)
    
    @scala.inline
    def setI(value: Double): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    
    @scala.inline
    def setIndexAsync(value: Boolean): Self = this.set("indexAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexAsync: Self = this.set("indexAsync", js.undefined)
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setListClass(value: String): Self = this.set("listClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListClass: Self = this.set("listClass", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setPagination(value: Boolean): Self = this.set("pagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    
    @scala.inline
    def setSearchClass(value: String): Self = this.set("searchClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchClass: Self = this.set("searchClass", js.undefined)
    
    @scala.inline
    def setSortClass(value: String): Self = this.set("sortClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortClass: Self = this.set("sortClass", js.undefined)
    
    @scala.inline
    def setValueNamesVarargs(value: String*): Self = this.set("valueNames", js.Array(value :_*))
    
    @scala.inline
    def setValueNames(value: js.Array[String]): Self = this.set("valueNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueNames: Self = this.set("valueNames", js.undefined)
  }
}
