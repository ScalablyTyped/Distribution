package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollViewMessages extends StObject {
  
  var nextButtonLabel: js.UndefOr[String] = js.undefined
  
  var pagerLabel: js.UndefOr[String] = js.undefined
  
  var previousButtonLabel: js.UndefOr[String] = js.undefined
}
object ScrollViewMessages {
  
  inline def apply(): ScrollViewMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollViewMessages]
  }
  
  extension [Self <: ScrollViewMessages](x: Self) {
    
    inline def setNextButtonLabel(value: String): Self = StObject.set(x, "nextButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setNextButtonLabelUndefined: Self = StObject.set(x, "nextButtonLabel", js.undefined)
    
    inline def setPagerLabel(value: String): Self = StObject.set(x, "pagerLabel", value.asInstanceOf[js.Any])
    
    inline def setPagerLabelUndefined: Self = StObject.set(x, "pagerLabel", js.undefined)
    
    inline def setPreviousButtonLabel(value: String): Self = StObject.set(x, "previousButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setPreviousButtonLabelUndefined: Self = StObject.set(x, "previousButtonLabel", js.undefined)
  }
}
