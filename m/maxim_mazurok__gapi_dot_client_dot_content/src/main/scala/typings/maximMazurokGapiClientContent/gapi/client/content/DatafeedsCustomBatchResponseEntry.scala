package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedsCustomBatchResponseEntry extends StObject {
  
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** The requested data feed. Defined if and only if the request was successful. */
  var datafeed: js.UndefOr[Datafeed] = js.undefined
  
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
}
object DatafeedsCustomBatchResponseEntry {
  
  inline def apply(): DatafeedsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedsCustomBatchResponseEntry]
  }
  
  extension [Self <: DatafeedsCustomBatchResponseEntry](x: Self) {
    
    inline def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    inline def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    inline def setDatafeed(value: Datafeed): Self = StObject.set(x, "datafeed", value.asInstanceOf[js.Any])
    
    inline def setDatafeedUndefined: Self = StObject.set(x, "datafeed", js.undefined)
    
    inline def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
