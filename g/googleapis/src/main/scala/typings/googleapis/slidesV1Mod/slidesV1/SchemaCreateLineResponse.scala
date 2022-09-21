package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateLineResponse extends StObject {
  
  /**
    * The object ID of the created line.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateLineResponse {
  
  inline def apply(): SchemaCreateLineResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateLineResponse]
  }
  
  extension [Self <: SchemaCreateLineResponse](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
