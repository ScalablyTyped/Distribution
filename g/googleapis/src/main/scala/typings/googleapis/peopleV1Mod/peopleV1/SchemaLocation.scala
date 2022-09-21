package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocation extends StObject {
  
  /**
    * The building identifier.
    */
  var buildingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the location is the current location.
    */
  var current: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The individual desk location.
    */
  var deskCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The floor name or number.
    */
  var floor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The floor section in `floor_name`.
    */
  var floorSection: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata about the location.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The type of the location. The type can be custom or one of these predefined values: * `desk` * `grewUp`
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The free-form value of the location.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocation {
  
  inline def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  extension [Self <: SchemaLocation](x: Self) {
    
    inline def setBuildingId(value: String): Self = StObject.set(x, "buildingId", value.asInstanceOf[js.Any])
    
    inline def setBuildingIdNull: Self = StObject.set(x, "buildingId", null)
    
    inline def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentNull: Self = StObject.set(x, "current", null)
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setDeskCode(value: String): Self = StObject.set(x, "deskCode", value.asInstanceOf[js.Any])
    
    inline def setDeskCodeNull: Self = StObject.set(x, "deskCode", null)
    
    inline def setDeskCodeUndefined: Self = StObject.set(x, "deskCode", js.undefined)
    
    inline def setFloor(value: String): Self = StObject.set(x, "floor", value.asInstanceOf[js.Any])
    
    inline def setFloorNull: Self = StObject.set(x, "floor", null)
    
    inline def setFloorSection(value: String): Self = StObject.set(x, "floorSection", value.asInstanceOf[js.Any])
    
    inline def setFloorSectionNull: Self = StObject.set(x, "floorSection", null)
    
    inline def setFloorSectionUndefined: Self = StObject.set(x, "floorSection", js.undefined)
    
    inline def setFloorUndefined: Self = StObject.set(x, "floor", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
