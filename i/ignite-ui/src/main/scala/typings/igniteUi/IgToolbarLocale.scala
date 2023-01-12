package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgToolbarLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets/Sets collapse button title.
    *
    */
  var collapseButtonTitle: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets/Sets expand button title.
    *
    */
  var expandButtonTitle: js.UndefOr[Any] = js.undefined
}
object IgToolbarLocale {
  
  inline def apply(): IgToolbarLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbarLocale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgToolbarLocale] (val x: Self) extends AnyVal {
    
    inline def setCollapseButtonTitle(value: Any): Self = StObject.set(x, "collapseButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setCollapseButtonTitleUndefined: Self = StObject.set(x, "collapseButtonTitle", js.undefined)
    
    inline def setExpandButtonTitle(value: Any): Self = StObject.set(x, "expandButtonTitle", value.asInstanceOf[js.Any])
    
    inline def setExpandButtonTitleUndefined: Self = StObject.set(x, "expandButtonTitle", js.undefined)
  }
}
