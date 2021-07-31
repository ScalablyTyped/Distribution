package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSpan extends StObject {
  
  /** End of time span. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Start of time span. */
  var startTime: js.UndefOr[String] = js.undefined
}
object TimeSpan {
  
  @scala.inline
  def apply(): TimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSpan]
  }
  
  @scala.inline
  implicit class TimeSpanMutableBuilder[Self <: TimeSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
