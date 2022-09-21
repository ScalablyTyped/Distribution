package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateHeaderResponse extends StObject {
  
  /**
    * The ID of the created header.
    */
  var headerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateHeaderResponse {
  
  inline def apply(): SchemaCreateHeaderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateHeaderResponse]
  }
  
  extension [Self <: SchemaCreateHeaderResponse](x: Self) {
    
    inline def setHeaderId(value: String): Self = StObject.set(x, "headerId", value.asInstanceOf[js.Any])
    
    inline def setHeaderIdNull: Self = StObject.set(x, "headerId", null)
    
    inline def setHeaderIdUndefined: Self = StObject.set(x, "headerId", js.undefined)
  }
}
