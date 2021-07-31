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
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets collapse button title.
    *
    */
  var collapseButtonTitle: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets/Sets expand button title.
    *
    */
  var expandButtonTitle: js.UndefOr[js.Any] = js.undefined
}
object IgToolbarLocale {
  
  @scala.inline
  def apply(): IgToolbarLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgToolbarLocale]
  }
  
  @scala.inline
  implicit class IgToolbarLocaleMutableBuilder[Self <: IgToolbarLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapseButtonTitle(value: js.Any): Self = StObject.set(x, "collapseButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseButtonTitleUndefined: Self = StObject.set(x, "collapseButtonTitle", js.undefined)
    
    @scala.inline
    def setExpandButtonTitle(value: js.Any): Self = StObject.set(x, "expandButtonTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandButtonTitleUndefined: Self = StObject.set(x, "expandButtonTitle", js.undefined)
  }
}
