package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the error status for payloads that were not written.
  */
@js.native
trait SchemaCollectdPayloadError extends StObject {
  
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
  implicit class SchemaCollectdPayloadErrorMutableBuilder[Self <: SchemaCollectdPayloadError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setValueErrors(value: js.Array[SchemaCollectdValueError]): Self = StObject.set(x, "valueErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueErrorsUndefined: Self = StObject.set(x, "valueErrors", js.undefined)
    
    @scala.inline
    def setValueErrorsVarargs(value: SchemaCollectdValueError*): Self = StObject.set(x, "valueErrors", js.Array(value :_*))
  }
}
