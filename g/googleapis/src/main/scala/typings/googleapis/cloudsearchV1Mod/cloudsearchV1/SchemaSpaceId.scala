package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSpaceId extends StObject {
  
  /**
    * Unique, immutable ID of the Space
    */
  var spaceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSpaceId {
  
  inline def apply(): SchemaSpaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSpaceId]
  }
  
  extension [Self <: SchemaSpaceId](x: Self) {
    
    inline def setSpaceId(value: String): Self = StObject.set(x, "spaceId", value.asInstanceOf[js.Any])
    
    inline def setSpaceIdNull: Self = StObject.set(x, "spaceId", null)
    
    inline def setSpaceIdUndefined: Self = StObject.set(x, "spaceId", js.undefined)
  }
}
