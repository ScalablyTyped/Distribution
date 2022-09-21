package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLodging extends StObject {
  
  /**
    * Physical adaptations made to the property in consideration of varying levels of human physical ability.
    */
  var accessibility: js.UndefOr[SchemaAccessibility] = js.undefined
  
  /**
    * Amenities and features related to leisure and play.
    */
  var activities: js.UndefOr[SchemaActivities] = js.undefined
  
  /**
    * Output only. All units on the property have at least these attributes.
    */
  var allUnits: js.UndefOr[SchemaGuestUnitFeatures] = js.undefined
  
  /**
    * Features of the property of specific interest to the business traveler.
    */
  var business: js.UndefOr[SchemaBusiness] = js.undefined
  
  /**
    * Features of the shared living areas available in this Lodging.
    */
  var commonLivingArea: js.UndefOr[SchemaLivingArea] = js.undefined
  
  /**
    * The ways in which the property provides guests with the ability to access the internet.
    */
  var connectivity: js.UndefOr[SchemaConnectivity] = js.undefined
  
  /**
    * Services and amenities for families and young guests.
    */
  var families: js.UndefOr[SchemaFamilies] = js.undefined
  
  /**
    * Meals, snacks, and beverages available at the property.
    */
  var foodAndDrink: js.UndefOr[SchemaFoodAndDrink] = js.undefined
  
  /**
    * Individual GuestUnitTypes that are available in this Lodging.
    */
  var guestUnits: js.UndefOr[js.Array[SchemaGuestUnitType]] = js.undefined
  
  /**
    * Health and safety measures implemented by the hotel during COVID-19.
    */
  var healthAndSafety: js.UndefOr[SchemaHealthAndSafety] = js.undefined
  
  /**
    * Conveniences provided in guest units to facilitate an easier, more comfortable stay.
    */
  var housekeeping: js.UndefOr[SchemaHousekeeping] = js.undefined
  
  /**
    * Required. Metadata for the lodging.
    */
  var metadata: js.UndefOr[SchemaLodgingMetadata] = js.undefined
  
  /**
    * Required. Google identifier for this location in the form: `locations/{location_id\}/lodging`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parking options at the property.
    */
  var parking: js.UndefOr[SchemaParking] = js.undefined
  
  /**
    * Policies regarding guest-owned animals.
    */
  var pets: js.UndefOr[SchemaPets] = js.undefined
  
  /**
    * Property rules that impact guests.
    */
  var policies: js.UndefOr[SchemaPolicies] = js.undefined
  
  /**
    * Swimming pool or recreational water facilities available at the hotel.
    */
  var pools: js.UndefOr[SchemaPools] = js.undefined
  
  /**
    * General factual information about the property's physical structure and important dates.
    */
  var property: js.UndefOr[SchemaProperty] = js.undefined
  
  /**
    * Conveniences or help provided by the property to facilitate an easier, more comfortable stay.
    */
  var services: js.UndefOr[SchemaServices] = js.undefined
  
  /**
    * Output only. Some units on the property have as much as these attributes.
    */
  var someUnits: js.UndefOr[SchemaGuestUnitFeatures] = js.undefined
  
  /**
    * Sustainability practices implemented at the hotel.
    */
  var sustainability: js.UndefOr[SchemaSustainability] = js.undefined
  
  /**
    * Vehicles or vehicular services facilitated or owned by the property.
    */
  var transportation: js.UndefOr[SchemaTransportation] = js.undefined
  
  /**
    * Guest facilities at the property to promote or maintain health, beauty, and fitness.
    */
  var wellness: js.UndefOr[SchemaWellness] = js.undefined
}
object SchemaLodging {
  
