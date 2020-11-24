package typings.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutPagedOptions extends js.Object {
  
  var pageGenerator: js.UndefOr[String] = js.native
  
  var pageNumber: js.UndefOr[Double] = js.native
  
  var pageSize: js.UndefOr[Double] = js.native
}
object KnockoutPagedOptions {
  
  @scala.inline
  def apply(): KnockoutPagedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutPagedOptions]
  }
  
  @scala.inline
  implicit class KnockoutPagedOptionsOps[Self <: KnockoutPagedOptions] (val x: Self) extends AnyVal {
    
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
    def setPageGenerator(value: String): Self = this.set("pageGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageGenerator: Self = this.set("pageGenerator", js.undefined)
    
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageNumber: Self = this.set("pageNumber", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
  }
}
