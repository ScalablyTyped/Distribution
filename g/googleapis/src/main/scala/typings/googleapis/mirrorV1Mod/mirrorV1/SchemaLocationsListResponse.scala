package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of Locations. This is the response from the server to GET requests
  * on the locations collection.
  */
trait SchemaLocationsListResponse extends StObject {
  
  /**
    * The list of locations.
    */
  var items: js.UndefOr[js.Array[SchemaLocation]] = js.undefined
  
  /**
    * The type of resource. This is always mirror#locationsList.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaLocationsListResponse {
  
  inline def apply(): SchemaLocationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationsListResponse]
  }
  
  extension [Self <: SchemaLocationsListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SchemaLocation]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaLocation*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
