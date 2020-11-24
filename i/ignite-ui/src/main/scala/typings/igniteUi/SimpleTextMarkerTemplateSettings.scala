package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleTextMarkerTemplateSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderThickness: js.UndefOr[Double] = js.native
  
  var font: js.UndefOr[js.Any] = js.native
  
  var getText: js.UndefOr[js.Any] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object SimpleTextMarkerTemplateSettings {
  
  @scala.inline
  def apply(): SimpleTextMarkerTemplateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleTextMarkerTemplateSettings]
  }
  
  @scala.inline
  implicit class SimpleTextMarkerTemplateSettingsOps[Self <: SimpleTextMarkerTemplateSettings] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderThickness(value: Double): Self = this.set("borderThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderThickness: Self = this.set("borderThickness", js.undefined)
    
    @scala.inline
    def setFont(value: js.Any): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setGetText(value: js.Any): Self = this.set("getText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetText: Self = this.set("getText", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
