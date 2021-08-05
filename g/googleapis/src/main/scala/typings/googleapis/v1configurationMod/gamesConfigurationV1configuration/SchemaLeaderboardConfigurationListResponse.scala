package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a ListConfigurations response.
  */
trait SchemaLeaderboardConfigurationListResponse extends StObject {
  
  /**
    * The leaderboard configurations.
    */
  var items: js.UndefOr[js.Array[SchemaLeaderboardConfiguration]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#leaderboardConfigurationListResponse.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaLeaderboardConfigurationListResponse {
  
  inline def apply(): SchemaLeaderboardConfigurationListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardConfigurationListResponse]
  }
  
  extension [Self <: SchemaLeaderboardConfigurationListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaLeaderboardConfiguration]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaLeaderboardConfiguration*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
