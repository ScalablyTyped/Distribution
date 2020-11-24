package typings.kendoUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewMessages extends js.Object {
  
  var loadMoreText: js.UndefOr[String] = js.native
  
  var pullTemplate: js.UndefOr[String] = js.native
  
  var refreshTemplate: js.UndefOr[String] = js.native
  
  var releaseTemplate: js.UndefOr[String] = js.native
}
object ListViewMessages {
  
  @scala.inline
  def apply(): ListViewMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewMessages]
  }
  
  @scala.inline
  implicit class ListViewMessagesOps[Self <: ListViewMessages] (val x: Self) extends AnyVal {
    
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
    def setLoadMoreText(value: String): Self = this.set("loadMoreText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadMoreText: Self = this.set("loadMoreText", js.undefined)
    
    @scala.inline
    def setPullTemplate(value: String): Self = this.set("pullTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullTemplate: Self = this.set("pullTemplate", js.undefined)
    
    @scala.inline
    def setRefreshTemplate(value: String): Self = this.set("refreshTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshTemplate: Self = this.set("refreshTemplate", js.undefined)
    
    @scala.inline
    def setReleaseTemplate(value: String): Self = this.set("releaseTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseTemplate: Self = this.set("releaseTemplate", js.undefined)
  }
}
