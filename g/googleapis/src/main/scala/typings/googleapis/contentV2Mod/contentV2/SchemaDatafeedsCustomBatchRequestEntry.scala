package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A batch entry encoding a single non-batch datafeeds request.
  */
trait SchemaDatafeedsCustomBatchRequestEntry extends StObject {
  
  /**
    * An entry ID, unique within the batch request.
    */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /**
    * The data feed to insert.
    */
  var datafeed: js.UndefOr[SchemaDatafeed] = js.undefined
  
  /**
    * The ID of the data feed to get, delete or fetch.
    */
  var datafeedId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
}
object SchemaDatafeedsCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): SchemaDatafeedsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedsCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class SchemaDatafeedsCustomBatchRequestEntryMutableBuilder[Self <: SchemaDatafeedsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setDatafeed(value: SchemaDatafeed): Self = StObject.set(x, "datafeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeedId(value: String): Self = StObject.set(x, "datafeedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeedIdUndefined: Self = StObject.set(x, "datafeedId", js.undefined)
    
    @scala.inline
    def setDatafeedUndefined: Self = StObject.set(x, "datafeed", js.undefined)
    
    @scala.inline
    def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
  }
}
