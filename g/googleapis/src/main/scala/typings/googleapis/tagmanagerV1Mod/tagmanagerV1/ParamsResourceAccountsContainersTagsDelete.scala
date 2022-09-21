package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersTagsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * The GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The GTM Tag ID.
    */
  var tagId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersTagsDelete {
  
  inline def apply(): ParamsResourceAccountsContainersTagsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersTagsDelete]
  }
  
  extension [Self <: ParamsResourceAccountsContainersTagsDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setTagId(value: String): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
    
    inline def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
  }
}
