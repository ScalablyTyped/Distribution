package typings.maximMazurokGapiClientCustomsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NextPage extends js.Object {
  
  /** Metadata representing the next page of results, if applicable. */
  var nextPage: js.UndefOr[js.Array[Count]] = js.native
  
  /** Metadata representing the previous page of results, if applicable. */
  var previousPage: js.UndefOr[js.Array[Count]] = js.native
  
  /** Metadata representing the current request. */
  var request: js.UndefOr[js.Array[Count]] = js.native
}
object NextPage {
  
  @scala.inline
  def apply(): NextPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NextPage]
  }
  
  @scala.inline
  implicit class NextPageOps[Self <: NextPage] (val x: Self) extends AnyVal {
    
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
    def setNextPageVarargs(value: Count*): Self = this.set("nextPage", js.Array(value :_*))
    
    @scala.inline
    def setNextPage(value: js.Array[Count]): Self = this.set("nextPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPage: Self = this.set("nextPage", js.undefined)
    
    @scala.inline
    def setPreviousPageVarargs(value: Count*): Self = this.set("previousPage", js.Array(value :_*))
    
    @scala.inline
    def setPreviousPage(value: js.Array[Count]): Self = this.set("previousPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviousPage: Self = this.set("previousPage", js.undefined)
    
    @scala.inline
    def setRequestVarargs(value: Count*): Self = this.set("request", js.Array(value :_*))
    
    @scala.inline
    def setRequest(value: js.Array[Count]): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
}
