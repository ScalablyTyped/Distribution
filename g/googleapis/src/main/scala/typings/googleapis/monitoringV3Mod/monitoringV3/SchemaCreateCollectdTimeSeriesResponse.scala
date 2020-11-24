package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CreateCollectdTimeSeries response.
  */
@js.native
trait SchemaCreateCollectdTimeSeriesResponse extends js.Object {
  
  /**
    * Records the error status for points that were not written due to an
    * error.Failed requests for which nothing is written will return an error
    * response instead.
    */
  var payloadErrors: js.UndefOr[js.Array[SchemaCollectdPayloadError]] = js.native
}
object SchemaCreateCollectdTimeSeriesResponse {
  
  @scala.inline
  def apply(): SchemaCreateCollectdTimeSeriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCollectdTimeSeriesResponse]
  }
  
  @scala.inline
  implicit class SchemaCreateCollectdTimeSeriesResponseOps[Self <: SchemaCreateCollectdTimeSeriesResponse] (val x: Self) extends AnyVal {
    
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
    def setPayloadErrorsVarargs(value: SchemaCollectdPayloadError*): Self = this.set("payloadErrors", js.Array(value :_*))
    
    @scala.inline
    def setPayloadErrors(value: js.Array[SchemaCollectdPayloadError]): Self = this.set("payloadErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePayloadErrors: Self = this.set("payloadErrors", js.undefined)
  }
}
