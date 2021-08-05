package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CounterEvent extends StObject {
  
  /** Required. The name of the counter event. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. The name used to identify this counter event in reports. */
  var reportingName: js.UndefOr[String] = js.undefined
}
object CounterEvent {
  
  inline def apply(): CounterEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterEvent]
  }
  
  extension [Self <: CounterEvent](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingName(value: String): Self = StObject.set(x, "reportingName", value.asInstanceOf[js.Any])
    
    inline def setReportingNameUndefined: Self = StObject.set(x, "reportingName", js.undefined)
  }
}
