package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemberSnippet extends StObject {
  
  /**
    * The id of the channel that's offering memberships.
    */
  var creatorChannelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about the member.
    */
  var memberDetails: js.UndefOr[SchemaChannelProfileDetails] = js.undefined
  
  /**
    * Details about the user's membership.
    */
  var membershipsDetails: js.UndefOr[SchemaMembershipsDetails] = js.undefined
}
object SchemaMemberSnippet {
  
  inline def apply(): SchemaMemberSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemberSnippet]
  }
  
  extension [Self <: SchemaMemberSnippet](x: Self) {
    
    inline def setCreatorChannelId(value: String): Self = StObject.set(x, "creatorChannelId", value.asInstanceOf[js.Any])
    
    inline def setCreatorChannelIdNull: Self = StObject.set(x, "creatorChannelId", null)
    
    inline def setCreatorChannelIdUndefined: Self = StObject.set(x, "creatorChannelId", js.undefined)
    
    inline def setMemberDetails(value: SchemaChannelProfileDetails): Self = StObject.set(x, "memberDetails", value.asInstanceOf[js.Any])
    
    inline def setMemberDetailsUndefined: Self = StObject.set(x, "memberDetails", js.undefined)
    
    inline def setMembershipsDetails(value: SchemaMembershipsDetails): Self = StObject.set(x, "membershipsDetails", value.asInstanceOf[js.Any])
    
    inline def setMembershipsDetailsUndefined: Self = StObject.set(x, "membershipsDetails", js.undefined)
  }
}
