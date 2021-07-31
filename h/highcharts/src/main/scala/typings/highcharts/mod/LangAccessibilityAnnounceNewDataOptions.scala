package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangAccessibilityAnnounceNewDataOptions extends StObject {
  
  var newDataAnnounce: js.UndefOr[String] = js.undefined
  
  var newPointAnnounceMultiple: js.UndefOr[String] = js.undefined
  
  var newPointAnnounceSingle: js.UndefOr[String] = js.undefined
  
  var newSeriesAnnounceMultiple: js.UndefOr[String] = js.undefined
  
  var newSeriesAnnounceSingle: js.UndefOr[String] = js.undefined
}
object LangAccessibilityAnnounceNewDataOptions {
  
  @scala.inline
  def apply(): LangAccessibilityAnnounceNewDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangAccessibilityAnnounceNewDataOptions]
  }
  
  @scala.inline
  implicit class LangAccessibilityAnnounceNewDataOptionsMutableBuilder[Self <: LangAccessibilityAnnounceNewDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewDataAnnounce(value: String): Self = StObject.set(x, "newDataAnnounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewDataAnnounceUndefined: Self = StObject.set(x, "newDataAnnounce", js.undefined)
    
    @scala.inline
    def setNewPointAnnounceMultiple(value: String): Self = StObject.set(x, "newPointAnnounceMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPointAnnounceMultipleUndefined: Self = StObject.set(x, "newPointAnnounceMultiple", js.undefined)
    
    @scala.inline
    def setNewPointAnnounceSingle(value: String): Self = StObject.set(x, "newPointAnnounceSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPointAnnounceSingleUndefined: Self = StObject.set(x, "newPointAnnounceSingle", js.undefined)
    
    @scala.inline
    def setNewSeriesAnnounceMultiple(value: String): Self = StObject.set(x, "newSeriesAnnounceMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSeriesAnnounceMultipleUndefined: Self = StObject.set(x, "newSeriesAnnounceMultiple", js.undefined)
    
    @scala.inline
    def setNewSeriesAnnounceSingle(value: String): Self = StObject.set(x, "newSeriesAnnounceSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewSeriesAnnounceSingleUndefined: Self = StObject.set(x, "newSeriesAnnounceSingle", js.undefined)
  }
}
