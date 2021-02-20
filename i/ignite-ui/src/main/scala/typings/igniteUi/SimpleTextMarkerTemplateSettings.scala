package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class SimpleTextMarkerTemplateSettingsMutableBuilder[Self <: SimpleTextMarkerTemplateSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setBorderThickness(value: Double): Self = StObject.set(x, "borderThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderThicknessUndefined: Self = StObject.set(x, "borderThickness", js.undefined)
    
    @scala.inline
    def setFont(value: js.Any): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setGetText(value: js.Any): Self = StObject.set(x, "getText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTextUndefined: Self = StObject.set(x, "getText", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
