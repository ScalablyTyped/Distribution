package typings.grommet.anon

import typings.grommet.utilsMod.BorderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Panel extends StObject {
  
  var border: js.UndefOr[BorderType] = js.undefined
  
  var heading: js.UndefOr[Level] = js.undefined
  
  var hover: js.UndefOr[Heading] = js.undefined
  
  var icons: js.UndefOr[Collapse] = js.undefined
  
  var panel: js.UndefOr[`4`] = js.undefined
}
object Panel {
  
  inline def apply(): Panel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Panel]
  }
  
  extension [Self <: Panel](x: Self) {
    
    inline def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setBorderVarargs(value: Error*): Self = StObject.set(x, "border", js.Array(value :_*))
    
    inline def setHeading(value: Level): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHover(value: Heading): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setIcons(value: Collapse): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setPanel(value: `4`): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
    
    inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
  }
}
