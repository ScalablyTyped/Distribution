package typings.mailchimpMailchimpMarketing.mod.lists

import typings.mailchimpMailchimpMarketing.mod.MergeFieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOptions extends StObject {
  
  /**
    * Restrict results to lists created before the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    */
  var beforeCampaignLastSent: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict response to lists created before the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    */
  var beforeDateCreated: js.UndefOr[String] = js.undefined
  
  /**
    * The number of records to return. Default value is 10. Maximum value is 1000 (default to 10)
    */
  var count: js.UndefOr[Double] = js.undefined
  
  /**
    * Restrict results to lists that include a specific subscriber's email address.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * A comma-separated list of fields to exclude. Reference parameters of sub-objects with dot notation.
    */
  var excludeFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A comma-separated list of fields to return. Reference parameters of sub-objects with dot notation.
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Restrict results to lists that contain an active, connected, undeleted ecommerce store.
    */
  var hasEcommerceStore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Return the total_contacts field in the stats response, which contains an approximate count of all contacts in any state.
    */
  var includeTotalContacts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used for [pagination](https://mailchimp.com/developer/marketing/docs/methods-parameters/#pagination), this it the number of records from a collection to skip.
    * Default value is 0. (default to 0)
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Return merge fields that are of the specified required type.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Restrict results to lists created after the last campaign send date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    */
  var sinceCampaignLastSent: js.UndefOr[String] = js.undefined
  
  /**
    * Restrict results to lists created after the set date. Uses ISO 8601 time format: 2015-10-21T15:41:36+00:00.
    */
  var sinceDateCreated: js.UndefOr[String] = js.undefined
  
  /**
    * If true, member data will be accepted without merge field values, even if the merge field is usually required. This defaults to false.
    */
  var skipMergeValidation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the order direction for sorted results.
    */
  var sortDir: js.UndefOr[String] = js.undefined
  
  /**
    * Returns files sorted by the specified field.
    */
  var sortField: js.UndefOr[String] = js.undefined
  
  /**
    * Return merge fields with the specified type.
    */
  var `type`: js.UndefOr[MergeFieldType] = js.undefined
}
object ListOptions {
  
  inline def apply(): ListOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
    
    inline def setBeforeCampaignLastSent(value: String): Self = StObject.set(x, "beforeCampaignLastSent", value.asInstanceOf[js.Any])
    
    inline def setBeforeCampaignLastSentUndefined: Self = StObject.set(x, "beforeCampaignLastSent", js.undefined)
    
    inline def setBeforeDateCreated(value: String): Self = StObject.set(x, "beforeDateCreated", value.asInstanceOf[js.Any])
    
    inline def setBeforeDateCreatedUndefined: Self = StObject.set(x, "beforeDateCreated", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setExcludeFields(value: js.Array[String]): Self = StObject.set(x, "excludeFields", value.asInstanceOf[js.Any])
    
    inline def setExcludeFieldsUndefined: Self = StObject.set(x, "excludeFields", js.undefined)
    
    inline def setExcludeFieldsVarargs(value: String*): Self = StObject.set(x, "excludeFields", js.Array(value*))
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setHasEcommerceStore(value: Boolean): Self = StObject.set(x, "hasEcommerceStore", value.asInstanceOf[js.Any])
    
    inline def setHasEcommerceStoreUndefined: Self = StObject.set(x, "hasEcommerceStore", js.undefined)
    
    inline def setIncludeTotalContacts(value: Boolean): Self = StObject.set(x, "includeTotalContacts", value.asInstanceOf[js.Any])
    
    inline def setIncludeTotalContactsUndefined: Self = StObject.set(x, "includeTotalContacts", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSinceCampaignLastSent(value: String): Self = StObject.set(x, "sinceCampaignLastSent", value.asInstanceOf[js.Any])
    
    inline def setSinceCampaignLastSentUndefined: Self = StObject.set(x, "sinceCampaignLastSent", js.undefined)
    
    inline def setSinceDateCreated(value: String): Self = StObject.set(x, "sinceDateCreated", value.asInstanceOf[js.Any])
    
    inline def setSinceDateCreatedUndefined: Self = StObject.set(x, "sinceDateCreated", js.undefined)
    
    inline def setSkipMergeValidation(value: Boolean): Self = StObject.set(x, "skipMergeValidation", value.asInstanceOf[js.Any])
    
    inline def setSkipMergeValidationUndefined: Self = StObject.set(x, "skipMergeValidation", js.undefined)
    
    inline def setSortDir(value: String): Self = StObject.set(x, "sortDir", value.asInstanceOf[js.Any])
    
    inline def setSortDirUndefined: Self = StObject.set(x, "sortDir", js.undefined)
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setType(value: MergeFieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
