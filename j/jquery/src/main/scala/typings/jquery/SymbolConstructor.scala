package typings.jquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolConstructor extends StObject {
  
  /**
    * A String value that is used in the creation of the default string description of an object.
    * Called by the built-in method Object.prototype.toString.
    */
  val toStringTag: js.Symbol = js.native
}
object SymbolConstructor {
  
  @scala.inline
  def apply(toStringTag: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal(toStringTag = toStringTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolConstructor]
  }
  
  @scala.inline
  implicit class SymbolConstructorMutableBuilder[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToStringTag(value: js.Symbol): Self = StObject.set(x, "toStringTag", value.asInstanceOf[js.Any])
  }
}
