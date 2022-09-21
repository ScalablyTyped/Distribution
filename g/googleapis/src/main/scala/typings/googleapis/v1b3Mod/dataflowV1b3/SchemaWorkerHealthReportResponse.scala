package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerHealthReportResponse extends StObject {
  
  /**
    * A positive value indicates the worker should change its reporting interval to the specified value. The default value of zero means no change in report rate is requested by the server.
    */
  var reportInterval: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkerHealthReportResponse {
  
  inline def apply(): SchemaWorkerHealthReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerHealthReportResponse]
  }
  
  extension [Self <: SchemaWorkerHealthReportResponse](x: Self) {
    
    inline def setReportInterval(value: String): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
    
    inline def setReportIntervalNull: Self = StObject.set(x, "reportInterval", null)
    
    inline def setReportIntervalUndefined: Self = StObject.set(x, "reportInterval", js.undefined)
  }
}
