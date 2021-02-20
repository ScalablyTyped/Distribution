package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a ListConfigurations response.
  */
@js.native
trait SchemaAchievementConfigurationListResponse extends StObject {
  
  /**
    * The achievement configurations.
    */
  var items: js.UndefOr[js.Array[SchemaAchievementConfiguration]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#achievementConfigurationListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaAchievementConfigurationListResponse {
  
  @scala.inline
  def apply(): SchemaAchievementConfigurationListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementConfigurationListResponse]
  }
  
  @scala.inline
  implicit class SchemaAchievementConfigurationListResponseMutableBuilder[Self <: SchemaAchievementConfigurationListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaAchievementConfiguration]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaAchievementConfiguration*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
