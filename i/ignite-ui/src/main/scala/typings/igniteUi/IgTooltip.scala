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
/* optionName */ StringDictionary[js.Any] {
  
  var arrowLocation: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object IgTooltip {
  
  @scala.inline
  def apply(): IgTooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTooltip]
  }
  
  @scala.inline
  implicit class IgTooltipMutableBuilder[Self <: IgTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrowLocation(value: String): Self = StObject.set(x, "arrowLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrowLocationUndefined: Self = StObject.set(x, "arrowLocation", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
