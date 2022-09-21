package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRoadInfo extends StObject {
  
  /**
    * Road has signage discouraging or prohibiting use by the general public. E.g., roads with signs that say "Private", or "No trespassing."
    */
  var isPrivate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaRoadInfo {
  
  inline def apply(): SchemaRoadInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoadInfo]
  }
  
  extension [Self <: SchemaRoadInfo](x: Self) {
    
    inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    inline def setIsPrivateNull: Self = StObject.set(x, "isPrivate", null)
    
    inline def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
  }
}
