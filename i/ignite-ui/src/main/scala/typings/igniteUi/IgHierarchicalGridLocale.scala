package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgHierarchicalGridLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Specifies the default tooltip applied to an expand column cell, that is currently expanded.
    *
    */
  var collapseTooltip: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the default tooltip applied to an expand column cell, that is currently collapsed.
    *
    */
  var expandTooltip: js.UndefOr[String] = js.undefined
}
object IgHierarchicalGridLocale {
  
  inline def apply(): IgHierarchicalGridLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgHierarchicalGridLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgHierarchicalGridLocale] (val x: Self) extends AnyVal {
    
    inline def setCollapseTooltip(value: String): Self = StObject.set(x, "collapseTooltip", value.asInstanceOf[js.Any])
    
    inline def setCollapseTooltipUndefined: Self = StObject.set(x, "collapseTooltip", js.undefined)
    
    inline def setExpandTooltip(value: String): Self = StObject.set(x, "expandTooltip", value.asInstanceOf[js.Any])
    
    inline def setExpandTooltipUndefined: Self = StObject.set(x, "expandTooltip", js.undefined)
  }
}
