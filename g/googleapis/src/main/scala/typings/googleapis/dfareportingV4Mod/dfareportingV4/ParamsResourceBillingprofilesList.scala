package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillingprofilesList
  extends StObject
     with StandardParameters {
  
  /**
    * Select only billing profile with currency.
    */
  var currency_code: js.UndefOr[String] = js.undefined
  
  /**
    * Select only billing profile with these IDs.
    */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum number of results to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Allows searching for billing profiles by name. Wildcards (*) are allowed. For example, "profile*2020" will return objects with names like "profile June 2020", "profile April 2020", or simply "profile 2020". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "profile" will match objects with name "my profile", "profile 2021", or simply "profile".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Select only billing profile which is suggested for the currency_code & subaccount_id using the Billing Suggestion API.
    */
  var onlySuggestion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Value of the nextPageToken from the previous result page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * Field by which to sort the list.
    */
  var sortField: js.UndefOr[String] = js.undefined
  
  /**
    * Order of sorted results.
    */
  var sortOrder: js.UndefOr[String] = js.undefined
  
  /**
    * Select only billing profile with the specified status.
    */
  var status: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Select only billing profile with the specified subaccount.When only_suggestion is true, only a single subaccount_id is supported.
    */
  var subaccountIds: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceBillingprofilesList {
  
  inline def apply(): ParamsResourceBillingprofilesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillingprofilesList]
  }
  
  extension [Self <: ParamsResourceBillingprofilesList](x: Self) {
    
    inline def setCurrency_code(value: String): Self = StObject.set(x, "currency_code", value.asInstanceOf[js.Any])
    
    inline def setCurrency_codeUndefined: Self = StObject.set(x, "currency_code", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnlySuggestion(value: Boolean): Self = StObject.set(x, "onlySuggestion", value.asInstanceOf[js.Any])
    
    inline def setOnlySuggestionUndefined: Self = StObject.set(x, "onlySuggestion", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSortField(value: String): Self = StObject.set(x, "sortField", value.asInstanceOf[js.Any])
    
    inline def setSortFieldUndefined: Self = StObject.set(x, "sortField", js.undefined)
    
    inline def setSortOrder(value: String): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setStatus(value: js.Array[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: String*): Self = StObject.set(x, "status", js.Array(value*))
    
    inline def setSubaccountIds(value: js.Array[String]): Self = StObject.set(x, "subaccountIds", value.asInstanceOf[js.Any])
    
    inline def setSubaccountIdsUndefined: Self = StObject.set(x, "subaccountIds", js.undefined)
    
    inline def setSubaccountIdsVarargs(value: String*): Self = StObject.set(x, "subaccountIds", js.Array(value*))
  }
}
