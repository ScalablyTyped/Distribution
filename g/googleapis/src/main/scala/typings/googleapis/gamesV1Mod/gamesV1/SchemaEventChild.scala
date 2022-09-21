package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventChild extends StObject {
  
  /**
    * The ID of the child event.
    */
  var childId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#eventChild`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventChild {
  
  inline def apply(): SchemaEventChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventChild]
  }
  
  extension [Self <: SchemaEventChild](x: Self) {
    
    inline def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
    
    inline def setChildIdNull: Self = StObject.set(x, "childId", null)
    
    inline def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
