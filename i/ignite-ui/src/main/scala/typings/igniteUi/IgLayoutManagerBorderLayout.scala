package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLayoutManagerBorderLayout
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Option specifying the width of the left region, either in px or percentages
    *
    */
  var leftWidth: js.UndefOr[String] = js.native
  
  /**
    * Option specifying the width of the right region, either in px or percentages
    *
    */
  var rightWidth: js.UndefOr[String] = js.native
  
  /**
    * Option specifying whether the footer region in the border layout will be hidden or shown
    *
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  
  /**
    * Option specifying whether the header region in the border layout will be hidden or shown
    *
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  
  /**
    * Option specifying whether the left region in the border layout will be hidden or shown
    *
    */
  var showLeft: js.UndefOr[Boolean] = js.native
  
  /**
    * Option specifying whether the right region in the border layout will be hidden or shown
    *
    */
  var showRight: js.UndefOr[Boolean] = js.native
}
object IgLayoutManagerBorderLayout {
  
  @scala.inline
  def apply(): IgLayoutManagerBorderLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLayoutManagerBorderLayout]
  }
  
  @scala.inline
  implicit class IgLayoutManagerBorderLayoutMutableBuilder[Self <: IgLayoutManagerBorderLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeftWidth(value: String): Self = StObject.set(x, "leftWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftWidthUndefined: Self = StObject.set(x, "leftWidth", js.undefined)
    
    @scala.inline
    def setRightWidth(value: String): Self = StObject.set(x, "rightWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightWidthUndefined: Self = StObject.set(x, "rightWidth", js.undefined)
    
    @scala.inline
    def setShowFooter(value: Boolean): Self = StObject.set(x, "showFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFooterUndefined: Self = StObject.set(x, "showFooter", js.undefined)
    
    @scala.inline
    def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
    
    @scala.inline
    def setShowLeft(value: Boolean): Self = StObject.set(x, "showLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLeftUndefined: Self = StObject.set(x, "showLeft", js.undefined)
    
    @scala.inline
    def setShowRight(value: Boolean): Self = StObject.set(x, "showRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRightUndefined: Self = StObject.set(x, "showRight", js.undefined)
  }
}
