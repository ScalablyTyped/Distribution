package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgButton
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var centerLabel: js.UndefOr[Boolean] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var height: js.UndefOr[js.Any] = js.native
  
  var icons: js.UndefOr[IgButtonIcons] = js.native
  
  var labelText: js.UndefOr[String] = js.native
  
  var link: js.UndefOr[IgButtonLink] = js.native
  
  var onlyIcons: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[js.Any] = js.native
}
object IgButton {
  
  @scala.inline
  def apply(): IgButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgButton]
  }
  
  @scala.inline
  implicit class IgButtonOps[Self <: IgButton] (val x: Self) extends AnyVal {
    
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
    def setCenterLabel(value: Boolean): Self = this.set("centerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterLabel: Self = this.set("centerLabel", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIcons(value: IgButtonIcons): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setLabelText(value: String): Self = this.set("labelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelText: Self = this.set("labelText", js.undefined)
    
    @scala.inline
    def setLink(value: IgButtonLink): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setOnlyIcons(value: Boolean): Self = this.set("onlyIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyIcons: Self = this.set("onlyIcons", js.undefined)
    
    @scala.inline
    def setTitle(value: Boolean): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
