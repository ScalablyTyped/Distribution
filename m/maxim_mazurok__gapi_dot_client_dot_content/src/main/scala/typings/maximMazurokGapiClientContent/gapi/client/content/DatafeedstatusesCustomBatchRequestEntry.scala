package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedstatusesCustomBatchRequestEntry extends StObject {
  
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[Double] = js.undefined
  
  /** The country for which to get the datafeed status. If this parameter is provided then language must also be provided. Note that for multi-target datafeeds this parameter is required. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The ID of the data feed to get. */
  var datafeedId: js.UndefOr[String] = js.undefined
  
  /** The language for which to get the datafeed status. If this parameter is provided then country must also be provided. Note that for multi-target datafeeds this parameter is required. */
  var language: js.UndefOr[String] = js.undefined
  
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /** The method of the batch entry. Acceptable values are: - "`get`" */
  var method: js.UndefOr[String] = js.undefined
}
object DatafeedstatusesCustomBatchRequestEntry {
  
  @scala.inline
  def apply(): DatafeedstatusesCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedstatusesCustomBatchRequestEntry]
  }
  
  @scala.inline
  implicit class DatafeedstatusesCustomBatchRequestEntryMutableBuilder[Self <: DatafeedstatusesCustomBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: Double): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setDatafeedId(value: String): Self = StObject.set(x, "datafeedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatafeedIdUndefined: Self = StObject.set(x, "datafeedId", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
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
