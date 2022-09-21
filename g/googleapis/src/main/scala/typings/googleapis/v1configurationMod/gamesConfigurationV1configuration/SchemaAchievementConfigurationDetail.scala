package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAchievementConfigurationDetail extends StObject {
  
  /**
    * Localized strings for the achievement description.
    */
  var description: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * The icon url of this achievement. Writes to this field are ignored.
    */
  var iconUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#achievementConfigurationDetail`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Localized strings for the achievement name.
    */
  var name: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * Point value for the achievement.
    */
  var pointValue: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The sort rank of this achievement. Writes to this field are ignored.
    */
  var sortRank: js.UndefOr[Double | Null] = js.undefined
}
object SchemaAchievementConfigurationDetail {
  
  inline def apply(): SchemaAchievementConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementConfigurationDetail]
  }
  
  extension [Self <: SchemaAchievementConfigurationDetail](x: Self) {
    
    inline def setDescription(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPointValue(value: Double): Self = StObject.set(x, "pointValue", value.asInstanceOf[js.Any])
    
    inline def setPointValueNull: Self = StObject.set(x, "pointValue", null)
    
    inline def setPointValueUndefined: Self = StObject.set(x, "pointValue", js.undefined)
    
    inline def setSortRank(value: Double): Self = StObject.set(x, "sortRank", value.asInstanceOf[js.Any])
    
    inline def setSortRankNull: Self = StObject.set(x, "sortRank", null)
    
    inline def setSortRankUndefined: Self = StObject.set(x, "sortRank", js.undefined)
  }
}
