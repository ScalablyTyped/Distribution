package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuilding extends StObject {
  
  /**
    * The postal address of the building. See [`PostalAddress`](/my-business/reference/rest/v4/PostalAddress) for details. Note that only a single address line and region code are required.
    */
  var address: js.UndefOr[SchemaBuildingAddress] = js.undefined
  
  /**
    * Unique identifier for the building. The maximum length is 100 characters.
    */
  var buildingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The building name as seen by users in Calendar. Must be unique for the customer. For example, "NYC-CHEL". The maximum length is 100 characters.
    */
  var buildingName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The geographic coordinates of the center of the building, expressed as latitude and longitude in decimal degrees.
    */
  var coordinates: js.UndefOr[SchemaBuildingCoordinates] = js.undefined
  
  /**
    * A brief description of the building. For example, "Chelsea Market".
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display names for all floors in this building. The floors are expected to be sorted in ascending order, from lowest floor to highest floor. For example, ["B2", "B1", "L", "1", "2", "2M", "3", "PH"] Must contain at least one entry.
    */
  var floorNames: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuilding {
  
  inline def apply(): SchemaBuilding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuilding]
  }
  
  extension [Self <: SchemaBuilding](x: Self) {
    
    inline def setAddress(value: SchemaBuildingAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setBuildingId(value: String): Self = StObject.set(x, "buildingId", value.asInstanceOf[js.Any])
    
    inline def setBuildingIdNull: Self = StObject.set(x, "buildingId", null)
    
    inline def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    inline def setBuildingName(value: String): Self = StObject.set(x, "buildingName", value.asInstanceOf[js.Any])
    
    inline def setBuildingNameNull: Self = StObject.set(x, "buildingName", null)
    
    inline def setBuildingNameUndefined: Self = StObject.set(x, "buildingName", js.undefined)
    
    inline def setCoordinates(value: SchemaBuildingCoordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
    
    inline def setEtagsNull: Self = StObject.set(x, "etags", null)
    
    inline def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
    
    inline def setFloorNames(value: js.Array[String]): Self = StObject.set(x, "floorNames", value.asInstanceOf[js.Any])
    
    inline def setFloorNamesNull: Self = StObject.set(x, "floorNames", null)
    
    inline def setFloorNamesUndefined: Self = StObject.set(x, "floorNames", js.undefined)
    
    inline def setFloorNamesVarargs(value: String*): Self = StObject.set(x, "floorNames", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
