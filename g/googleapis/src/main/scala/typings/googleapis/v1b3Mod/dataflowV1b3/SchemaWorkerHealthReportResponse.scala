package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkerHealthReportResponse contains information returned to the worker in
  * response to a health ping.
  */
@js.native
trait SchemaWorkerHealthReportResponse extends StObject {
  
  /**
    * A positive value indicates the worker should change its reporting
    * interval to the specified value.  The default value of zero means no
    * change in report rate is requested by the server.
    */
  var reportInterval: js.UndefOr[String] = js.native
}
object SchemaWorkerHealthReportResponse {
  
  @scala.inline
  def apply(): SchemaWorkerHealthReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerHealthReportResponse]
  }
  
  @scala.inline
  implicit class SchemaWorkerHealthReportResponseMutableBuilder[Self <: SchemaWorkerHealthReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportInterval(value: String): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIntervalUndefined: Self = StObject.set(x, "reportInterval", js.undefined)
  }
}
