package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserList extends StObject {
  
  /**
    * The description for the user list.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Display name of the user list. This must be unique across all user lists for a given account.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The number of days a user's cookie stays on the user list. The field must be between 0 and 540 inclusive.
    */
  var membershipDurationDays: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the user list that must follow the pattern `buyers/{buyer\}/userLists/{user_list\}`, where `{buyer\}` represents the account ID of the buyer who owns the user list. For a bidder accessing user lists on behalf of a child seat buyer, `{buyer\}` represents the account ID of the child seat buyer. `{user_list\}` is an int64 identifier assigned by Google to uniquely identify a user list.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The status of the user list. A new user list starts out as open.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The URL restriction for the user list.
    */
  var urlRestriction: js.UndefOr[SchemaUrlRestriction] = js.undefined
}
object SchemaUserList {
  
  inline def apply(): SchemaUserList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserList]
  }
  
  extension [Self <: SchemaUserList](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMembershipDurationDays(value: String): Self = StObject.set(x, "membershipDurationDays", value.asInstanceOf[js.Any])
    
    inline def setMembershipDurationDaysNull: Self = StObject.set(x, "membershipDurationDays", null)
    
    inline def setMembershipDurationDaysUndefined: Self = StObject.set(x, "membershipDurationDays", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUrlRestriction(value: SchemaUrlRestriction): Self = StObject.set(x, "urlRestriction", value.asInstanceOf[js.Any])
    
    inline def setUrlRestrictionUndefined: Self = StObject.set(x, "urlRestriction", js.undefined)
  }
}
