package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateFooterResponse extends StObject {
  
  /**
    * The ID of the created footer.
    */
  var footerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCreateFooterResponse {
  
  inline def apply(): SchemaCreateFooterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateFooterResponse]
  }
  
  extension [Self <: SchemaCreateFooterResponse](x: Self) {
    
    inline def setFooterId(value: String): Self = StObject.set(x, "footerId", value.asInstanceOf[js.Any])
    
    inline def setFooterIdNull: Self = StObject.set(x, "footerId", null)
    
    inline def setFooterIdUndefined: Self = StObject.set(x, "footerId", js.undefined)
  }
}
