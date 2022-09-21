package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserLocation extends StObject {
  
  /**
    * Textual location. This is most useful for display purposes to concisely describe the location. For example 'Mountain View, CA', 'Near Seattle', 'US-NYC-9TH 9A209A.''
    */
  var area: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Building Identifier.
    */
  var buildingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom Type.
    */
  var customType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Most specific textual code of individual desk location.
    */
  var deskCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floor name/number.
    */
  var floorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Floor section. More specific location within the floor. For example if a floor is divided into sections 'A', 'B' and 'C' this field would identify one of those values.
    */
  var floorSection: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Each entry can have a type which indicates standard types of that entry. For example location could be of types default and desk. In addition to standard type an entry can have a custom type and can give it any name. Such types should have 'custom' as type and also have a customType value.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserLocation {
  
  inline def apply(): SchemaUserLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserLocation]
  }
  
  extension [Self <: SchemaUserLocation](x: Self) {
    
    inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaNull: Self = StObject.set(x, "area", null)
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setBuildingId(value: String): Self = StObject.set(x, "buildingId", value.asInstanceOf[js.Any])
    
    inline def setBuildingIdNull: Self = StObject.set(x, "buildingId", null)
    
    inline def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    inline def setCustomType(value: String): Self = StObject.set(x, "customType", value.asInstanceOf[js.Any])
    
    inline def setCustomTypeNull: Self = StObject.set(x, "customType", null)
    
    inline def setCustomTypeUndefined: Self = StObject.set(x, "customType", js.undefined)
    
    inline def setDeskCode(value: String): Self = StObject.set(x, "deskCode", value.asInstanceOf[js.Any])
    
    inline def setDeskCodeNull: Self = StObject.set(x, "deskCode", null)
    
    inline def setDeskCodeUndefined: Self = StObject.set(x, "deskCode", js.undefined)
    
    inline def setFloorName(value: String): Self = StObject.set(x, "floorName", value.asInstanceOf[js.Any])
    
    inline def setFloorNameNull: Self = StObject.set(x, "floorName", null)
    
    inline def setFloorNameUndefined: Self = StObject.set(x, "floorName", js.undefined)
    
    inline def setFloorSection(value: String): Self = StObject.set(x, "floorSection", value.asInstanceOf[js.Any])
    
    inline def setFloorSectionNull: Self = StObject.set(x, "floorSection", null)
    
    inline def setFloorSectionUndefined: Self = StObject.set(x, "floorSection", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
