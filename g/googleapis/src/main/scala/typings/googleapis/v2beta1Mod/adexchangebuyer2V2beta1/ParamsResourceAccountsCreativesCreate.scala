package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsCreativesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The account that this creative belongs to. Can be used to filter the response of the creatives.list method.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if multiple creatives can share an ID or not. Default is NO_DUPLICATES (one ID per creative).
    */
  var duplicateIdMode: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreative] = js.undefined
}
object ParamsResourceAccountsCreativesCreate {
  
  inline def apply(): ParamsResourceAccountsCreativesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsCreativesCreate]
  }
  
  extension [Self <: ParamsResourceAccountsCreativesCreate](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setDuplicateIdMode(value: String): Self = StObject.set(x, "duplicateIdMode", value.asInstanceOf[js.Any])
    
    inline def setDuplicateIdModeUndefined: Self = StObject.set(x, "duplicateIdMode", js.undefined)
    
    inline def setRequestBody(value: SchemaCreative): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
