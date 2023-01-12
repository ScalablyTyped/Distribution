package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedInputDefaults extends StObject {
  
  var aliases: Any
  
  var definitions: Any
}
object MaskedInputDefaults {
  
  inline def apply(aliases: Any, definitions: Any): MaskedInputDefaults = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaskedInputDefaults] (val x: Self) extends AnyVal {
    
    inline def setAliases(value: Any): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setDefinitions(value: Any): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
  }
}
