package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBuyersGetremarketingtag
  extends StObject
     with StandardParameters {
  
  /**
    * Required. To fetch remarketing tag for an account, name must follow the pattern `buyers/{accountId\}` where `{accountId\}` represents ID of a buyer that owns the remarketing tag. For a bidder accessing remarketing tag on behalf of a child seat buyer, `{accountId\}` should represent the ID of the child seat buyer. To fetch remarketing tag for a specific user list, name must follow the pattern `buyers/{accountId\}/userLists/{userListId\}`. See UserList.name.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceBuyersGetremarketingtag {
  
  inline def apply(): ParamsResourceBuyersGetremarketingtag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBuyersGetremarketingtag]
  }
  
  extension [Self <: ParamsResourceBuyersGetremarketingtag](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
