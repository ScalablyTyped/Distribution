package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the error status for values that were not written.
  */
@js.native
trait SchemaCollectdValueError extends StObject {
  
  /**
    * Records the error status for the value.
    */
  var error: js.UndefOr[SchemaStatus] = js.native
  
  /**
    * The zero-based index in CollectdPayload.values within the parent
    * CreateCollectdTimeSeriesRequest.collectd_payloads.
    */
  var index: js.UndefOr[Double] = js.native
}
object SchemaCollectdValueError {
  
  @scala.inline
  def apply(): SchemaCollectdValueError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectdValueError]
  }
  
  @scala.inline
  implicit class SchemaCollectdValueErrorMutableBuilder[Self <: SchemaCollectdValueError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: SchemaStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
