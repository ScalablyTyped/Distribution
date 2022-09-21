package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlacementPolicy extends StObject {
  
  /**
    * The type of placement.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlacementPolicy {
  
  inline def apply(): SchemaPlacementPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlacementPolicy]
  }
  
  extension [Self <: SchemaPlacementPolicy](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
