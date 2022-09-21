package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateImageResponse extends StObject {
  
  /**
    * The object ID of the created image.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateImageResponse {
  
  inline def apply(): SchemaCreateImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateImageResponse]
  }
  
  extension [Self <: SchemaCreateImageResponse](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
