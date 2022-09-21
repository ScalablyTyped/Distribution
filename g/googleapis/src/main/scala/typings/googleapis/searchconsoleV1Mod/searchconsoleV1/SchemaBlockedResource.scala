package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBlockedResource extends StObject {
  
  /**
    * URL of the blocked resource.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaBlockedResource {
  
  inline def apply(): SchemaBlockedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlockedResource]
  }
  
  extension [Self <: SchemaBlockedResource](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
