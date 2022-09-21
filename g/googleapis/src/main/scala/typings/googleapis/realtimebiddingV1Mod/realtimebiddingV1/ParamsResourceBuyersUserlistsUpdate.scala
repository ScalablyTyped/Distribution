package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersUserlistsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Output only. Name of the user list that must follow the pattern `buyers/{buyer\}/userLists/{user_list\}`, where `{buyer\}` represents the account ID of the buyer who owns the user list. For a bidder accessing user lists on behalf of a child seat buyer, `{buyer\}` represents the account ID of the child seat buyer. `{user_list\}` is an int64 identifier assigned by Google to uniquely identify a user list.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUserList] = js.undefined
}
object ParamsResourceBuyersUserlistsUpdate {
  
  inline def apply(): ParamsResourceBuyersUserlistsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersUserlistsUpdate]
  }
  
  extension [Self <: ParamsResourceBuyersUserlistsUpdate](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUserList): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
