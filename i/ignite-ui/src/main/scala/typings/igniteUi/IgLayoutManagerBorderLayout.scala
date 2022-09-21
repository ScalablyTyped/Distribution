package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgLayoutManagerBorderLayout
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Option specifying the width of the left region, either in px or percentages
    *
    */
  var leftWidth: js.UndefOr[String] = js.undefined
  
  /**
    * Option specifying the width of the right region, either in px or percentages
    *
    */
  var rightWidth: js.UndefOr[String] = js.undefined
  
  /**
    * Option specifying whether the footer region in the border layout will be hidden or shown
    *
    */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Option specifying whether the header region in the border layout will be hidden or shown
    *
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Option specifying whether the left region in the border layout will be hidden or shown
    *
    */
  var showLeft: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Option specifying whether the right region in the border layout will be hidden or shown
    *
    */
  var showRight: js.UndefOr[Boolean] = js.undefined
}
object IgLayoutManagerBorderLayout {
  
  inline def apply(): IgLayoutManagerBorderLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerBorderLayout]
  }
  
  extension [Self <: IgLayoutManagerBorderLayout](x: Self) {
    
    inline def setLeftWidth(value: String): Self = StObject.set(x, "leftWidth", value.asInstanceOf[js.Any])
    
    inline def setLeftWidthUndefined: Self = StObject.set(x, "leftWidth", js.undefined)
    
    inline def setRightWidth(value: String): Self = StObject.set(x, "rightWidth", value.asInstanceOf[js.Any])
    
    inline def setRightWidthUndefined: Self = StObject.set(x, "rightWidth", js.undefined)
    
    inline def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    inline def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
    
    inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    
    inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
    
    inline def setShowLeft(value: Boolean): Self = StObject.set(x, "showLeft", value.asInstanceOf[js.Any])
    
    inline def setShowLeftUndefined: Self = StObject.set(x, "showLeft", js.undefined)
    
    inline def setShowRight(value: Boolean): Self = StObject.set(x, "showRight", value.asInstanceOf[js.Any])
    
    inline def setShowRightUndefined: Self = StObject.set(x, "showRight", js.undefined)
  }
}
