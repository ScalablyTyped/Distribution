package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUpgradeInstanceRequest extends StObject {
  
  /**
    * Optional. The optional UpgradeType. Setting this field will search for additional compute images to upgrade this instance.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaUpgradeInstanceRequest {
  
  inline def apply(): SchemaUpgradeInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpgradeInstanceRequest]
  }
  
  extension [Self <: SchemaUpgradeInstanceRequest](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
