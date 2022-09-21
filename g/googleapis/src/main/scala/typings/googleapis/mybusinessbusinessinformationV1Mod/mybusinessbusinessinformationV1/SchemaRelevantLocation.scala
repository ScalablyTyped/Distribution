package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelevantLocation extends StObject {
  
  /**
    * Required. Specify the location that is on the other side of the relation by its placeID.
    */
  var placeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the relationship.
    */
  var relationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaRelevantLocation {
  
  inline def apply(): SchemaRelevantLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelevantLocation]
  }
  
  extension [Self <: SchemaRelevantLocation](x: Self) {
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdNull: Self = StObject.set(x, "placeId", null)
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setRelationType(value: String): Self = StObject.set(x, "relationType", value.asInstanceOf[js.Any])
    
    inline def setRelationTypeNull: Self = StObject.set(x, "relationType", null)
    
    inline def setRelationTypeUndefined: Self = StObject.set(x, "relationType", js.undefined)
  }
}
