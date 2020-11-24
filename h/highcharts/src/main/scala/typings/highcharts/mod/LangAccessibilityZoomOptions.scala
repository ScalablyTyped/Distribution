package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangAccessibilityZoomOptions extends js.Object {
  
  var mapZoomIn: js.UndefOr[String] = js.native
  
  var mapZoomOut: js.UndefOr[String] = js.native
  
  var resetZoomButton: js.UndefOr[String] = js.native
}
object LangAccessibilityZoomOptions {
  
  @scala.inline
  def apply(): LangAccessibilityZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityZoomOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityZoomOptionsOps[Self <: LangAccessibilityZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setMapZoomIn(value: String): Self = this.set("mapZoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapZoomIn: Self = this.set("mapZoomIn", js.undefined)
    
    @scala.inline
    def setMapZoomOut(value: String): Self = this.set("mapZoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapZoomOut: Self = this.set("mapZoomOut", js.undefined)
    
    @scala.inline
    def setResetZoomButton(value: String): Self = this.set("resetZoomButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetZoomButton: Self = this.set("resetZoomButton", js.undefined)
  }
}
