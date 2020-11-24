package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilityAnnounceNewDataOptions extends js.Object {
  
  var newDataAnnounce: js.UndefOr[String] = js.native
  
  var newPointAnnounceMultiple: js.UndefOr[String] = js.native
  
  var newPointAnnounceSingle: js.UndefOr[String] = js.native
  
  var newSeriesAnnounceMultiple: js.UndefOr[String] = js.native
  
  var newSeriesAnnounceSingle: js.UndefOr[String] = js.native
}
object LangAccessibilityAnnounceNewDataOptions {
  
  @scala.inline
  def apply(): LangAccessibilityAnnounceNewDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityAnnounceNewDataOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityAnnounceNewDataOptionsOps[Self <: LangAccessibilityAnnounceNewDataOptions] (val x: Self) extends AnyVal {
    
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
    def setNewDataAnnounce(value: String): Self = this.set("newDataAnnounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewDataAnnounce: Self = this.set("newDataAnnounce", js.undefined)
    
    @scala.inline
    def setNewPointAnnounceMultiple(value: String): Self = this.set("newPointAnnounceMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPointAnnounceMultiple: Self = this.set("newPointAnnounceMultiple", js.undefined)
    
    @scala.inline
    def setNewPointAnnounceSingle(value: String): Self = this.set("newPointAnnounceSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewPointAnnounceSingle: Self = this.set("newPointAnnounceSingle", js.undefined)
    
    @scala.inline
    def setNewSeriesAnnounceMultiple(value: String): Self = this.set("newSeriesAnnounceMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSeriesAnnounceMultiple: Self = this.set("newSeriesAnnounceMultiple", js.undefined)
    
    @scala.inline
    def setNewSeriesAnnounceSingle(value: String): Self = this.set("newSeriesAnnounceSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSeriesAnnounceSingle: Self = this.set("newSeriesAnnounceSingle", js.undefined)
  }
}
