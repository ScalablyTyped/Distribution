package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGuestUnitFeatures extends StObject {
  
  /**
    * Bungalow or villa. An independent structure that is part of a hotel or resort that is rented to one party for a vacation stay. The hotel or resort may be completely comprised of bungalows or villas, or they may be one of several guestroom options. Guests in the bungalows or villas most often have the same, if not more, amenities and services offered to guests in other guestroom types.
    */
  var bungalowOrVilla: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Bungalow or villa exception.
    */
  var bungalowOrVillaException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Connecting unit available. A guestroom type that features access to an adjacent guestroom for the purpose of booking both rooms. Most often used by families who need more than one room to accommodate the number of people in their group.
    */
  var connectingUnitAvailable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Connecting unit available exception.
    */
  var connectingUnitAvailableException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Executive floor. A floor of the hotel where the guestrooms are only bookable by members of the hotel's frequent guest membership program. Benefits of this room class include access to a designated lounge which may or may not feature free breakfast, cocktails or other perks specific to members of the program.
    */
  var executiveFloor: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Executive floor exception.
    */
  var executiveFloorException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max adult occupants count. The total number of adult guests allowed to stay overnight in the guestroom.
    */
  var maxAdultOccupantsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max adult occupants count exception.
    */
  var maxAdultOccupantsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max child occupants count. The total number of children allowed to stay overnight in the room.
    */
  var maxChildOccupantsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max child occupants count exception.
    */
  var maxChildOccupantsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Max occupants count. The total number of guests allowed to stay overnight in the guestroom.
    */
  var maxOccupantsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Max occupants count exception.
    */
  var maxOccupantsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Private home. A privately owned home (house, townhouse, apartment, cabin, bungalow etc) that may or not serve as the owner's residence, but is rented out in its entirety or by the room(s) to paying guest(s) for vacation stays. Not for lease-based, long-term residency.
    */
  var privateHome: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Private home exception.
    */
  var privateHomeException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Suite. A guestroom category that implies both a bedroom area and a separate living area. There may or may not be full walls and doors separating the two areas, but regardless, they are very distinct. Does not mean a couch or chair in a bedroom.
    */
  var suite: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Suite exception.
    */
  var suiteException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tier. Classification of the unit based on available features/amenities. A non-standard tier is only permitted if at least one other unit type falls under the standard tier.
    */
  var tier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tier exception.
    */
  var tierException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Features available in the living areas in the guest unit.
    */
  var totalLivingAreas: js.UndefOr[SchemaLivingArea] = js.undefined
  
  /**
    * Views available from the guest unit itself.
    */
  var views: js.UndefOr[SchemaViewsFromUnit] = js.undefined
}
object SchemaGuestUnitFeatures {
  
