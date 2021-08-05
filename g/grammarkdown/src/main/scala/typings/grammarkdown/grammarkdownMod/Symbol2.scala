package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Symbol2 extends StObject {
  
  var id: Double
  
  var kind: SymbolKind
  
  var locals: js.UndefOr[SymbolTable] = js.undefined
  
  var name: String
  
  var parent: js.UndefOr[Symbol2] = js.undefined
}
object Symbol2 {
  
  inline def apply(id: Double, kind: SymbolKind, name: String): Symbol2 = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Symbol2]
  }
  
  extension [Self <: Symbol2](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLocals(value: SymbolTable): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
    
    inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Symbol2): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
