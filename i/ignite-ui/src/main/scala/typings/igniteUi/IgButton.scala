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
/* optionName */ StringDictionary[Any] {
  
  var centerLabel: js.UndefOr[Boolean] = js.undefined
  
  var css: js.UndefOr[Any] = js.undefined
  
  var height: js.UndefOr[Any] = js.undefined
  
  var icons: js.UndefOr[IgButtonIcons] = js.undefined
  
  var labelText: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[IgButtonLink] = js.undefined
  
  var onlyIcons: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Any] = js.undefined
}
object IgButton {
  
  inline def apply(): IgButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgButton]
  }
  
  extension [Self <: IgButton](x: Self) {
    
    inline def setCenterLabel(value: Boolean): Self = StObject.set(x, "centerLabel", value.asInstanceOf[js.Any])
    
    inline def setCenterLabelUndefined: Self = StObject.set(x, "centerLabel", js.undefined)
    
    inline def setCss(value: Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIcons(value: IgButtonIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
    
    inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
    
    inline def setLink(value: IgButtonLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setOnlyIcons(value: Boolean): Self = StObject.set(x, "onlyIcons", value.asInstanceOf[js.Any])
    
    inline def setOnlyIconsUndefined: Self = StObject.set(x, "onlyIcons", js.undefined)
    
    inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
