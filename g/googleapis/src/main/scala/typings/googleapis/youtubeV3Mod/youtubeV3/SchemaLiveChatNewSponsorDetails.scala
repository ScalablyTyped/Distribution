package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiveChatNewSponsorDetails extends StObject {
  
  /**
    * If the viewer just had upgraded from a lower level. For viewers that were not members at the time of purchase, this field is false.
    */
  var isUpgrade: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the Level that the viewer just had joined. The Level names are defined by the YouTube channel offering the Membership. In some situations this field isn't filled.
    */
  var memberLevelName: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiveChatNewSponsorDetails {
  
  inline def apply(): SchemaLiveChatNewSponsorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiveChatNewSponsorDetails]
  }
  
  extension [Self <: SchemaLiveChatNewSponsorDetails](x: Self) {
    
    inline def setIsUpgrade(value: Boolean): Self = StObject.set(x, "isUpgrade", value.asInstanceOf[js.Any])
    
    inline def setIsUpgradeNull: Self = StObject.set(x, "isUpgrade", null)
    
    inline def setIsUpgradeUndefined: Self = StObject.set(x, "isUpgrade", js.undefined)
    
    inline def setMemberLevelName(value: String): Self = StObject.set(x, "memberLevelName", value.asInstanceOf[js.Any])
    
    inline def setMemberLevelNameNull: Self = StObject.set(x, "memberLevelName", null)
    
    inline def setMemberLevelNameUndefined: Self = StObject.set(x, "memberLevelName", js.undefined)
  }
}
