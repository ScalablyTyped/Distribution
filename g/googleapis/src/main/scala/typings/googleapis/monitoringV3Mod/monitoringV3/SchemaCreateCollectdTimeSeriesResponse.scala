package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The CreateCollectdTimeSeries response.
  */
@js.native
trait SchemaCreateCollectdTimeSeriesResponse extends StObject {
  
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
  implicit class SchemaCreateCollectdTimeSeriesResponseMutableBuilder[Self <: SchemaCreateCollectdTimeSeriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayloadErrors(value: js.Array[SchemaCollectdPayloadError]): Self = StObject.set(x, "payloadErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadErrorsUndefined: Self = StObject.set(x, "payloadErrors", js.undefined)
    
    @scala.inline
    def setPayloadErrorsVarargs(value: SchemaCollectdPayloadError*): Self = StObject.set(x, "payloadErrors", js.Array(value :_*))
  }
}
