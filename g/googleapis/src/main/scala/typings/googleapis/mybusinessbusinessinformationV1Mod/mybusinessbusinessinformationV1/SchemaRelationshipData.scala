package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRelationshipData extends StObject {
  
  /**
    * The list of children locations that this location has relations with.
    */
  var childrenLocations: js.UndefOr[js.Array[SchemaRelevantLocation]] = js.undefined
  
  /**
    * The resource name of the Chain that this location is member of. How to find Chain ID
    */
  var parentChain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The parent location that this location has relations with.
    */
  var parentLocation: js.UndefOr[SchemaRelevantLocation] = js.undefined
}
object SchemaRelationshipData {
  
  inline def apply(): SchemaRelationshipData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelationshipData]
  }
  
  extension [Self <: SchemaRelationshipData](x: Self) {
    
    inline def setChildrenLocations(value: js.Array[SchemaRelevantLocation]): Self = StObject.set(x, "childrenLocations", value.asInstanceOf[js.Any])
    
    inline def setChildrenLocationsUndefined: Self = StObject.set(x, "childrenLocations", js.undefined)
    
    inline def setChildrenLocationsVarargs(value: SchemaRelevantLocation*): Self = StObject.set(x, "childrenLocations", js.Array(value*))
    
    inline def setParentChain(value: String): Self = StObject.set(x, "parentChain", value.asInstanceOf[js.Any])
    
    inline def setParentChainNull: Self = StObject.set(x, "parentChain", null)
    
    inline def setParentChainUndefined: Self = StObject.set(x, "parentChain", js.undefined)
    
    inline def setParentLocation(value: SchemaRelevantLocation): Self = StObject.set(x, "parentLocation", value.asInstanceOf[js.Any])
    
    inline def setParentLocationUndefined: Self = StObject.set(x, "parentLocation", js.undefined)
  }
}
