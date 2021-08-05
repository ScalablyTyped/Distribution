package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The status of a datafeed, i.e., the result of the last retrieval of the
  * datafeed computed asynchronously when the feed processing is finished.
  */
trait SchemaDatafeedStatus extends StObject {
  
  /**
    * The country for which the status is reported, represented as a  CLDR
    * territory code.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the feed for which the status is reported.
    */
  var datafeedId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of errors occurring in the feed.
    */
  var errors: js.UndefOr[js.Array[SchemaDatafeedStatusError]] = js.undefined
  
  /**
    * The number of items in the feed that were processed.
    */
  var itemsTotal: js.UndefOr[String] = js.undefined
  
  /**
    * The number of items in the feed that were valid.
    */
  var itemsValid: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#datafeedStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The two-letter ISO 639-1 language for which the status is reported.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The last date at which the feed was uploaded.
    */
  var lastUploadDate: js.UndefOr[String] = js.undefined
  
  /**
    * The processing status of the feed.
    */
  var processingStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The list of errors occurring in the feed.
    */
  var warnings: js.UndefOr[js.Array[SchemaDatafeedStatusError]] = js.undefined
}
object SchemaDatafeedStatus {
  
  inline def apply(): SchemaDatafeedStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedStatus]
  }
  
  extension [Self <: SchemaDatafeedStatus](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDatafeedId(value: String): Self = StObject.set(x, "datafeedId", value.asInstanceOf[js.Any])
    
    inline def setDatafeedIdUndefined: Self = StObject.set(x, "datafeedId", js.undefined)
    
    inline def setErrors(value: js.Array[SchemaDatafeedStatusError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: SchemaDatafeedStatusError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    inline def setItemsTotal(value: String): Self = StObject.set(x, "itemsTotal", value.asInstanceOf[js.Any])
    
    inline def setItemsTotalUndefined: Self = StObject.set(x, "itemsTotal", js.undefined)
    
    inline def setItemsValid(value: String): Self = StObject.set(x, "itemsValid", value.asInstanceOf[js.Any])
    
    inline def setItemsValidUndefined: Self = StObject.set(x, "itemsValid", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLastUploadDate(value: String): Self = StObject.set(x, "lastUploadDate", value.asInstanceOf[js.Any])
    
    inline def setLastUploadDateUndefined: Self = StObject.set(x, "lastUploadDate", js.undefined)
    
    inline def setProcessingStatus(value: String): Self = StObject.set(x, "processingStatus", value.asInstanceOf[js.Any])
    
    inline def setProcessingStatusUndefined: Self = StObject.set(x, "processingStatus", js.undefined)
    
    inline def setWarnings(value: js.Array[SchemaDatafeedStatusError]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: SchemaDatafeedStatusError*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
