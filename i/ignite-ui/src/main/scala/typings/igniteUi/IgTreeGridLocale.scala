package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeGridLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Specifies the collapse indicator tooltip text.
    *
    */
  var collapseTooltipText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the expansion indicator tooltip text.
    *
    */
  var expandTooltipText: js.UndefOr[String] = js.undefined
}
object IgTreeGridLocale {
  
  inline def apply(): IgTreeGridLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeGridLocale]
  }
  
  extension [Self <: IgTreeGridLocale](x: Self) {
    
    inline def setCollapseTooltipText(value: String): Self = StObject.set(x, "collapseTooltipText", value.asInstanceOf[js.Any])
    
    inline def setCollapseTooltipTextUndefined: Self = StObject.set(x, "collapseTooltipText", js.undefined)
    
    inline def setExpandTooltipText(value: String): Self = StObject.set(x, "expandTooltipText", value.asInstanceOf[js.Any])
    
    inline def setExpandTooltipTextUndefined: Self = StObject.set(x, "expandTooltipText", js.undefined)
  }
}
