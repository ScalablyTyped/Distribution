package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTooltip
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var arrowLocation: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object IgTooltip {
  
  inline def apply(): IgTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTooltip]
  }
  
  extension [Self <: IgTooltip](x: Self) {
    
    inline def setArrowLocation(value: String): Self = StObject.set(x, "arrowLocation", value.asInstanceOf[js.Any])
    
    inline def setArrowLocationUndefined: Self = StObject.set(x, "arrowLocation", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
