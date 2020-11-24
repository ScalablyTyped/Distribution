package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Report status.
  */
@js.native
trait SchemaReportStatus extends js.Object {
  
  /**
    * If the report failed, this records the cause.
    */
  var failure: js.UndefOr[SchemaReportFailure] = js.native
  
  /**
    * The time when this report either completed successfully or failed.
    */
  var finishTimeMs: js.UndefOr[String] = js.native
  
  /**
    * The file type of the report.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * The state of the report.
    */
  var state: js.UndefOr[String] = js.native
}
object SchemaReportStatus {
  
  @scala.inline
  def apply(): SchemaReportStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportStatus]
  }
  
  @scala.inline
  implicit class SchemaReportStatusOps[Self <: SchemaReportStatus] (val x: Self) extends AnyVal {
    
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
    def setFailure(value: SchemaReportFailure): Self = this.set("failure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailure: Self = this.set("failure", js.undefined)
    
    @scala.inline
    def setFinishTimeMs(value: String): Self = this.set("finishTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishTimeMs: Self = this.set("finishTimeMs", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
