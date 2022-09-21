package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteEmbeddedObjectRequest extends StObject {
  
  /**
    * The ID of the embedded object to delete.
    */
  var objectId: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDeleteEmbeddedObjectRequest {
  
  inline def apply(): SchemaDeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteEmbeddedObjectRequest]
  }
  
  extension [Self <: SchemaDeleteEmbeddedObjectRequest](x: Self) {
    
    inline def setObjectId(value: Double): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