  inline def apply(): SchemaLodging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLodging]
  }
  
  extension [Self <: SchemaLodging](x: Self) {
    
    inline def setAccessibility(value: SchemaAccessibility): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setActivities(value: SchemaActivities): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setAllUnits(value: SchemaGuestUnitFeatures): Self = StObject.set(x, "allUnits", value.asInstanceOf[js.Any])
    
    inline def setAllUnitsUndefined: Self = StObject.set(x, "allUnits", js.undefined)
    
    inline def setBusiness(value: SchemaBusiness): Self = StObject.set(x, "business", value.asInstanceOf[js.Any])
    
    inline def setBusinessUndefined: Self = StObject.set(x, "business", js.undefined)
    
    inline def setCommonLivingArea(value: SchemaLivingArea): Self = StObject.set(x, "commonLivingArea", value.asInstanceOf[js.Any])
    
    inline def setCommonLivingAreaUndefined: Self = StObject.set(x, "commonLivingArea", js.undefined)
    
    inline def setConnectivity(value: SchemaConnectivity): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    inline def setConnectivityUndefined: Self = StObject.set(x, "connectivity", js.undefined)
    
    inline def setFamilies(value: SchemaFamilies): Self = StObject.set(x, "families", value.asInstanceOf[js.Any])
    
    inline def setFamiliesUndefined: Self = StObject.set(x, "families", js.undefined)
    
    inline def setFoodAndDrink(value: SchemaFoodAndDrink): Self = StObject.set(x, "foodAndDrink", value.asInstanceOf[js.Any])
    
    inline def setFoodAndDrinkUndefined: Self = StObject.set(x, "foodAndDrink", js.undefined)
    
    inline def setGuestUnits(value: js.Array[SchemaGuestUnitType]): Self = StObject.set(x, "guestUnits", value.asInstanceOf[js.Any])
    
    inline def setGuestUnitsUndefined: Self = StObject.set(x, "guestUnits", js.undefined)
    
    inline def setGuestUnitsVarargs(value: SchemaGuestUnitType*): Self = StObject.set(x, "guestUnits", js.Array(value*))
    
    inline def setHealthAndSafety(value: SchemaHealthAndSafety): Self = StObject.set(x, "healthAndSafety", value.asInstanceOf[js.Any])
    
    inline def setHealthAndSafetyUndefined: Self = StObject.set(x, "healthAndSafety", js.undefined)
    
    inline def setHousekeeping(value: SchemaHousekeeping): Self = StObject.set(x, "housekeeping", value.asInstanceOf[js.Any])
    
    inline def setHousekeepingUndefined: Self = StObject.set(x, "housekeeping", js.undefined)
    
    inline def setMetadata(value: SchemaLodgingMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParking(value: SchemaParking): Self = StObject.set(x, "parking", value.asInstanceOf[js.Any])
    
    inline def setParkingUndefined: Self = StObject.set(x, "parking", js.undefined)
    
    inline def setPets(value: SchemaPets): Self = StObject.set(x, "pets", value.asInstanceOf[js.Any])
    
    inline def setPetsUndefined: Self = StObject.set(x, "pets", js.undefined)
    
    inline def setPolicies(value: SchemaPolicies): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    inline def setPools(value: SchemaPools): Self = StObject.set(x, "pools", value.asInstanceOf[js.Any])
    
    inline def setPoolsUndefined: Self = StObject.set(x, "pools", js.undefined)
    
    inline def setProperty(value: SchemaProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setServices(value: SchemaServices): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    inline def setSomeUnits(value: SchemaGuestUnitFeatures): Self = StObject.set(x, "someUnits", value.asInstanceOf[js.Any])
    
    inline def setSomeUnitsUndefined: Self = StObject.set(x, "someUnits", js.undefined)
    
    inline def setSustainability(value: SchemaSustainability): Self = StObject.set(x, "sustainability", value.asInstanceOf[js.Any])
    
    inline def setSustainabilityUndefined: Self = StObject.set(x, "sustainability", js.undefined)
    
    inline def setTransportation(value: SchemaTransportation): Self = StObject.set(x, "transportation", value.asInstanceOf[js.Any])
    
    inline def setTransportationUndefined: Self = StObject.set(x, "transportation", js.undefined)
    
    inline def setWellness(value: SchemaWellness): Self = StObject.set(x, "wellness", value.asInstanceOf[js.Any])
    
    inline def setWellnessUndefined: Self = StObject.set(x, "wellness", js.undefined)
  }
}
