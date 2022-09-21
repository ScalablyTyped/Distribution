package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaCompletionConfig extends StObject {
  
  /**
    * Output only. The source data for the latest import of the autocomplete allowlist phrases.
    */
  var allowlistInputConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig] = js.undefined
  
  /**
    * If set to true, the auto learning function is enabled. Auto learning uses user data to generate suggestions using ML techniques. Default value is false. Only after enabling auto learning can users use `cloud-retail` data in CompleteQueryRequest.
    */
  var autoLearning: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The source data for the latest import of the autocomplete denylist phrases.
    */
  var denylistInputConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig] = js.undefined
  
  /**
    * Output only. Name of the LRO corresponding to the latest allowlist import. Can use GetOperation API to retrieve the latest state of the Long Running Operation.
    */
  var lastAllowlistImportOperation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the LRO corresponding to the latest denylist import. Can use GetOperation API to retrieve the latest state of the Long Running Operation.
    */
  var lastDenylistImportOperation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the LRO corresponding to the latest suggestion terms list import. Can use GetOperation API to retrieve the latest state of the Long Running Operation.
    */
  var lastSuggestionsImportOperation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies the matching order for autocomplete suggestions, e.g., a query consisting of 'sh' with 'out-of-order' specified would suggest "women's shoes", whereas a query of 'red s' with 'exact-prefix' specified would suggest "red shoes". Currently supported values: * 'out-of-order' * 'exact-prefix' Default value: 'exact-prefix'.
    */
  var matchingOrder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of autocomplete suggestions returned per term. Default value is 20. If left unset or set to 0, then will fallback to default value. Value range is 1 to 20.
    */
  var maxSuggestions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The minimum number of characters needed to be typed in order to get suggestions. Default value is 2. If left unset or set to 0, then will fallback to default value. Value range is 1 to 20.
    */
  var minPrefixLength: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. Immutable. Fully qualified name `projects/x/locations/x/catalogs/x/completionConfig`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The source data for the latest import of the autocomplete suggestion phrases.
    */
  var suggestionsInputConfig: js.UndefOr[SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaCompletionConfig {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaCompletionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaCompletionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaCompletionConfig](x: Self) {
    
    inline def setAllowlistInputConfig(value: SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig): Self = StObject.set(x, "allowlistInputConfig", value.asInstanceOf[js.Any])
    
    inline def setAllowlistInputConfigUndefined: Self = StObject.set(x, "allowlistInputConfig", js.undefined)
    
    inline def setAutoLearning(value: Boolean): Self = StObject.set(x, "autoLearning", value.asInstanceOf[js.Any])
    
    inline def setAutoLearningNull: Self = StObject.set(x, "autoLearning", null)
    
    inline def setAutoLearningUndefined: Self = StObject.set(x, "autoLearning", js.undefined)
    
    inline def setDenylistInputConfig(value: SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig): Self = StObject.set(x, "denylistInputConfig", value.asInstanceOf[js.Any])
    
    inline def setDenylistInputConfigUndefined: Self = StObject.set(x, "denylistInputConfig", js.undefined)
    
    inline def setLastAllowlistImportOperation(value: String): Self = StObject.set(x, "lastAllowlistImportOperation", value.asInstanceOf[js.Any])
    
    inline def setLastAllowlistImportOperationNull: Self = StObject.set(x, "lastAllowlistImportOperation", null)
    
    inline def setLastAllowlistImportOperationUndefined: Self = StObject.set(x, "lastAllowlistImportOperation", js.undefined)
    
    inline def setLastDenylistImportOperation(value: String): Self = StObject.set(x, "lastDenylistImportOperation", value.asInstanceOf[js.Any])
    
    inline def setLastDenylistImportOperationNull: Self = StObject.set(x, "lastDenylistImportOperation", null)
    
    inline def setLastDenylistImportOperationUndefined: Self = StObject.set(x, "lastDenylistImportOperation", js.undefined)
    
    inline def setLastSuggestionsImportOperation(value: String): Self = StObject.set(x, "lastSuggestionsImportOperation", value.asInstanceOf[js.Any])
    
    inline def setLastSuggestionsImportOperationNull: Self = StObject.set(x, "lastSuggestionsImportOperation", null)
    
    inline def setLastSuggestionsImportOperationUndefined: Self = StObject.set(x, "lastSuggestionsImportOperation", js.undefined)
    
    inline def setMatchingOrder(value: String): Self = StObject.set(x, "matchingOrder", value.asInstanceOf[js.Any])
    
    inline def setMatchingOrderNull: Self = StObject.set(x, "matchingOrder", null)
    
    inline def setMatchingOrderUndefined: Self = StObject.set(x, "matchingOrder", js.undefined)
    
    inline def setMaxSuggestions(value: Double): Self = StObject.set(x, "maxSuggestions", value.asInstanceOf[js.Any])
    
    inline def setMaxSuggestionsNull: Self = StObject.set(x, "maxSuggestions", null)
    
    inline def setMaxSuggestionsUndefined: Self = StObject.set(x, "maxSuggestions", js.undefined)
    
    inline def setMinPrefixLength(value: Double): Self = StObject.set(x, "minPrefixLength", value.asInstanceOf[js.Any])
    
    inline def setMinPrefixLengthNull: Self = StObject.set(x, "minPrefixLength", null)
    
    inline def setMinPrefixLengthUndefined: Self = StObject.set(x, "minPrefixLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSuggestionsInputConfig(value: SchemaGoogleCloudRetailV2alphaCompletionDataInputConfig): Self = StObject.set(x, "suggestionsInputConfig", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsInputConfigUndefined: Self = StObject.set(x, "suggestionsInputConfig", js.undefined)
  }
}
