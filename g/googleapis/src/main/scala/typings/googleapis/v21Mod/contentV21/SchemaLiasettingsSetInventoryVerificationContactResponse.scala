package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLiasettingsSetInventoryVerificationContactResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#liasettingsSetInventoryVerificationContactResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaLiasettingsSetInventoryVerificationContactResponse {
  
  inline def apply(): SchemaLiasettingsSetInventoryVerificationContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiasettingsSetInventoryVerificationContactResponse]
  }
  
  extension [Self <: SchemaLiasettingsSetInventoryVerificationContactResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
