package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgPopoverHeaderTemplate
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Controls whether the popover renders a functional close button
    */
  var closeButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the content for the popover header
    */
  var title: js.UndefOr[String] = js.undefined
}
object IgPopoverHeaderTemplate {
  
  inline def apply(): IgPopoverHeaderTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPopoverHeaderTemplate]
  }
  
  extension [Self <: IgPopoverHeaderTemplate](x: Self) {
    
    inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
    
    inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
