package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatafeedstatusesCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.native
  
  /** The requested data feed status. Defined if and only if the request was successful. */
  var datafeedStatus: js.UndefOr[DatafeedStatus] = js.native
  
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.native
}
object DatafeedstatusesCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): DatafeedstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedstatusesCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class DatafeedstatusesCustomBatchResponseEntryMutableBuilder[Self <: DatafeedstatusesCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setDatafeedStatus(value: DatafeedStatus): Self = StObject.set(x, "datafeedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeedStatusUndefined: Self = StObject.set(x, "datafeedStatus", js.undefined)
    
    @scala.inline
    def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
