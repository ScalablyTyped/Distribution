package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCollectionStatusDestinationStatus extends StObject {
  
  /**
    * The name of the destination
    */
  var destination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The status for the specified destination in the collections target country.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaCollectionStatusDestinationStatus {
  
  inline def apply(): SchemaCollectionStatusDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionStatusDestinationStatus]
  }
  
  extension [Self <: SchemaCollectionStatusDestinationStatus](x: Self) {
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
