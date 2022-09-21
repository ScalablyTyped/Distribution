package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersVersionHeadersList
  extends StObject
     with StandardParameters {
  
  /**
    * Also retrieve deleted (archived) versions when true.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * GTM Container's API relative path. Example: accounts/{account_id\}/containers/{container_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersVersionHeadersList {
  
  inline def apply(): ParamsResourceAccountsContainersVersionHeadersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersVersionHeadersList]
  }
  
  extension [Self <: ParamsResourceAccountsContainersVersionHeadersList](x: Self) {
    
    inline def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    inline def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
