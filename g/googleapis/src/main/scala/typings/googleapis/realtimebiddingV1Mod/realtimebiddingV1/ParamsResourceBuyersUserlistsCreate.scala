package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersUserlistsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the parent buyer of the user list to be retrieved that must follow the pattern `buyers/{buyerAccountId\}`, where `{buyerAccountId\}` represents the account ID of the buyer who owns user lists. For a bidder accessing user lists on behalf of a child seat buyer , `{buyerAccountId\}` should represent the account ID of the child seat buyer.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUserList] = js.undefined
}
object ParamsResourceBuyersUserlistsCreate {
  
  inline def apply(): ParamsResourceBuyersUserlistsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersUserlistsCreate]
  }
  
  extension [Self <: ParamsResourceBuyersUserlistsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaUserList): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