  inline def apply(): SchemaGuestUnitFeatures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestUnitFeatures]
  }
  
  extension [Self <: SchemaGuestUnitFeatures](x: Self) {
    
    inline def setBungalowOrVilla(value: Boolean): Self = StObject.set(x, "bungalowOrVilla", value.asInstanceOf[js.Any])
    
    inline def setBungalowOrVillaException(value: String): Self = StObject.set(x, "bungalowOrVillaException", value.asInstanceOf[js.Any])
    
    inline def setBungalowOrVillaExceptionNull: Self = StObject.set(x, "bungalowOrVillaException", null)
    
    inline def setBungalowOrVillaExceptionUndefined: Self = StObject.set(x, "bungalowOrVillaException", js.undefined)
    
    inline def setBungalowOrVillaNull: Self = StObject.set(x, "bungalowOrVilla", null)
    
    inline def setBungalowOrVillaUndefined: Self = StObject.set(x, "bungalowOrVilla", js.undefined)
    
    inline def setConnectingUnitAvailable(value: Boolean): Self = StObject.set(x, "connectingUnitAvailable", value.asInstanceOf[js.Any])
    
    inline def setConnectingUnitAvailableException(value: String): Self = StObject.set(x, "connectingUnitAvailableException", value.asInstanceOf[js.Any])
    
    inline def setConnectingUnitAvailableExceptionNull: Self = StObject.set(x, "connectingUnitAvailableException", null)
    
    inline def setConnectingUnitAvailableExceptionUndefined: Self = StObject.set(x, "connectingUnitAvailableException", js.undefined)
    
    inline def setConnectingUnitAvailableNull: Self = StObject.set(x, "connectingUnitAvailable", null)
    
    inline def setConnectingUnitAvailableUndefined: Self = StObject.set(x, "connectingUnitAvailable", js.undefined)
    
    inline def setExecutiveFloor(value: Boolean): Self = StObject.set(x, "executiveFloor", value.asInstanceOf[js.Any])
    
    inline def setExecutiveFloorException(value: String): Self = StObject.set(x, "executiveFloorException", value.asInstanceOf[js.Any])
    
    inline def setExecutiveFloorExceptionNull: Self = StObject.set(x, "executiveFloorException", null)
    
    inline def setExecutiveFloorExceptionUndefined: Self = StObject.set(x, "executiveFloorException", js.undefined)
    
    inline def setExecutiveFloorNull: Self = StObject.set(x, "executiveFloor", null)
    
    inline def setExecutiveFloorUndefined: Self = StObject.set(x, "executiveFloor", js.undefined)
    
    inline def setMaxAdultOccupantsCount(value: Double): Self = StObject.set(x, "maxAdultOccupantsCount", value.asInstanceOf[js.Any])
    
    inline def setMaxAdultOccupantsCountException(value: String): Self = StObject.set(x, "maxAdultOccupantsCountException", value.asInstanceOf[js.Any])
    
    inline def setMaxAdultOccupantsCountExceptionNull: Self = StObject.set(x, "maxAdultOccupantsCountException", null)
    
    inline def setMaxAdultOccupantsCountExceptionUndefined: Self = StObject.set(x, "maxAdultOccupantsCountException", js.undefined)
    
    inline def setMaxAdultOccupantsCountNull: Self = StObject.set(x, "maxAdultOccupantsCount", null)
    
    inline def setMaxAdultOccupantsCountUndefined: Self = StObject.set(x, "maxAdultOccupantsCount", js.undefined)
    
    inline def setMaxChildOccupantsCount(value: Double): Self = StObject.set(x, "maxChildOccupantsCount", value.asInstanceOf[js.Any])
    
    inline def setMaxChildOccupantsCountException(value: String): Self = StObject.set(x, "maxChildOccupantsCountException", value.asInstanceOf[js.Any])
    
    inline def setMaxChildOccupantsCountExceptionNull: Self = StObject.set(x, "maxChildOccupantsCountException", null)
    
    inline def setMaxChildOccupantsCountExceptionUndefined: Self = StObject.set(x, "maxChildOccupantsCountException", js.undefined)
    
    inline def setMaxChildOccupantsCountNull: Self = StObject.set(x, "maxChildOccupantsCount", null)
    
    inline def setMaxChildOccupantsCountUndefined: Self = StObject.set(x, "maxChildOccupantsCount", js.undefined)
    
    inline def setMaxOccupantsCount(value: Double): Self = StObject.set(x, "maxOccupantsCount", value.asInstanceOf[js.Any])
    
    inline def setMaxOccupantsCountException(value: String): Self = StObject.set(x, "maxOccupantsCountException", value.asInstanceOf[js.Any])
    
    inline def setMaxOccupantsCountExceptionNull: Self = StObject.set(x, "maxOccupantsCountException", null)
    
    inline def setMaxOccupantsCountExceptionUndefined: Self = StObject.set(x, "maxOccupantsCountException", js.undefined)
    
    inline def setMaxOccupantsCountNull: Self = StObject.set(x, "maxOccupantsCount", null)
    
    inline def setMaxOccupantsCountUndefined: Self = StObject.set(x, "maxOccupantsCount", js.undefined)
    
    inline def setPrivateHome(value: Boolean): Self = StObject.set(x, "privateHome", value.asInstanceOf[js.Any])
    
    inline def setPrivateHomeException(value: String): Self = StObject.set(x, "privateHomeException", value.asInstanceOf[js.Any])
    
    inline def setPrivateHomeExceptionNull: Self = StObject.set(x, "privateHomeException", null)
    
    inline def setPrivateHomeExceptionUndefined: Self = StObject.set(x, "privateHomeException", js.undefined)
    
    inline def setPrivateHomeNull: Self = StObject.set(x, "privateHome", null)
    
    inline def setPrivateHomeUndefined: Self = StObject.set(x, "privateHome", js.undefined)
    
    inline def setSuite(value: Boolean): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
    
    inline def setSuiteException(value: String): Self = StObject.set(x, "suiteException", value.asInstanceOf[js.Any])
    
    inline def setSuiteExceptionNull: Self = StObject.set(x, "suiteException", null)
    
    inline def setSuiteExceptionUndefined: Self = StObject.set(x, "suiteException", js.undefined)
    
    inline def setSuiteNull: Self = StObject.set(x, "suite", null)
    
    inline def setSuiteUndefined: Self = StObject.set(x, "suite", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierException(value: String): Self = StObject.set(x, "tierException", value.asInstanceOf[js.Any])
    
    inline def setTierExceptionNull: Self = StObject.set(x, "tierException", null)
    
    inline def setTierExceptionUndefined: Self = StObject.set(x, "tierException", js.undefined)
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setTotalLivingAreas(value: SchemaLivingArea): Self = StObject.set(x, "totalLivingAreas", value.asInstanceOf[js.Any])
    
    inline def setTotalLivingAreasUndefined: Self = StObject.set(x, "totalLivingAreas", js.undefined)
    
    inline def setViews(value: SchemaViewsFromUnit): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
  }
}
