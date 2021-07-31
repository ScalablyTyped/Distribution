package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskedInputDefaults extends StObject {
  
  var aliases: js.Any
  
  var definitions: js.Any
}
object MaskedInputDefaults {
  
  @scala.inline
  def apply(aliases: js.Any, definitions: js.Any): MaskedInputDefaults = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskedInputDefaults]
  }
  
  @scala.inline
  implicit class MaskedInputDefaultsMutableBuilder[Self <: MaskedInputDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Any): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitions(value: js.Any): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
  }
}
