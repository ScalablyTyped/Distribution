package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorLineColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var connectorLineColor: js.UndefOr[String] = js.undefined
  
  var disabledTextColor: js.UndefOr[String] = js.undefined
  
  var hoverBackgroundColor: js.UndefOr[String] = js.undefined
  
  var hoveredIconColor: js.UndefOr[String] = js.undefined
  
  var iconColor: js.UndefOr[String] = js.undefined
  
  var inactiveIconColor: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object ConnectorLineColor {
  
  inline def apply(): ConnectorLineColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorLineColor]
  }
  
  extension [Self <: ConnectorLineColor](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setConnectorLineColor(value: String): Self = StObject.set(x, "connectorLineColor", value.asInstanceOf[js.Any])
    
    inline def setConnectorLineColorUndefined: Self = StObject.set(x, "connectorLineColor", js.undefined)
    
    inline def setDisabledTextColor(value: String): Self = StObject.set(x, "disabledTextColor", value.asInstanceOf[js.Any])
    
    inline def setDisabledTextColorUndefined: Self = StObject.set(x, "disabledTextColor", js.undefined)
    
    inline def setHoverBackgroundColor(value: String): Self = StObject.set(x, "hoverBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHoverBackgroundColorUndefined: Self = StObject.set(x, "hoverBackgroundColor", js.undefined)
    
    inline def setHoveredIconColor(value: String): Self = StObject.set(x, "hoveredIconColor", value.asInstanceOf[js.Any])
    
    inline def setHoveredIconColorUndefined: Self = StObject.set(x, "hoveredIconColor", js.undefined)
    
    inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    inline def setInactiveIconColor(value: String): Self = StObject.set(x, "inactiveIconColor", value.asInstanceOf[js.Any])
    
    inline def setInactiveIconColorUndefined: Self = StObject.set(x, "inactiveIconColor", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
