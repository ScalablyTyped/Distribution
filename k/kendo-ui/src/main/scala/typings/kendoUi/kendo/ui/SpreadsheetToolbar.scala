package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpreadsheetToolbar extends js.Object {
  
  var data: js.UndefOr[Boolean | js.Any] = js.native
  
  var home: js.UndefOr[Boolean | js.Any] = js.native
  
  var insert: js.UndefOr[Boolean | js.Any] = js.native
}
object SpreadsheetToolbar {
  
  @scala.inline
  def apply(): SpreadsheetToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpreadsheetToolbar]
  }
  
  @scala.inline
  implicit class SpreadsheetToolbarOps[Self <: SpreadsheetToolbar] (val x: Self) extends AnyVal {
    
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
    def setData(value: Boolean | js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setHome(value: Boolean | js.Any): Self = this.set("home", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHome: Self = this.set("home", js.undefined)
    
    @scala.inline
    def setInsert(value: Boolean | js.Any): Self = this.set("insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsert: Self = this.set("insert", js.undefined)
  }
}
