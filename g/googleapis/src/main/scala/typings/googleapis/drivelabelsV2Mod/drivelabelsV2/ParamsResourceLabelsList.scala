package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsList
  extends StObject
     with StandardParameters {
  
  /**
    * The BCP-47 language code to use for evaluating localized field labels. When not specified, values in the default configured language are used.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the level of access the user must have on the returned Labels. The minimum role a user must have on a label. Defaults to `READER`.
    */
  var minimumRole: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of labels to return per page. Default: 50. Max: 200.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The token of the page to return.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to include only published labels in the results. * When `true`, only the current published label revisions are returned. Disabled labels are included. Returned label resource names reference the published revision (`labels/{id\}/{revision_id\}`). * When `false`, the current label revisions are returned, which might not be published. Returned label resource names don't reference a specific revision (`labels/{id\}`).
    */
  var publishedOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. This will return all Labels within the customer.
    */
  var useAdminAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When specified, only certain fields belonging to the indicated view are returned.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceLabelsList {
  
  inline def apply(): ParamsResourceLabelsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsList]
  }
  
  extension [Self <: ParamsResourceLabelsList](x: Self) {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMinimumRole(value: String): Self = StObject.set(x, "minimumRole", value.asInstanceOf[js.Any])
    
    inline def setMinimumRoleUndefined: Self = StObject.set(x, "minimumRole", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPublishedOnly(value: Boolean): Self = StObject.set(x, "publishedOnly", value.asInstanceOf[js.Any])
    
    inline def setPublishedOnlyUndefined: Self = StObject.set(x, "publishedOnly", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
