package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkerHealthReportResponse contains information returned to the worker in
  * response to a health ping.
  */
@js.native
trait SchemaWorkerHealthReportResponse extends js.Object {
  
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
  implicit class SchemaWorkerHealthReportResponseOps[Self <: SchemaWorkerHealthReportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReportInterval(value: String): Self = this.set("reportInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportInterval: Self = this.set("reportInterval", js.undefined)
  }
}
