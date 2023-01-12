package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewMessages extends StObject {
  
  var loadMoreText: js.UndefOr[String] = js.undefined
  
  var pullTemplate: js.UndefOr[String] = js.undefined
  
  var refreshTemplate: js.UndefOr[String] = js.undefined
  
  var releaseTemplate: js.UndefOr[String] = js.undefined
}
object ListViewMessages {
  
  inline def apply(): ListViewMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewMessages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListViewMessages] (val x: Self) extends AnyVal {
    
    inline def setLoadMoreText(value: String): Self = StObject.set(x, "loadMoreText", value.asInstanceOf[js.Any])
    
    inline def setLoadMoreTextUndefined: Self = StObject.set(x, "loadMoreText", js.undefined)
    
    inline def setPullTemplate(value: String): Self = StObject.set(x, "pullTemplate", value.asInstanceOf[js.Any])
    
    inline def setPullTemplateUndefined: Self = StObject.set(x, "pullTemplate", js.undefined)
    
    inline def setRefreshTemplate(value: String): Self = StObject.set(x, "refreshTemplate", value.asInstanceOf[js.Any])
    
    inline def setRefreshTemplateUndefined: Self = StObject.set(x, "refreshTemplate", js.undefined)
    
    inline def setReleaseTemplate(value: String): Self = StObject.set(x, "releaseTemplate", value.asInstanceOf[js.Any])
    
    inline def setReleaseTemplateUndefined: Self = StObject.set(x, "releaseTemplate", js.undefined)
  }
}
