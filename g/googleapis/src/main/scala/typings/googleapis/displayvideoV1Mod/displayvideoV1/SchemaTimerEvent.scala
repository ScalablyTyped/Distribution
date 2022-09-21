package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimerEvent extends StObject {
  
  /**
    * Required. The name of the timer event.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name used to identify this timer event in reports.
    */
  var reportingName: js.UndefOr[String | Null] = js.undefined
}
object SchemaTimerEvent {
  
  inline def apply(): SchemaTimerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimerEvent]
  }
  
  extension [Self <: SchemaTimerEvent](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingName(value: String): Self = StObject.set(x, "reportingName", value.asInstanceOf[js.Any])
    
    inline def setReportingNameNull: Self = StObject.set(x, "reportingName", null)
    
    inline def setReportingNameUndefined: Self = StObject.set(x, "reportingName", js.undefined)
  }
}
