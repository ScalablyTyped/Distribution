package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitDefinition extends StObject {
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var definition: js.UndefOr[String | Unit] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var prefixes: js.UndefOr[String] = js.undefined
}
object UnitDefinition {
  
  inline def apply(): UnitDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitDefinition]
  }
  
  extension [Self <: UnitDefinition](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    inline def setDefinition(value: String | Unit): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPrefixes(value: String): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
  }
}
