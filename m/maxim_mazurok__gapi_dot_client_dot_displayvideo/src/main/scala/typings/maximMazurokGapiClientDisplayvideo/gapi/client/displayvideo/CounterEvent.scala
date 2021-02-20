package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CounterEvent extends StObject {
  
  /** Required. The name of the counter event. */
  var name: js.UndefOr[String] = js.native
  
  /** Required. The name used to identify this counter event in reports. */
  var reportingName: js.UndefOr[String] = js.native
}
object CounterEvent {
  
  @scala.inline
  def apply(): CounterEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterEvent]
  }
  
  @scala.inline
  implicit class CounterEventMutableBuilder[Self <: CounterEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setReportingName(value: String): Self = StObject.set(x, "reportingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingNameUndefined: Self = StObject.set(x, "reportingName", js.undefined)
  }
}
