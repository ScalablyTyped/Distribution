package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Building object in Directory API.
  */
trait SchemaBuilding extends StObject {
  
  /**
    * The postal address of the building. See PostalAddress for details. Note
    * that only a single address line and region code are required.
    */
  var address: js.UndefOr[SchemaBuildingAddress] = js.undefined
  
  /**
    * Unique identifier for the building. The maximum length is 100 characters.
    */
  var buildingId: js.UndefOr[String] = js.undefined
  
  /**
    * The building name as seen by users in Calendar. Must be unique for the
    * customer. For example, &quot;NYC-CHEL&quot;. The maximum length is 100
    * characters.
    */
  var buildingName: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic coordinates of the center of the building, expressed as
    * latitude and longitude in decimal degrees.
    */
  var coordinates: js.UndefOr[SchemaBuildingCoordinates] = js.undefined
  
  /**
    * A brief description of the building. For example, &quot;Chelsea
    * Market&quot;.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.undefined
  
  /**
    * The display names for all floors in this building. The floors are
    * expected to be sorted in ascending order, from lowest floor to highest
    * floor. For example, [&quot;B2&quot;, &quot;B1&quot;, &quot;L&quot;,
    * &quot;1&quot;, &quot;2&quot;, &quot;2M&quot;, &quot;3&quot;,
    * &quot;PH&quot;] Must contain at least one entry.
    */
  var floorNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
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
    
    inline def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    inline def setBuildingName(value: String): Self = StObject.set(x, "buildingName", value.asInstanceOf[js.Any])
    
    inline def setBuildingNameUndefined: Self = StObject.set(x, "buildingName", js.undefined)
    
    inline def setCoordinates(value: SchemaBuildingCoordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
    
    inline def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
    
    inline def setFloorNames(value: js.Array[String]): Self = StObject.set(x, "floorNames", value.asInstanceOf[js.Any])
    
    inline def setFloorNamesUndefined: Self = StObject.set(x, "floorNames", js.undefined)
    
    inline def setFloorNamesVarargs(value: String*): Self = StObject.set(x, "floorNames", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
