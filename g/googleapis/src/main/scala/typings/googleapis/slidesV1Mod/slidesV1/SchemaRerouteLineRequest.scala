package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRerouteLineRequest extends StObject {
  
  /**
    * The object ID of the line to reroute. Only a line with a category indicating it is a "connector" can be rerouted. The start and end connections of the line must be on different page elements.
    */
  var objectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRerouteLineRequest {
  
  inline def apply(): SchemaRerouteLineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRerouteLineRequest]
  }
  
  extension [Self <: SchemaRerouteLineRequest](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdNull: Self = StObject.set(x, "objectId", null)
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
