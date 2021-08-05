package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedInputDefaults extends StObject {
  
  var aliases: js.Any
  
  var definitions: js.Any
}
object MaskedInputDefaults {
  
  inline def apply(aliases: js.Any, definitions: js.Any): MaskedInputDefaults = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputDefaults]
  }
  
  extension [Self <: MaskedInputDefaults](x: Self) {
    
    inline def setAliases(value: js.Any): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setDefinitions(value: js.Any): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
  }
}
