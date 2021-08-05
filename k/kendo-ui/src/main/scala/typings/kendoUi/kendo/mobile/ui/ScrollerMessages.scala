package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollerMessages extends StObject {
  
  var pullTemplate: js.UndefOr[String] = js.undefined
  
  var refreshTemplate: js.UndefOr[String] = js.undefined
  
  var releaseTemplate: js.UndefOr[String] = js.undefined
}
object ScrollerMessages {
  
  inline def apply(): ScrollerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerMessages]
  }
  
  extension [Self <: ScrollerMessages](x: Self) {
    
    inline def setPullTemplate(value: String): Self = StObject.set(x, "pullTemplate", value.asInstanceOf[js.Any])
    
    inline def setPullTemplateUndefined: Self = StObject.set(x, "pullTemplate", js.undefined)
    
    inline def setRefreshTemplate(value: String): Self = StObject.set(x, "refreshTemplate", value.asInstanceOf[js.Any])
    
    inline def setRefreshTemplateUndefined: Self = StObject.set(x, "refreshTemplate", js.undefined)
    
    inline def setReleaseTemplate(value: String): Self = StObject.set(x, "releaseTemplate", value.asInstanceOf[js.Any])
    
    inline def setReleaseTemplateUndefined: Self = StObject.set(x, "releaseTemplate", js.undefined)
  }
}
