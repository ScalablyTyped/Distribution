package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNameAndKind extends StObject {
  
  /**
    * Counter aggregation kind.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the counter.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaNameAndKind {
  
  inline def apply(): SchemaNameAndKind = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNameAndKind]
  }
  
  extension [Self <: SchemaNameAndKind](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
