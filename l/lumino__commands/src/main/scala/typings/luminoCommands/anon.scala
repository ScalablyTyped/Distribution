package typings.luminoCommands

import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@lumino/commands.@lumino/commands.CommandRegistry.Description> */
  trait PartialDescription extends StObject {
    
    var args: js.UndefOr[ReadonlyJSONObject | Null] = js.undefined
  }
  object PartialDescription {
    
    inline def apply(): PartialDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialDescription] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsNull: Self = StObject.set(x, "args", null)
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    }
  }
}
