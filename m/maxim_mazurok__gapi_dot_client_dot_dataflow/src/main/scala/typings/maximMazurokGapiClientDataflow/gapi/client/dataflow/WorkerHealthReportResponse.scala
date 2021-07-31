package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerHealthReportResponse extends StObject {
  
  /**
    * A positive value indicates the worker should change its reporting interval to the specified value. The default value of zero means no change in report rate is requested by the
    * server.
    */
  var reportInterval: js.UndefOr[String] = js.undefined
}
object WorkerHealthReportResponse {
  
  @scala.inline
  def apply(): WorkerHealthReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerHealthReportResponse]
  }
  
  @scala.inline
  implicit class WorkerHealthReportResponseMutableBuilder[Self <: WorkerHealthReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportInterval(value: String): Self = StObject.set(x, "reportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportIntervalUndefined: Self = StObject.set(x, "reportInterval", js.undefined)
  }
}
