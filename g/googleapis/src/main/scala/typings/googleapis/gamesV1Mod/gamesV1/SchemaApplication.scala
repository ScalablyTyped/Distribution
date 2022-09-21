package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplication extends StObject {
  
  /**
    * The number of achievements visible to the currently authenticated player.
    */
  var achievement_count: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The assets of the application.
    */
  var assets: js.UndefOr[js.Array[SchemaImageAsset]] = js.undefined
  
  /**
    * The author of the application.
    */
  var author: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The category of the application.
    */
  var category: js.UndefOr[SchemaApplicationCategory] = js.undefined
  
  /**
    * The description of the application.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of features that have been enabled for the application.
    */
  var enabledFeatures: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The ID of the application.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The instances of the application.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#application`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last updated timestamp of the application.
    */
  var lastUpdatedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of leaderboards visible to the currently authenticated player.
    */
  var leaderboard_count: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The name of the application.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A hint to the client UI for what color to use as an app-themed color. The color is given as an RGB triplet (e.g. "E0E0E0").
    */
  var themeColor: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplication {
  
  inline def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  
  extension [Self <: SchemaApplication](x: Self) {
    
    inline def setAchievement_count(value: Double): Self = StObject.set(x, "achievement_count", value.asInstanceOf[js.Any])
    
    inline def setAchievement_countNull: Self = StObject.set(x, "achievement_count", null)
    
    inline def setAchievement_countUndefined: Self = StObject.set(x, "achievement_count", js.undefined)
    
    inline def setAssets(value: js.Array[SchemaImageAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: SchemaImageAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCategory(value: SchemaApplicationCategory): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabledFeatures(value: js.Array[String]): Self = StObject.set(x, "enabledFeatures", value.asInstanceOf[js.Any])
    
    inline def setEnabledFeaturesNull: Self = StObject.set(x, "enabledFeatures", null)
    
    inline def setEnabledFeaturesUndefined: Self = StObject.set(x, "enabledFeatures", js.undefined)
    
    inline def setEnabledFeaturesVarargs(value: String*): Self = StObject.set(x, "enabledFeatures", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInstances(value: js.Array[SchemaInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaInstance*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: String): Self = StObject.set(x, "lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampNull: Self = StObject.set(x, "lastUpdatedTimestamp", null)
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "lastUpdatedTimestamp", js.undefined)
    
    inline def setLeaderboard_count(value: Double): Self = StObject.set(x, "leaderboard_count", value.asInstanceOf[js.Any])
    
    inline def setLeaderboard_countNull: Self = StObject.set(x, "leaderboard_count", null)
    
    inline def setLeaderboard_countUndefined: Self = StObject.set(x, "leaderboard_count", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorNull: Self = StObject.set(x, "themeColor", null)
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
