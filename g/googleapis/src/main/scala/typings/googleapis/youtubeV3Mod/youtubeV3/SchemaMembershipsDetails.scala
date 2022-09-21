package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipsDetails extends StObject {
  
  /**
    * Ids of all levels that the user has access to. This includes the currently active level and all other levels that are included because of a higher purchase.
    */
  var accessibleLevels: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Id of the highest level that the user has access to at the moment.
    */
  var highestAccessibleLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Display name for the highest level that the user has access to at the moment.
    */
  var highestAccessibleLevelDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Data about memberships duration without taking into consideration pricing levels.
    */
  var membershipsDuration: js.UndefOr[SchemaMembershipsDuration] = js.undefined
  
  /**
    * Data about memberships duration on particular pricing levels.
    */
  var membershipsDurationAtLevels: js.UndefOr[js.Array[SchemaMembershipsDurationAtLevel]] = js.undefined
}
object SchemaMembershipsDetails {
  
  inline def apply(): SchemaMembershipsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipsDetails]
  }
  
  extension [Self <: SchemaMembershipsDetails](x: Self) {
    
    inline def setAccessibleLevels(value: js.Array[String]): Self = StObject.set(x, "accessibleLevels", value.asInstanceOf[js.Any])
    
    inline def setAccessibleLevelsNull: Self = StObject.set(x, "accessibleLevels", null)
    
    inline def setAccessibleLevelsUndefined: Self = StObject.set(x, "accessibleLevels", js.undefined)
    
    inline def setAccessibleLevelsVarargs(value: String*): Self = StObject.set(x, "accessibleLevels", js.Array(value*))
    
    inline def setHighestAccessibleLevel(value: String): Self = StObject.set(x, "highestAccessibleLevel", value.asInstanceOf[js.Any])
    
    inline def setHighestAccessibleLevelDisplayName(value: String): Self = StObject.set(x, "highestAccessibleLevelDisplayName", value.asInstanceOf[js.Any])
    
    inline def setHighestAccessibleLevelDisplayNameNull: Self = StObject.set(x, "highestAccessibleLevelDisplayName", null)
    
    inline def setHighestAccessibleLevelDisplayNameUndefined: Self = StObject.set(x, "highestAccessibleLevelDisplayName", js.undefined)
    
    inline def setHighestAccessibleLevelNull: Self = StObject.set(x, "highestAccessibleLevel", null)
    
    inline def setHighestAccessibleLevelUndefined: Self = StObject.set(x, "highestAccessibleLevel", js.undefined)
    
    inline def setMembershipsDuration(value: SchemaMembershipsDuration): Self = StObject.set(x, "membershipsDuration", value.asInstanceOf[js.Any])
    
    inline def setMembershipsDurationAtLevels(value: js.Array[SchemaMembershipsDurationAtLevel]): Self = StObject.set(x, "membershipsDurationAtLevels", value.asInstanceOf[js.Any])
    
    inline def setMembershipsDurationAtLevelsUndefined: Self = StObject.set(x, "membershipsDurationAtLevels", js.undefined)
    
    inline def setMembershipsDurationAtLevelsVarargs(value: SchemaMembershipsDurationAtLevel*): Self = StObject.set(x, "membershipsDurationAtLevels", js.Array(value*))
    
    inline def setMembershipsDurationUndefined: Self = StObject.set(x, "membershipsDuration", js.undefined)
  }
}
