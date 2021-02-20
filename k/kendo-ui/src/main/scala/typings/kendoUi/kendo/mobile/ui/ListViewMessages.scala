package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListViewMessages extends StObject {
  
  var loadMoreText: js.UndefOr[String] = js.native
  
  var pullTemplate: js.UndefOr[String] = js.native
  
  var refreshTemplate: js.UndefOr[String] = js.native
  
  var releaseTemplate: js.UndefOr[String] = js.native
}
object ListViewMessages {
  
  @scala.inline
  def apply(): ListViewMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewMessages]
  }
  
  @scala.inline
  implicit class ListViewMessagesMutableBuilder[Self <: ListViewMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadMoreText(value: String): Self = StObject.set(x, "loadMoreText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMoreTextUndefined: Self = StObject.set(x, "loadMoreText", js.undefined)
    
    @scala.inline
    def setPullTemplate(value: String): Self = StObject.set(x, "pullTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullTemplateUndefined: Self = StObject.set(x, "pullTemplate", js.undefined)
    
    @scala.inline
    def setRefreshTemplate(value: String): Self = StObject.set(x, "refreshTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshTemplateUndefined: Self = StObject.set(x, "refreshTemplate", js.undefined)
    
    @scala.inline
    def setReleaseTemplate(value: String): Self = StObject.set(x, "releaseTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseTemplateUndefined: Self = StObject.set(x, "releaseTemplate", js.undefined)
  }
}
