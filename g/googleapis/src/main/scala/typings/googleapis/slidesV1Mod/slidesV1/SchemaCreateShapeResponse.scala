package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateShapeResponse extends StObject {
  
  /**
    * The object ID of the created shape.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateShapeResponse {
  
  inline def apply(): SchemaCreateShapeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateShapeResponse]
  }
  
  extension [Self <: SchemaCreateShapeResponse](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
