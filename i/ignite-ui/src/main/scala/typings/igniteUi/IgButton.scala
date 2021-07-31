package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgButton
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var centerLabel: js.UndefOr[Boolean] = js.undefined
  
  var css: js.UndefOr[js.Any] = js.undefined
  
  var height: js.UndefOr[js.Any] = js.undefined
  
  var icons: js.UndefOr[IgButtonIcons] = js.undefined
  
  var labelText: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[IgButtonLink] = js.undefined
  
  var onlyIcons: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[js.Any] = js.undefined
}
object IgButton {
  
  @scala.inline
  def apply(): IgButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgButton]
  }
  
  @scala.inline
  implicit class IgButtonMutableBuilder[Self <: IgButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenterLabel(value: Boolean): Self = StObject.set(x, "centerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterLabelUndefined: Self = StObject.set(x, "centerLabel", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIcons(value: IgButtonIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
    
    @scala.inline
    def setLink(value: IgButtonLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setOnlyIcons(value: Boolean): Self = StObject.set(x, "onlyIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyIconsUndefined: Self = StObject.set(x, "onlyIcons", js.undefined)
    
    @scala.inline
    def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
