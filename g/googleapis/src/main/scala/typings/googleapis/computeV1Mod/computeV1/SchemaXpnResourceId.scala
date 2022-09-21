package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaXpnResourceId extends StObject {
  
  /**
    * The ID of the service resource. In the case of projects, this field supports project id (e.g., my-project-123) and project number (e.g. 12345678).
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the service resource.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaXpnResourceId {
  
  inline def apply(): SchemaXpnResourceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaXpnResourceId]
  }
  
  extension [Self <: SchemaXpnResourceId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
