package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reroutes a line such that it&#39;s connected at the two closest connection
  * sites on the connected page elements.
  */
trait SchemaRerouteLineRequest extends StObject {
  
  /**
    * The object ID of the line to reroute.  Only a line with a category
    * indicating it is a &quot;connector&quot; can be rerouted. The start and
    * end connections of the line must be on different page elements.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaRerouteLineRequest {
  
  inline def apply(): SchemaRerouteLineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRerouteLineRequest]
  }
  
  extension [Self <: SchemaRerouteLineRequest](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
