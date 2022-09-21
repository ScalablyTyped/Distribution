package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevertClientResponse extends StObject {
  
  /**
    * Client as it appears in the latest container version since the last workspace synchronization operation. If no client is present, that means the client was deleted in the latest container version.
    */
  var client: js.UndefOr[SchemaClient] = js.undefined
}
object SchemaRevertClientResponse {
  
  inline def apply(): SchemaRevertClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevertClientResponse]
  }
  
  extension [Self <: SchemaRevertClientResponse](x: Self) {
    
    inline def setClient(value: SchemaClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
  }
}
