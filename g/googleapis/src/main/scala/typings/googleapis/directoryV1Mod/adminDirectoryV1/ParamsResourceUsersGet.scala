package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersGet
  extends StObject
     with StandardParameters {
  
  /**
    * A comma-separated list of schema names. All fields from these schemas are fetched. This should only be set when `projection=custom`.
    */
  var customFieldMask: js.UndefOr[String] = js.undefined
  
  /**
    * What subset of fields to fetch for this user.
    */
  var projection: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the user in the API request. The value can be the user's primary email address, alias email address, or unique user ID.
    */
  var userKey: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to fetch the administrator-only or domain-wide public view of the user. For more information, see [Retrieve a user as a non-administrator](/admin-sdk/directory/v1/guides/manage-users#retrieve_users_non_admin).
    */
  var viewType: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersGet {
  
  inline def apply(): ParamsResourceUsersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersGet]
  }
  
  extension [Self <: ParamsResourceUsersGet](x: Self) {
    
    inline def setCustomFieldMask(value: String): Self = StObject.set(x, "customFieldMask", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldMaskUndefined: Self = StObject.set(x, "customFieldMask", js.undefined)
    
    inline def setProjection(value: String): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
    
    inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
    
    inline def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
    
    inline def setViewTypeUndefined: Self = StObject.set(x, "viewType", js.undefined)
  }
}
