package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Additional information returned to client, such as debugging
  * information.
  */
trait SchemaResponseMetadata extends StObject {
  
  /**
    * A unique id associated with this call. This id is logged for tracking
    * purposes.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object SchemaResponseMetadata {
  
  inline def apply(): SchemaResponseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponseMetadata]
  }
  
  extension [Self <: SchemaResponseMetadata](x: Self) {
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
