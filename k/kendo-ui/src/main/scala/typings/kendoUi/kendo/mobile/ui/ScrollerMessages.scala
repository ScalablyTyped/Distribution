package typings.kendoUi.kendo.mobile.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollerMessages extends StObject {
  
  var pullTemplate: js.UndefOr[String] = js.native
  
  var refreshTemplate: js.UndefOr[String] = js.native
  
  var releaseTemplate: js.UndefOr[String] = js.native
}
object ScrollerMessages {
  
  @scala.inline
  def apply(): ScrollerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollerMessages]
  }
  
  @scala.inline
  implicit class ScrollerMessagesMutableBuilder[Self <: ScrollerMessages] (val x: Self) extends AnyVal {
    
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
