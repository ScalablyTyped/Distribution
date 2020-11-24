package typings.jsreportReports.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportsOptions extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var public: js.UndefOr[Boolean] = js.native
  
  var save: js.UndefOr[Boolean] = js.native
}
object ReportsOptions {
  
  @scala.inline
  def apply(): ReportsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportsOptions]
  }
  
  @scala.inline
  implicit class ReportsOptionsOps[Self <: ReportsOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
    
    @scala.inline
    def setSave(value: Boolean): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
  }
}
