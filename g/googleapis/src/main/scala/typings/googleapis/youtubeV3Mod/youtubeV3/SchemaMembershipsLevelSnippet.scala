package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipsLevelSnippet extends StObject {
  
  /**
    * The id of the channel that's offering channel memberships.
    */
  var creatorChannelId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details about the pricing level.
    */
  var levelDetails: js.UndefOr[SchemaLevelDetails] = js.undefined
}
object SchemaMembershipsLevelSnippet {
  
  inline def apply(): SchemaMembershipsLevelSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipsLevelSnippet]
  }
  
  extension [Self <: SchemaMembershipsLevelSnippet](x: Self) {
    
    inline def setCreatorChannelId(value: String): Self = StObject.set(x, "creatorChannelId", value.asInstanceOf[js.Any])
    
    inline def setCreatorChannelIdNull: Self = StObject.set(x, "creatorChannelId", null)
    
    inline def setCreatorChannelIdUndefined: Self = StObject.set(x, "creatorChannelId", js.undefined)
    
    inline def setLevelDetails(value: SchemaLevelDetails): Self = StObject.set(x, "levelDetails", value.asInstanceOf[js.Any])
    
    inline def setLevelDetailsUndefined: Self = StObject.set(x, "levelDetails", js.undefined)
  }
}
