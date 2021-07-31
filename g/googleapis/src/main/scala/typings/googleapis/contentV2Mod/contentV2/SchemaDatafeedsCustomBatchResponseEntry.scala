package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch datafeeds response.
  */
trait SchemaDatafeedsCustomBatchResponseEntry extends StObject {
  
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * The requested data feed. Defined if and only if the request was
    * successful.
    */
  var datafeed: js.UndefOr[SchemaDatafeed] = js.undefined
  
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
}
object SchemaDatafeedsCustomBatchResponseEntry {
  
  @scala.inline
  def apply(): SchemaDatafeedsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedsCustomBatchResponseEntry]
  }
  
  @scala.inline
  implicit class SchemaDatafeedsCustomBatchResponseEntryMutableBuilder[Self <: SchemaDatafeedsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setDatafeed(value: SchemaDatafeed): Self = StObject.set(x, "datafeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeedUndefined: Self = StObject.set(x, "datafeed", js.undefined)
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
