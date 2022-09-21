package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementAccountuserlinksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to delete the user link for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Link ID to delete the user link for.
    */
  var linkId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementAccountuserlinksDelete {
  
  inline def apply(): ParamsResourceManagementAccountuserlinksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementAccountuserlinksDelete]
  }
  
  extension [Self <: ParamsResourceManagementAccountuserlinksDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setLinkId(value: String): Self = StObject.set(x, "linkId", value.asInstanceOf[js.Any])
    
    inline def setLinkIdUndefined: Self = StObject.set(x, "linkId", js.undefined)
  }
}
