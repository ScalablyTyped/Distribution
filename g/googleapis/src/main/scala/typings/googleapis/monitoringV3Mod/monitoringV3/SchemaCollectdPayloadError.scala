package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the error status for payloads that were not written.
  */
@js.native
trait SchemaCollectdPayloadError extends js.Object {
  
  /**
    * Records the error status for the payload. If this field is present, the
    * partial errors for nested values won&#39;t be populated.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * The zero-based index in
    * CreateCollectdTimeSeriesRequest.collectd_payloads.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Records the error status for values that were not written due to an
    * error.Failed payloads for which nothing is written will not include
    * partial value errors.
    */
  var valueErrors: js.UndefOr[js.Array[SchemaCollectdValueError]] = js.native
}
object SchemaCollectdPayloadError {
  
  @scala.inline
  def apply(): SchemaCollectdPayloadError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdPayloadError]
  }
  
  @scala.inline
  implicit class SchemaCollectdPayloadErrorOps[Self <: SchemaCollectdPayloadError] (val x: Self) extends AnyVal {
    
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
    def setError(value: SchemaStatus): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setValueErrorsVarargs(value: SchemaCollectdValueError*): Self = this.set("valueErrors", js.Array(value :_*))
    
    @scala.inline
    def setValueErrors(value: js.Array[SchemaCollectdValueError]): Self = this.set("valueErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueErrors: Self = this.set("valueErrors", js.undefined)
  }
}
