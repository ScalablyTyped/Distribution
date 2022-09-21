package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRosterId extends StObject {
  
  /**
    * Opaque, server-assigned ID of the Roster.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaRosterId {
  
  inline def apply(): SchemaRosterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRosterId]
  }
  
  extension [Self <: SchemaRosterId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
