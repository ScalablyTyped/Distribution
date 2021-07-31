package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an achievement configuration detail.
  */
trait SchemaAchievementConfigurationDetail extends StObject {
  
  /**
    * Localized strings for the achievement description.
    */
  var description: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * The icon url of this achievement. Writes to this field are ignored.
    */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#achievementConfigurationDetail.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Localized strings for the achievement name.
    */
  var name: js.UndefOr[SchemaLocalizedStringBundle] = js.undefined
  
  /**
    * Point value for the achievement.
    */
  var pointValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The sort rank of this achievement. Writes to this field are ignored.
    */
  var sortRank: js.UndefOr[Double] = js.undefined
}
object SchemaAchievementConfigurationDetail {
  
  @scala.inline
  def apply(): SchemaAchievementConfigurationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAchievementConfigurationDetail]
  }
  
  @scala.inline
  implicit class SchemaAchievementConfigurationDetailMutableBuilder[Self <: SchemaAchievementConfigurationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: SchemaLocalizedStringBundle): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPointValue(value: Double): Self = StObject.set(x, "pointValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointValueUndefined: Self = StObject.set(x, "pointValue", js.undefined)
    
    @scala.inline
    def setSortRank(value: Double): Self = StObject.set(x, "sortRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortRankUndefined: Self = StObject.set(x, "sortRank", js.undefined)
  }
}
