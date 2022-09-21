package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAliasContext extends StObject {
  
  /**
    * The alias kind.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The alias name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaAliasContext {
  
  inline def apply(): SchemaAliasContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAliasContext]
  }
  
  extension [Self <: SchemaAliasContext](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
