package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObaIcon extends js.Object {
  
  /** URL to redirect to when an OBA icon is clicked. */
  var iconClickThroughUrl: js.UndefOr[String] = js.native
  
  /** URL to track click when an OBA icon is clicked. */
  var iconClickTrackingUrl: js.UndefOr[String] = js.native
  
  /** URL to track view when an OBA icon is clicked. */
  var iconViewTrackingUrl: js.UndefOr[String] = js.native
  
  /** Identifies the industry initiative that the icon supports. For example, AdChoices. */
  var program: js.UndefOr[String] = js.native
  
  /** OBA icon resource URL. Campaign Manager only supports image and JavaScript icons. Learn more */
  var resourceUrl: js.UndefOr[String] = js.native
  
  /** OBA icon size. */
  var size: js.UndefOr[Size] = js.native
  
  /** OBA icon x coordinate position. Accepted values are left or right. */
  var xPosition: js.UndefOr[String] = js.native
  
  /** OBA icon y coordinate position. Accepted values are top or bottom. */
  var yPosition: js.UndefOr[String] = js.native
}
object ObaIcon {
  
  @scala.inline
  def apply(): ObaIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObaIcon]
  }
  
  @scala.inline
  implicit class ObaIconOps[Self <: ObaIcon] (val x: Self) extends AnyVal {
    
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
    def setIconClickThroughUrl(value: String): Self = this.set("iconClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClickThroughUrl: Self = this.set("iconClickThroughUrl", js.undefined)
    
    @scala.inline
    def setIconClickTrackingUrl(value: String): Self = this.set("iconClickTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClickTrackingUrl: Self = this.set("iconClickTrackingUrl", js.undefined)
    
    @scala.inline
    def setIconViewTrackingUrl(value: String): Self = this.set("iconViewTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconViewTrackingUrl: Self = this.set("iconViewTrackingUrl", js.undefined)
    
    @scala.inline
    def setProgram(value: String): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setResourceUrl(value: String): Self = this.set("resourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceUrl: Self = this.set("resourceUrl", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setXPosition(value: String): Self = this.set("xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXPosition: Self = this.set("xPosition", js.undefined)
    
    @scala.inline
    def setYPosition(value: String): Self = this.set("yPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYPosition: Self = this.set("yPosition", js.undefined)
  }
}
